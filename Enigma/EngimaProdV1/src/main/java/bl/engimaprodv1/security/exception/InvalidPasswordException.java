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
public class InvalidPasswordException extends Exception {
    
    public InvalidPasswordException(String message) {
        super(message);
    }
    
    public InvalidPasswordException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
