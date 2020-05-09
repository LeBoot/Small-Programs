/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.enigmadevv2.enigma;

/**
 *
 * @author Boone
 */
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
