package bl.enigmadb.v1.enigma;

public class EnigmaException extends Exception {
    
    public EnigmaException() {
        super();
    }
    
    public EnigmaException(String message) {
        super(message);
    }
    
    public EnigmaException(String message, Throwable cause) {
        super(message, cause);
    }
    
}