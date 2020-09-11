package bl.enigmadb.v1.enigma;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnigmaService {
    
    //IMPORTS ==================================================================
    @Autowired
    EnigmaEntityRepo enigmaEntityRepo;
    
    @Autowired
    EnigmaVCRepo vcRepo;
    
    Random rand = new Random();
    
    //CONSTANTS ================================================================
    private final int INPUT_LEN_MIN = 4;
    private final int INPUT_LEN_MAX = 64;
    private final int PASS_LEN_FINAL = 128;
    
    private final String DELIMITER = ":";
    private final String ERRMSG_INPUT_CHAR = "Your input must contain only Enlgish letters, numbers, and common special characters.  The following character is not allowed: ";
    private final String ERRMSG_INPUT_LEN = "Your input must be between " + INPUT_LEN_MIN + " and " + INPUT_LEN_MAX + " characters long (inclusively).";
    
    //PUBLIC METHODS ===========================================================
    public boolean doPasswordsMatch(String input, EnigmaEntity ee) {
        return input.equals(decrypt(ee));
    }
    
    public EnigmaEntity createEnigmaEntity(String input) throws EnigmaException {
        input = input.strip();
        validateInput(input);
        String key = buildNewKey(input);
        String encInput = encrypt(input, key);
        return enigmaEntityRepo.save(new EnigmaEntity(encInput, key));
    }

    //PRIVATE METHODS ==========================================================
    private String buildNewKey(String input) {
        //Get valid characters ------------------------
        int max = vcRepo.getCount();
        EnigmaVC vc = vcRepo.findById(rand.nextInt(max + 1)).orElse(vcRepo.getOne(1));
        String vcChar = vc.getVc();
        
        //Build new key -------------------------------
        String newKey = "";
        for (int i = 0; i < PASS_LEN_FINAL; i++) {
            int arIndex = rand.nextInt(vcChar.length());
            newKey += Integer.toString(arIndex) + DELIMITER;
        }
        
        //Add version and original length -------------
        newKey += Integer.toString(input.length()) + DELIMITER;
        newKey += Integer.toString(vc.getId());
        
        //Return --------------------------------------
        return newKey;
    }
    
    private String decrypt(EnigmaEntity ee) {
        String enc = ee.getPassword();
        String key = ee.getPasskey();
        int[] keyArr = dissectKey(key);
        String vc = getEnigmaVCFromKey(key).getVc();
        String vcLong = grow(vc, 2*PASS_LEN_FINAL);
        
        String dec = "";
        for (int i = 0; i < keyArr[keyArr.length - 2]; i++) {
            String sub = enc.substring(i, i+1);
            int placeInVCLong = vcLong.indexOf(sub, i + keyArr[i]);
            int originalIndex = placeInVCLong - keyArr[i];
            dec += vcLong.substring(originalIndex, originalIndex + 1);
        }
        return dec;
    }
    
    private int[] dissectKey(String key) {
        String[] arrStr = key.split(DELIMITER);
        int[] arrInt = new int[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            arrInt[i] = Integer.parseInt(arrStr[i]);
        }
        return arrInt;
    }
    
    private String encrypt(String input, String key) {
        EnigmaVC evc = getEnigmaVCFromKey(key);
        String evcStr = grow(evc.getVc(), 2*PASS_LEN_FINAL);
        int[] keyArr = dissectKey(key);
        input = grow(input, PASS_LEN_FINAL);
        
        String encPass = "";
        for (int i = 0; i < input.length(); i++) {
            String sub = input.substring(i, i+1);
            int j = evcStr.indexOf(sub, i);
            int k = j + keyArr[i];
            encPass += evcStr.substring(k, k+1);
        }
        return encPass;
    }
    
    private EnigmaVC getEnigmaVCFromKey(String key) {
        int[] keyArr = dissectKey(key);
        return vcRepo.findById(keyArr[keyArr.length - 1]).get();
    }
    
    private String grow(String s, int len) {
        while (s.length() < len) { s += s; }
        return s.substring(0, len);
    }
    
    private void validateInput(String input) throws EnigmaException {
        if (input.length() < INPUT_LEN_MIN || input.length() > INPUT_LEN_MAX) { throw new EnigmaException(ERRMSG_INPUT_LEN); }
        String validChars = vcRepo.findById(1).get().getVc();
        for (int i = 0; i < input.length(); i++) {
            String sub = input.substring(i, i+1);
            if (!validChars.contains(sub)) { throw new EnigmaException(ERRMSG_INPUT_CHAR + sub); }
        }
    }
}