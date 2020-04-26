/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.engimaprodv1.security.exception;

/**
 *
 * @author Boone
 */
public class InvalidKeyException extends Exception {
    
    public InvalidKeyException() {
        super();
    }
    
    public InvalidKeyException(String message) {
        super(message);
    }
    
    public InvalidKeyException(String message, Throwable cause) {
        super(message, cause);
    }
}
