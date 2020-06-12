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
public class EnigmaEntity {
    
    private String encryptedPass;
    private String key;

    public EnigmaEntity(String encryptedPass, String key) {
        this.encryptedPass = encryptedPass;
        this.key = key;
    }

    public String getEncryptedPass() {
        return encryptedPass;
    }

    public void setEncryptedPass(String encryptedPass) {
        this.encryptedPass = encryptedPass;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    
}
