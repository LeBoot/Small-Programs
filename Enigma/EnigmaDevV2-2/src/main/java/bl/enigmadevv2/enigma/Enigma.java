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
public interface Enigma {
    
    /**
     * Compares a non-encrypted password against the encrypted password from an
     *  Enigma Entity.
     * @param input
     * @param ee
     * @return Returns true if the input exactly matches the encrypted password.
     * <p>Returns false if the input is incorrect or if an error occurs.</p>
     */
    boolean doPasswordsMatch(String input, EnigmaEntity ee);
    
    /**
     * Uniquely encrypts input and returns its Enigma Entity (encrypted password
     *  and its key).
     * <p>The encrypted password is exactly 64 characters long.
     *  The key is between 132 and 198 characters long.</p>
     * @param input
     * @return Enigma Entity (encrypted password and its key).
     * @throws EnigmaException if input is >64 characters, <4 characters,
     * comprised by non-ASCII characters, or an error occurs during processing.
     */
    EnigmaEntity encryptPassword(String input) throws EnigmaException;
    
    /**
     * Uniquely encrypts input and returns its Enigma Entity (encrypted password
     *  and its key).
     * <p>The encrypted password length is equal to outputLength.
     *  The key length is equal to or less than (4*outputLength + 7).</p>
     * @param input
     * @param outputLength
     * @param minInputLength
     * @param maxInputLength
     * @return Enigma Entity (encrypted password and its key).
     * @throws EnigmaException if input is longer than the maxInputLength, shorter 
     *  than the minInputLength, comprised by non-ASCII characters, or an error
     *  occurs during processing.
     */
    EnigmaEntity encryptPassword(String input, int outputLength, int minInputLength, int maxInputLength) throws EnigmaException;
    
}
