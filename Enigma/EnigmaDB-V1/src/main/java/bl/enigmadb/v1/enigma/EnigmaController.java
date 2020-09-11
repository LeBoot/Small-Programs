package bl.enigmadb.v1.enigma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EnigmaController {
    
    @Autowired
    EnigmaService service;
    
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    ResponseEntity<Object> test() {
//        try {
//            String input = "password";
//            EnigmaEntity ee = service.createEnigmaEntity(input);
//            return new ResponseEntity<>(ee, HttpStatus.OK);
//        } catch (EnigmaException ex) {
//            return new ResponseEntity<>(ex, HttpStatus.EXPECTATION_FAILED);
//        }
        
        try {
            String input = "password";
            EnigmaEntity ee = service.createEnigmaEntity(input);
            boolean response = service.doPasswordsMatch(input + "a", ee);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (EnigmaException ex) {
            return new ResponseEntity<>(ex, HttpStatus.EXPECTATION_FAILED);
        }
        
    }
}