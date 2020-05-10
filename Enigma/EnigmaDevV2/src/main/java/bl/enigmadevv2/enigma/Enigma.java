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
    
    EnigmaEntity encryptPassword(String input) throws EnigmaException;
    boolean doPasswordsMatch(String input, EnigmaEntity ee);
    
}
