/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.enigmadevv2.enigma;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Boone
 */
public class EnigmaVC {
    
    private final int QUANTITY_OF_EVC_ARRAYS = 32;
    
    public int getQuantEVC() {
        return QUANTITY_OF_EVC_ARRAYS;
    }
    
    private final String[] EVC_0 = {
        "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
        "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
        "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
        "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d",
        "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
        "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
        "y", "z", "!", "@", "#", "$", "%", "&", "?"
    };

    private final String[] EVC_1 = {"b", "Y", "%", "M", "z", "l", "U", "f", "!", "S", "X", "J", "2", "L", "8", "K", "t", "O", "h", "R", "0", "p", "W", "o", "I", "x", "m", "n", "5", "T", "1", "3", "P", "&", "D", "E", "v", "j", "N", "s", "#", "d", "4", "V", "@", "k", "?", "C", "y", "i", "e", "A", "q", "G", "c", "6", "r", "9", "a", "B", "u", "Q", "$", "H", "F", "7", "g", "Z", "w"};
    private final String[] EVC_2 = {"L", "u", "3", "l", "r", "9", "v", "$", "p", "D", "F", "s", "q", "E", "4", "P", "2", "Z", "o", "O", "8", "G", "m", "h", "V", "y", "j", "#", "C", "!", "J", "f", "5", "T", "I", "&", "@", "7", "W", "B", "d", "k", "H", "K", "n", "g", "?", "N", "a", "6", "x", "U", "t", "R", "%", "Y", "i", "1", "z", "M", "A", "w", "S", "b", "X", "e", "c", "0", "Q"};
    private final String[] EVC_3 = {"l", "#", "i", "T", "U", "G", "W", "s", "N", "$", "9", "a", "r", "I", "v", "F", "p", "y", "V", "2", "7", "L", "%", "n", "Z", "4", "5", "!", "u", "E", "h", "k", "0", "R", "Y", "6", "D", "x", "C", "8", "@", "f", "j", "Q", "3", "w", "O", "e", "A", "P", "t", "M", "g", "B", "z", "d", "?", "m", "&", "c", "o", "H", "K", "X", "S", "q", "1", "b", "J"};
    private final String[] EVC_4 = {"c", "j", "t", "F", "z", "#", "s", "5", "N", "8", "J", "d", "?", "6", "W", "2", "&", "Q", "!", "A", "4", "n", "V", "k", "Y", "C", "I", "R", "o", "M", "m", "9", "U", "0", "i", "p", "P", "1", "h", "Z", "e", "w", "E", "H", "K", "@", "v", "O", "b", "x", "S", "$", "g", "7", "f", "l", "r", "3", "a", "y", "u", "%", "D", "X", "B", "L", "q", "G", "T"};
    private final String[] EVC_5 = {"w", "B", "u", "W", "d", "R", "k", "D", "Y", "G", "3", "V", "o", "S", "7", "$", "M", "F", "A", "p", "s", "N", "f", "H", "i", "@", "n", "Z", "v", "8", "L", "r", "0", "X", "x", "g", "y", "5", "I", "t", "?", "K", "h", "2", "e", "#", "%", "&", "U", "Q", "b", "a", "4", "c", "O", "C", "6", "j", "z", "q", "T", "9", "m", "1", "!", "J", "l", "E", "P"};
    private final String[] EVC_6 = {"2", "5", "#", "y", "H", "W", "w", "!", "U", "%", "V", "@", "n", "G", "B", "s", "h", "6", "X", "P", "m", "Y", "l", "0", "a", "I", "C", "&", "k", "b", "1", "q", "M", "g", "o", "8", "J", "z", "9", "K", "i", "?", "7", "v", "d", "f", "$", "t", "O", "u", "T", "A", "j", "R", "N", "r", "3", "E", "F", "c", "D", "x", "S", "e", "4", "Q", "L", "Z", "p"};
    private final String[] EVC_7 = {"7", "t", "k", "O", "8", "V", "X", "u", "f", "&", "E", "l", "P", "S", "b", "g", "2", "s", "Z", "e", "$", "C", "R", "n", "K", "#", "c", "N", "4", "q", "w", "B", "1", "L", "D", "M", "G", "o", "d", "x", "a", "v", "r", "%", "m", "6", "p", "5", "F", "i", "h", "I", "3", "A", "T", "@", "H", "?", "y", "j", "Q", "Y", "z", "W", "9", "U", "J", "0", "!"};
    private final String[] EVC_8 = {"I", "y", "c", "Q", "o", "#", "T", "!", "A", "K", "t", "C", "X", "?", "2", "7", "D", "%", "3", "M", "6", "L", "G", "s", "f", "g", "w", "r", "R", "Y", "5", "V", "m", "e", "O", "l", "b", "a", "$", "9", "H", "n", "p", "@", "v", "P", "&", "j", "z", "E", "W", "J", "i", "u", "d", "q", "8", "F", "4", "0", "k", "Z", "x", "N", "U", "S", "h", "1", "B"};
    private final String[] EVC_9 = {"m", "R", "G", "j", "J", "E", "X", "4", "5", "H", "W", "Y", "@", "w", "c", "z", "C", "i", "u", "I", "l", "B", "Z", "O", "U", "3", "%", "d", "v", "A", "P", "y", "g", "1", "T", "&", "2", "o", "M", "F", "q", "p", "k", "N", "9", "e", "h", "6", "K", "L", "b", "n", "0", "7", "x", "!", "8", "Q", "a", "t", "?", "#", "$", "s", "D", "f", "S", "V", "r"};
    private final String[] EVC_10 = {"c", "p", "j", "9", "q", "t", "3", "#", "0", "i", "&", "v", "B", "N", "k", "C", "@", "h", "6", "L", "7", "f", "F", "w", "g", "G", "O", "T", "4", "W", "s", "S", "E", "D", "V", "R", "x", "y", "r", "H", "a", "o", "P", "n", "A", "e", "Y", "I", "%", "M", "l", "z", "1", "5", "Q", "!", "J", "b", "$", "d", "K", "2", "m", "8", "u", "?", "X", "U", "Z"};
    private final String[] EVC_11 = {"K", "4", "m", "k", "e", "i", "P", "d", "u", "#", "L", "!", "A", "v", "S", "l", "@", "O", "3", "c", "%", "x", "$", "X", "f", "D", "T", "Y", "2", "h", "b", "a", "1", "s", "&", "J", "F", "o", "9", "8", "Q", "w", "6", "g", "Z", "q", "R", "H", "?", "B", "j", "t", "r", "C", "n", "V", "M", "5", "U", "z", "E", "p", "0", "y", "7", "G", "I", "N", "W"};
    private final String[] EVC_12 = {"i", "f", "N", "H", "$", "&", "w", "O", "M", "3", "X", "m", "g", "B", "K", "a", "s", "Q", "1", "I", "q", "2", "x", "A", "5", "k", "W", "h", "T", "#", "C", "r", "@", "b", "z", "j", "u", "R", "t", "J", "7", "S", "G", "%", "V", "L", "E", "e", "n", "v", "!", "U", "?", "p", "Z", "4", "Y", "o", "d", "F", "0", "8", "9", "D", "6", "y", "P", "l", "c"};
    private final String[] EVC_13 = {"a", "9", "T", "r", "K", "E", "?", "s", "5", "V", "L", "U", "u", "p", "M", "n", "$", "D", "0", "f", "!", "b", "i", "R", "x", "v", "c", "8", "g", "j", "Q", "o", "J", "2", "S", "F", "C", "A", "N", "q", "H", "O", "P", "@", "7", "B", "m", "I", "3", "%", "z", "&", "Y", "G", "4", "1", "W", "e", "d", "Z", "h", "y", "k", "w", "l", "X", "#", "6", "t"};
    private final String[] EVC_14 = {"2", "Q", "6", "r", "i", "p", "V", "j", "?", "G", "W", "H", "q", "k", "R", "Y", "4", "b", "5", "t", "N", "s", "K", "x", "3", "1", "9", "O", "8", "T", "X", "z", "#", "7", "e", "u", "c", "@", "d", "L", "M", "U", "0", "a", "F", "n", "P", "m", "f", "!", "g", "v", "I", "$", "E", "C", "S", "h", "%", "J", "B", "Z", "y", "A", "l", "&", "D", "w", "o"};
    private final String[] EVC_15 = {"O", "Q", "B", "c", "y", "p", "M", "8", "E", "S", "e", "q", "L", "7", "0", "N", "X", "A", "!", "4", "h", "v", "l", "z", "%", "H", "5", "g", "s", "x", "a", "J", "R", "6", "j", "F", "K", "i", "r", "P", "T", "n", "2", "t", "u", "C", "&", "I", "d", "3", "Y", "D", "U", "w", "?", "m", "o", "#", "9", "Z", "W", "k", "G", "1", "f", "@", "V", "$", "b"};
    private final String[] EVC_16 = {"R", "y", "x", "P", "V", "?", "v", "U", "Z", "q", "n", "2", "w", "u", "B", "!", "$", "7", "H", "d", "p", "I", "F", "k", "t", "G", "T", "0", "3", "E", "O", "l", "Y", "1", "Q", "C", "i", "A", "b", "a", "s", "4", "N", "6", "&", "g", "%", "e", "c", "h", "z", "X", "K", "8", "5", "m", "M", "r", "@", "S", "L", "o", "D", "W", "J", "f", "j", "#", "9"};
    private final String[] EVC_17 = {"8", "h", "#", "x", "g", "3", "u", "9", "5", "!", "A", "o", "m", "b", "6", "E", "n", "k", "L", "t", "G", "q", "D", "M", "?", "2", "Y", "C", "y", "7", "v", "K", "f", "P", "S", "W", "J", "T", "i", "O", "I", "d", "V", "B", "0", "s", "w", "F", "U", "H", "c", "z", "e", "r", "a", "p", "Q", "4", "l", "%", "X", "N", "1", "j", "$", "Z", "@", "R", "&"};
    private final String[] EVC_18 = {"#", "%", "7", "f", "m", "c", "o", "Z", "W", "z", "d", "T", "I", "y", "B", "5", "h", "Q", "!", "3", "?", "V", "O", "@", "M", "R", "a", "F", "v", "9", "k", "u", "L", "N", "D", "8", "i", "P", "w", "l", "1", "G", "e", "q", "E", "b", "r", "j", "Y", "4", "H", "s", "A", "K", "$", "n", "6", "g", "J", "p", "C", "&", "X", "2", "0", "x", "S", "t", "U"};
    private final String[] EVC_19 = {"3", "Q", "4", "b", "I", "y", "Y", "R", "c", "P", "7", "o", "k", "N", "g", "F", "u", "X", "@", "$", "f", "%", "v", "K", "8", "&", "C", "M", "W", "E", "1", "d", "T", "?", "p", "5", "q", "a", "O", "#", "D", "m", "B", "!", "2", "S", "l", "A", "n", "i", "r", "h", "L", "t", "H", "x", "0", "j", "s", "6", "Z", "e", "w", "J", "U", "V", "z", "9", "G"};
    private final String[] EVC_20 = {"v", "f", "8", "m", "&", "7", "Q", "#", "Z", "J", "k", "e", "H", "p", "0", "j", "L", "?", "O", "P", "%", "1", "o", "x", "a", "i", "b", "R", "6", "y", "X", "W", "t", "5", "q", "h", "D", "d", "M", "w", "s", "!", "K", "r", "2", "$", "g", "Y", "V", "S", "z", "C", "F", "9", "G", "@", "E", "l", "U", "I", "N", "B", "n", "c", "A", "T", "u", "3", "4"};
    private final String[] EVC_21 = {"D", "d", "P", "c", "?", "x", "u", "6", "s", "J", "G", "S", "l", "M", "m", "C", "o", "f", "N", "!", "9", "B", "$", "@", "#", "&", "g", "8", "z", "t", "b", "H", "R", "U", "L", "X", "e", "K", "p", "A", "k", "h", "i", "0", "%", "4", "2", "a", "O", "W", "V", "j", "Y", "3", "T", "v", "I", "q", "Z", "5", "F", "Q", "y", "r", "n", "w", "E", "7", "1"};
    private final String[] EVC_22 = {"Q", "Y", "Z", "G", "%", "l", "H", "V", "u", "t", "b", "M", "3", "L", "d", "I", "c", "7", "?", "z", "X", "y", "N", "j", "F", "4", "D", "9", "q", "$", "A", "s", "0", "g", "!", "a", "1", "@", "E", "r", "C", "w", "K", "O", "R", "&", "m", "v", "n", "S", "e", "6", "B", "5", "8", "p", "i", "#", "k", "T", "2", "x", "f", "h", "U", "P", "o", "W", "J"};
    private final String[] EVC_23 = {"9", "u", "r", "g", "p", "h", "T", "D", "$", "!", "j", "@", "1", "v", "e", "w", "A", "P", "6", "q", "3", "l", "y", "X", "7", "E", "t", "H", "m", "O", "W", "Q", "2", "Y", "5", "d", "#", "R", "G", "b", "%", "V", "F", "I", "4", "s", "B", "f", "0", "8", "U", "n", "o", "&", "k", "N", "c", "i", "x", "z", "K", "S", "C", "M", "Z", "?", "L", "a", "J"};
    private final String[] EVC_24 = {"K", "v", "H", "$", "J", "&", "4", "2", "U", "u", "g", "6", "l", "c", "D", "8", "i", "Z", "B", "O", "#", "r", "T", "z", "h", "?", "a", "W", "s", "k", "0", "F", "M", "x", "S", "Y", "p", "N", "n", "I", "Q", "@", "e", "q", "!", "X", "L", "E", "G", "f", "9", "b", "%", "C", "y", "d", "m", "j", "V", "P", "3", "7", "o", "5", "1", "R", "t", "A", "w"};
    private final String[] EVC_25 = {"q", "I", "A", "H", "4", "G", "a", "V", "Y", "d", "F", "X", "Q", "N", "o", "C", "P", "K", "r", "?", "x", "&", "w", "9", "8", "l", "e", "2", "3", "!", "Z", "6", "f", "J", "D", "T", "i", "M", "5", "s", "g", "O", "E", "u", "@", "7", "k", "p", "W", "#", "S", "B", "L", "n", "1", "m", "v", "z", "y", "R", "h", "0", "%", "c", "t", "U", "b", "j", "$"};
    private final String[] EVC_26 = {"2", "U", "F", "T", "8", "W", "6", "G", "u", "k", "E", "@", "o", "H", "&", "s", "1", "P", "D", "e", "#", "R", "r", "h", "x", "3", "X", "J", "K", "L", "9", "i", "C", "c", "m", "A", "f", "Y", "p", "z", "4", "a", "0", "B", "M", "O", "j", "d", "t", "b", "7", "N", "S", "g", "n", "%", "Z", "w", "y", "V", "I", "5", "q", "!", "?", "$", "l", "v", "Q"};
    private final String[] EVC_27 = {"6", "8", "2", "m", "s", "b", "0", "r", "H", "k", "!", "F", "P", "3", "O", "W", "7", "D", "j", "G", "$", "v", "g", "V", "L", "n", "w", "Q", "#", "x", "J", "f", "S", "R", "K", "T", "q", "4", "X", "a", "9", "e", "&", "1", "i", "5", "A", "@", "M", "%", "U", "I", "z", "N", "?", "y", "h", "u", "Y", "d", "p", "t", "B", "C", "l", "c", "o", "E", "Z"};
    private final String[] EVC_28 = {"x", "@", "V", "8", "F", "2", "b", "D", "L", "y", "v", "Y", "w", "i", "$", "P", "X", "m", "k", "0", "n", "j", "T", "A", "e", "q", "I", "W", "E", "a", "h", "o", "1", "Z", "u", "C", "&", "Q", "S", "K", "l", "!", "#", "B", "G", "O", "4", "H", "N", "%", "f", "z", "M", "c", "J", "g", "p", "7", "?", "5", "r", "R", "s", "6", "3", "d", "9", "t", "U"};
    private final String[] EVC_29 = {"Y", "G", "q", "@", "M", "W", "?", "%", "o", "p", "k", "$", "J", "O", "E", "4", "l", "D", "j", "R", "T", "6", "B", "L", "Z", "f", "i", "Q", "5", "C", "n", "N", "g", "2", "I", "s", "e", "h", "c", "8", "A", "0", "&", "S", "!", "#", "w", "d", "U", "x", "v", "a", "V", "X", "9", "m", "b", "y", "P", "u", "F", "z", "7", "t", "H", "r", "3", "K", "1"};
    private final String[] EVC_30 = {"R", "k", "I", "B", "&", "E", "Q", "P", "b", "h", "V", "$", "@", "g", "y", "l", "p", "!", "o", "H", "2", "S", "q", "m", "s", "G", "Z", "j", "X", "n", "4", "0", "?", "6", "r", "D", "v", "c", "W", "5", "7", "t", "u", "x", "w", "a", "Y", "e", "N", "f", "F", "T", "i", "8", "1", "3", "d", "A", "z", "C", "#", "M", "J", "9", "%", "O", "U", "L", "K"};
    private final String[] EVC_31 = {"o", "S", "U", "g", "f", "J", "I", "C", "q", "l", "u", "Q", "x", "a", "v", "V", "0", "O", "T", "s", "r", "n", "Y", "F", "X", "2", "9", "W", "z", "p", "4", "e", "H", "?", "6", "R", "c", "M", "y", "d", "Z", "m", "3", "K", "P", "i", "7", "D", "8", "L", "w", "B", "b", "A", "1", "&", "5", "%", "N", "!", "h", "j", "$", "E", "t", "#", "@", "k", "G"};
    private final String[] EVC_32 = {"5", "R", "$", "8", "Y", "B", "r", "u", "3", "m", "z", "C", "#", "N", "V", "Z", "y", "2", "H", "T", "D", "@", "6", "j", "?", "x", "M", "c", "P", "w", "X", "O", "i", "7", "G", "E", "1", "k", "0", "%", "K", "a", "e", "I", "g", "!", "U", "t", "S", "s", "l", "p", "9", "Q", "v", "h", "L", "d", "n", "W", "b", "J", "&", "4", "f", "A", "q", "o", "F"};
    private final String[] EVC_33 = {"C", "Z", "I", "z", "O", "U", "F", "L", "i", "0", "@", "k", "m", "T", "p", "o", "Y", "N", "V", "6", "r", "g", "H", "q", "?", "D", "y", "A", "J", "K", "7", "b", "5", "w", "a", "R", "%", "X", "B", "s", "Q", "h", "W", "&", "G", "x", "v", "8", "3", "f", "#", "d", "n", "t", "!", "$", "P", "S", "u", "E", "M", "1", "9", "c", "j", "2", "4", "l", "e"};
    private final String[] EVC_34 = {"Y", "C", "A", "V", "#", "O", "T", "B", "W", "i", "9", "8", "7", "?", "H", "Q", "G", "R", "5", "j", "J", "f", "@", "y", "u", "%", "e", "K", "E", "2", "S", "P", "p", "U", "t", "h", "a", "X", "o", "F", "c", "v", "1", "6", "n", "q", "k", "0", "N", "d", "L", "l", "4", "3", "D", "M", "g", "r", "&", "!", "Z", "s", "b", "$", "w", "z", "m", "x", "I"};
    private final String[] EVC_35 = {"A", "w", "8", "6", "G", "F", "C", "J", "?", "m", "Q", "e", "&", "7", "W", "f", "I", "P", "@", "R", "X", "V", "b", "p", "n", "5", "o", "2", "L", "x", "Z", "Y", "4", "a", "k", "d", "l", "M", "q", "!", "u", "y", "D", "j", "t", "B", "$", "g", "s", "%", "r", "c", "9", "U", "S", "T", "K", "h", "z", "3", "1", "#", "E", "N", "0", "v", "O", "i", "H"};
    private final String[] EVC_36 = {"l", "1", "L", "n", "2", "W", "C", "F", "#", "B", "5", "I", "v", "$", "H", "K", "X", "w", "&", "4", "3", "x", "%", "J", "?", "c", "Z", "e", "d", "u", "r", "s", "P", "t", "G", "g", "o", "A", "7", "N", "Q", "U", "p", "E", "S", "b", "z", "h", "q", "a", "R", "i", "M", "y", "6", "m", "D", "Y", "!", "0", "@", "O", "8", "V", "j", "9", "k", "f", "T"};
    private final String[] EVC_37 = {"l", "y", "w", "h", "F", "c", "C", "1", "D", "!", "r", "x", "q", "9", "d", "E", "G", "V", "N", "i", "4", "p", "A", "L", "R", "?", "&", "I", "O", "Z", "H", "n", "$", "W", "g", "0", "s", "2", "u", "a", "e", "5", "7", "m", "Q", "X", "b", "S", "6", "B", "%", "f", "U", "Y", "T", "8", "t", "z", "k", "j", "v", "K", "J", "#", "M", "3", "o", "P", "@"};
    private final String[] EVC_38 = {"h", "m", "5", "X", "n", "E", "9", "W", "U", "L", "#", "D", "a", "S", "q", "o", "d", "H", "4", "p", "0", "G", "!", "k", "8", "u", "7", "Y", "g", "%", "3", "A", "2", "V", "w", "i", "1", "c", "F", "T", "O", "6", "N", "C", "K", "l", "Q", "B", "@", "x", "v", "$", "J", "s", "z", "j", "P", "Z", "R", "b", "?", "I", "y", "e", "&", "r", "t", "f", "M"};
    private final String[] EVC_39 = {"l", "O", "E", "Q", "X", "?", "p", "x", "9", "6", "m", "8", "G", "R", "z", "5", "y", "t", "T", "7", "$", "Y", "L", "B", "I", "b", "D", "c", "0", "F", "e", "J", "q", "j", "a", "N", "&", "A", "P", "w", "Z", "H", "K", "#", "M", "1", "h", "3", "2", "S", "n", "U", "V", "!", "g", "s", "f", "@", "v", "k", "W", "o", "%", "d", "i", "C", "u", "4", "r"};
    private final String[] EVC_40 = {"h", "b", "s", "L", "v", "2", "g", "S", "c", "6", "Y", "K", "U", "V", "@", "&", "8", "O", "0", "t", "!", "l", "F", "x", "o", "P", "f", "A", "N", "#", "9", "?", "3", "J", "r", "G", "Z", "y", "w", "5", "i", "X", "H", "4", "I", "C", "e", "M", "1", "Q", "p", "7", "z", "$", "d", "B", "q", "R", "m", "W", "j", "a", "T", "E", "n", "u", "%", "k", "D"};
    private final String[] EVC_41 = {"l", "d", "e", "T", "R", "a", "p", "x", "5", "K", "V", "2", "Q", "!", "q", "C", "#", "v", "Z", "H", "L", "t", "?", "4", "w", "g", "8", "h", "j", "$", "M", "P", "F", "z", "X", "6", "1", "S", "i", "A", "n", "I", "Y", "k", "u", "O", "s", "c", "o", "0", "U", "3", "%", "@", "m", "f", "D", "W", "9", "G", "J", "7", "B", "b", "E", "&", "r", "N", "y"};
    private final String[] EVC_42 = {"c", "U", "x", "D", "8", "6", "B", "F", "V", "&", "n", "l", "p", "1", "4", "o", "S", "H", "3", "a", "h", "e", "L", "q", "Z", "0", "!", "N", "i", "r", "f", "E", "y", "@", "K", "P", "W", "9", "%", "O", "$", "I", "z", "k", "t", "u", "2", "j", "w", "C", "J", "G", "g", "7", "m", "X", "v", "A", "R", "b", "M", "Y", "Q", "s", "d", "?", "T", "5", "#"};
    private final String[] EVC_43 = {"S", "Q", "K", "E", "b", "i", "X", "e", "x", "d", "!", "M", "I", "t", "Y", "n", "f", "a", "4", "F", "m", "G", "U", "A", "7", "#", "8", "g", "u", "p", "v", "P", "z", "@", "k", "h", "5", "$", "c", "6", "3", "9", "y", "N", "q", "J", "2", "%", "L", "w", "B", "0", "V", "Z", "H", "W", "l", "D", "s", "r", "?", "o", "R", "O", "&", "C", "T", "1", "j"};
    private final String[] EVC_44 = {"d", "6", "q", "S", "g", "R", "?", "Q", "U", "X", "5", "I", "B", "v", "Y", "C", "F", "0", "K", "t", "M", "e", "P", "9", "N", "7", "r", "@", "$", "O", "%", "b", "k", "V", "H", "1", "m", "&", "l", "c", "s", "A", "u", "W", "3", "h", "z", "o", "4", "j", "#", "G", "f", "a", "8", "x", "p", "E", "!", "D", "y", "2", "n", "w", "J", "i", "T", "L", "Z"};
    private final String[] EVC_45 = {"P", "E", "S", "y", "L", "f", "$", "F", "2", "c", "3", "N", "w", "!", "e", "M", "#", "Z", "%", "j", "r", "D", "T", "z", "V", "C", "I", "O", "A", "U", "n", "6", "J", "W", "?", "p", "v", "h", "Y", "K", "&", "u", "q", "o", "b", "i", "5", "H", "d", "l", "B", "1", "9", "s", "4", "x", "X", "8", "Q", "m", "t", "a", "R", "G", "7", "k", "@", "g", "0"};
    private final String[] EVC_46 = {"z", "E", "%", "l", "T", "3", "N", "q", "Y", "R", "t", "1", "C", "X", "F", "4", "D", "?", "w", "v", "J", "#", "V", "8", "e", "G", "I", "H", "@", "$", "!", "o", "p", "b", "c", "k", "y", "5", "f", "2", "L", "U", "g", "n", "B", "7", "K", "0", "r", "O", "h", "M", "A", "u", "S", "i", "x", "&", "m", "W", "d", "P", "a", "Z", "Q", "s", "9", "j", "6"};
    private final String[] EVC_47 = {"B", "7", "L", "R", "F", "j", "f", "9", "@", "p", "y", "m", "n", "6", "N", "!", "s", "W", "M", "V", "k", "b", "c", "T", "U", "K", "?", "O", "l", "D", "z", "d", "Z", "J", "Y", "u", "%", "A", "C", "x", "e", "1", "o", "E", "h", "0", "#", "$", "2", "8", "a", "w", "P", "Q", "S", "&", "5", "3", "i", "G", "X", "t", "g", "v", "q", "r", "H", "I", "4"};
    private final String[] EVC_48 = {"Y", "V", "w", "u", "U", "N", "J", "l", "7", "#", "!", "G", "y", "i", "P", "?", "A", "T", "v", "F", "4", "R", "I", "M", "L", "K", "f", "q", "g", "m", "r", "9", "d", "O", "z", "1", "b", "6", "0", "C", "H", "k", "p", "W", "%", "@", "n", "x", "5", "X", "E", "Z", "j", "3", "Q", "$", "8", "2", "s", "S", "a", "h", "c", "D", "t", "o", "&", "B", "e"};
    private final String[] EVC_49 = {"W", "y", "f", "@", "?", "P", "e", "a", "z", "r", "8", "E", "A", "$", "w", "9", "5", "k", "c", "m", "g", "d", "u", "N", "!", "C", "H", "1", "&", "j", "l", "v", "Q", "p", "B", "x", "X", "#", "s", "I", "3", "b", "K", "T", "L", "%", "i", "6", "D", "0", "O", "G", "q", "7", "Y", "t", "2", "S", "U", "V", "J", "n", "Z", "h", "o", "M", "4", "F", "R"};
    private final String[] EVC_50 = {"L", "9", "G", "E", "U", "6", "K", "4", "h", "l", "1", "V", "B", "&", "$", "o", "7", "%", "q", "N", "2", "3", "e", "y", "W", "Z", "t", "i", "#", "P", "F", "b", "8", "0", "@", "C", "Y", "A", "R", "p", "x", "m", "d", "j", "J", "I", "r", "a", "g", "M", "c", "D", "!", "f", "w", "X", "z", "T", "k", "n", "H", "S", "5", "Q", "u", "s", "?", "O", "v"};
    private final String[] EVC_51 = {"A", "O", "y", "r", "q", "N", "c", "Z", "P", "M", "t", "W", "Q", "T", "?", "6", "K", "v", "E", "0", "X", "D", "a", "7", "#", "i", "5", "V", "G", "!", "U", "n", "l", "S", "f", "s", "8", "h", "m", "&", "b", "L", "2", "4", "z", "k", "B", "g", "F", "9", "I", "@", "w", "x", "e", "1", "J", "C", "3", "H", "j", "p", "d", "Y", "R", "u", "$", "o", "%"};
    private final String[] EVC_52 = {"o", "$", "N", "i", "q", "I", "3", "0", "v", "s", "Z", "M", "r", "R", "n", "1", "T", "W", "K", "j", "V", "!", "5", "Y", "J", "F", "2", "y", "6", "x", "u", "U", "g", "S", "h", "@", "P", "H", "B", "l", "e", "%", "f", "#", "a", "k", "9", "t", "8", "X", "z", "A", "b", "Q", "d", "c", "?", "m", "w", "L", "D", "C", "7", "E", "&", "G", "O", "p", "4"};
    private final String[] EVC_53 = {"f", "0", "J", "X", "E", "Y", "o", "C", "N", "#", "A", "1", "S", "B", "U", "6", "x", "7", "t", "&", "G", "W", "P", "u", "e", "3", "H", "I", "m", "F", "2", "c", "D", "l", "k", "@", "M", "a", "Q", "j", "w", "%", "h", "K", "i", "V", "v", "y", "?", "L", "s", "4", "O", "d", "r", "R", "5", "g", "b", "q", "$", "!", "8", "Z", "T", "p", "9", "n", "z"};
    private final String[] EVC_54 = {"!", "t", "m", "A", "r", "8", "P", "K", "l", "O", "B", "E", "3", "c", "C", "d", "U", "v", "6", "9", "I", "j", "2", "R", "D", "&", "y", "o", "0", "n", "G", "V", "H", "u", "N", "Z", "5", "x", "X", "J", "s", "b", "%", "q", "z", "g", "f", "a", "h", "F", "$", "W", "1", "p", "w", "T", "M", "S", "@", "Q", "L", "?", "k", "Y", "7", "4", "#", "i", "e"};
    private final String[] EVC_55 = {"S", "q", "X", "L", "c", "b", "T", "R", "f", "@", "l", "1", "7", "t", "v", "e", "n", "h", "8", "A", "P", "Z", "p", "N", "%", "#", "j", "4", "o", "G", "i", "Y", "u", "r", "M", "!", "z", "s", "d", "2", "U", "J", "5", "m", "H", "C", "O", "I", "a", "$", "x", "y", "E", "g", "?", "k", "K", "6", "9", "D", "B", "3", "V", "Q", "&", "F", "W", "w", "0"};
    private final String[] EVC_56 = {"z", "t", "w", "9", "v", "?", "e", "&", "o", "$", "J", "M", "Y", "A", "L", "d", "X", "P", "m", "I", "b", "c", "5", "r", "C", "Q", "S", "E", "7", "u", "n", "i", "p", "l", "a", "j", "8", "@", "y", "O", "3", "N", "#", "!", "4", "K", "g", "U", "R", "6", "W", "T", "q", "k", "F", "%", "H", "Z", "D", "h", "0", "1", "V", "2", "s", "f", "G", "x", "B"};
    private final String[] EVC_57 = {"R", "v", "B", "q", "x", "$", "2", "%", "G", "Q", "O", "C", "s", "o", "T", "i", "e", "H", "l", "f", "0", "W", "c", "E", "N", "F", "r", "U", "t", "&", "w", "!", "z", "Z", "g", "h", "I", "S", "3", "9", "y", "b", "X", "L", "A", "P", "D", "k", "#", "V", "5", "Y", "?", "d", "4", "7", "j", "1", "M", "@", "p", "u", "a", "J", "6", "n", "8", "K", "m"};
    private final String[] EVC_58 = {"P", "#", "t", "a", "c", "W", "A", "%", "O", "q", "h", "o", "V", "G", "E", "l", "e", "g", "8", "6", "Z", "p", "F", "9", "x", "N", "y", "3", "X", "1", "$", "w", "2", "?", "i", "K", "M", "I", "@", "T", "f", "S", "0", "5", "u", "r", "C", "7", "Q", "D", "z", "!", "H", "v", "d", "&", "4", "j", "L", "b", "Y", "s", "k", "n", "B", "J", "m", "U", "R"};
    private final String[] EVC_59 = {"E", "w", "r", "I", "e", "n", "P", "c", "m", "G", "&", "O", "W", "0", "$", "5", "6", "1", "V", "#", "D", "k", "Y", "X", "g", "H", "l", "d", "B", "u", "h", "%", "U", "a", "2", "y", "A", "v", "x", "j", "Z", "t", "F", "o", "f", "7", "9", "s", "!", "b", "?", "S", "4", "q", "z", "C", "R", "K", "L", "Q", "3", "N", "J", "@", "M", "T", "p", "8", "i"};
    private final String[] EVC_60 = {"C", "D", "s", "I", "r", "X", "R", "S", "F", "u", "A", "W", "%", "J", "y", "$", "4", "g", "0", "1", "#", "6", "x", "K", "T", "U", "V", "M", "@", "b", "N", "Y", "2", "8", "o", "O", "l", "Z", "m", "E", "j", "f", "?", "c", "e", "5", "h", "P", "&", "d", "B", "H", "L", "a", "G", "!", "z", "k", "3", "7", "9", "q", "i", "Q", "w", "t", "v", "p", "n"};
    private final String[] EVC_61 = {"R", "J", "@", "2", "P", "Z", "W", "u", "p", "E", "%", "T", "C", "M", "s", "O", "!", "I", "d", "U", "x", "k", "r", "w", "K", "g", "D", "G", "e", "N", "8", "q", "?", "X", "6", "F", "A", "n", "t", "4", "f", "1", "h", "Y", "o", "L", "#", "Q", "l", "y", "H", "m", "3", "&", "9", "b", "5", "$", "0", "j", "i", "7", "V", "c", "B", "z", "a", "v", "S"};
    private final String[] EVC_62 = {"Y", "$", "d", "V", "?", "x", "C", "j", "o", "D", "6", "Z", "S", "b", "T", "f", "w", "u", "%", "U", "q", "m", "I", "B", "k", "A", "N", "7", "r", "X", "l", "s", "n", "3", "F", "J", "h", "9", "y", "z", "K", "&", "G", "W", "0", "M", "E", "!", "a", "t", "2", "H", "1", "#", "e", "P", "@", "4", "c", "L", "Q", "p", "O", "i", "5", "v", "g", "8", "R"};
    private final String[] EVC_63 = {"w", "y", "E", "1", "@", "&", "a", "8", "n", "i", "q", "e", "G", "I", "f", "4", "5", "T", "t", "X", "b", "0", "K", "7", "x", "c", "J", "A", "?", "V", "Y", "l", "6", "U", "W", "o", "k", "D", "$", "j", "R", "2", "L", "C", "g", "u", "O", "z", "P", "r", "9", "B", "p", "H", "F", "3", "#", "s", "m", "S", "Q", "Z", "h", "!", "%", "v", "d", "M", "N"};
    private final String[] EVC_64 = {"9", "g", "F", "7", "@", "z", "Z", "N", "%", "p", "l", "I", "i", "s", "0", "e", "E", "6", "k", "U", "t", "X", "8", "o", "u", "$", "j", "r", "D", "A", "x", "C", "1", "m", "G", "Q", "M", "f", "Y", "q", "!", "y", "L", "2", "h", "c", "H", "S", "P", "B", "n", "5", "?", "T", "w", "3", "W", "d", "J", "b", "#", "v", "V", "K", "&", "a", "O", "4", "R"};
    private final String[] EVC_65 = {"M", "$", "i", "I", "r", "s", "S", "3", "D", "5", "9", "%", "O", "t", "j", "4", "f", "w", "b", "J", "k", "Z", "F", "1", "G", "q", "X", "Q", "d", "p", "V", "N", "Y", "v", "a", "7", "W", "A", "n", "0", "R", "B", "l", "y", "u", "?", "U", "L", "m", "&", "6", "o", "H", "g", "@", "K", "e", "C", "z", "T", "P", "x", "c", "h", "8", "E", "#", "!", "2"};
    private final String[] EVC_66 = {"T", "v", "g", "O", "h", "N", "R", "x", "b", "6", "5", "$", "G", "E", "?", "m", "2", "7", "1", "Z", "a", "B", "l", "w", "X", "W", "4", "S", "Q", "9", "0", "M", "I", "z", "k", "#", "Y", "K", "C", "@", "d", "t", "c", "j", "L", "r", "u", "H", "%", "J", "p", "i", "8", "A", "V", "D", "U", "3", "y", "f", "n", "F", "q", "e", "o", "s", "&", "!", "P"};
    private final String[] EVC_67 = {"O", "z", "q", "m", "?", "9", "I", "Q", "%", "G", "8", "A", "#", "h", "X", "t", "K", "Y", "x", "y", "i", "@", "l", "3", "P", "!", "e", "Z", "c", "g", "f", "0", "2", "p", "d", "H", "w", "L", "R", "a", "B", "M", "o", "D", "7", "V", "r", "6", "&", "n", "E", "N", "1", "$", "U", "S", "C", "J", "u", "j", "v", "4", "b", "W", "T", "F", "k", "5", "s"};
    private final String[] EVC_68 = {"S", "x", "n", "&", "c", "W", "N", "d", "7", "y", "R", "A", "5", "@", "0", "C", "z", "X", "f", "4", "#", "%", "v", "b", "Q", "E", "e", "i", "2", "s", "U", "9", "t", "M", "T", "j", "r", "K", "q", "u", "J", "B", "3", "k", "h", "o", "!", "l", "I", "8", "$", "P", "a", "1", "?", "p", "g", "w", "G", "D", "H", "V", "m", "L", "Z", "Y", "F", "6", "O"};
    private final String[] EVC_69 = {"k", "t", "H", "j", "&", "R", "r", "h", "L", "M", "W", "p", "4", "b", "v", "Z", "$", "?", "Q", "O", "F", "y", "%", "5", "0", "E", "Y", "s", "i", "V", "c", "n", "#", "S", "@", "e", "g", "m", "9", "N", "d", "a", "x", "6", "w", "2", "D", "q", "P", "l", "X", "1", "J", "G", "o", "A", "K", "3", "f", "C", "u", "T", "z", "!", "7", "I", "B", "8", "U"};

    
    public String[] getEVC(int i) throws EnigmaException {
        switch (i) {
            case 0: return EVC_0;
            case 1: return EVC_1;
            case 2: return EVC_2;
            case 3: return EVC_3;
            case 4: return EVC_4;
            case 5: return EVC_5;
            case 6: return EVC_6;
            case 7: return EVC_7;
            case 8: return EVC_8;
            case 9: return EVC_9;
            case 10: return EVC_10;
            case 11: return EVC_11;
            case 12: return EVC_12;
            case 13: return EVC_13;
            case 14: return EVC_14;
            case 15: return EVC_15;
            case 16: return EVC_16;
            case 17: return EVC_17;
            case 18: return EVC_18;
            case 19: return EVC_19;
            case 20: return EVC_20;
            case 21: return EVC_21;
            case 22: return EVC_22;
            case 23: return EVC_23;
            case 24: return EVC_24;
            case 25: return EVC_25;
            case 26: return EVC_26;
            case 27: return EVC_27;
            case 28: return EVC_28;
            case 29: return EVC_29;
            case 30: return EVC_30;
            case 31: return EVC_31;
            case 32: return EVC_32;
            case 33: return EVC_33;
            case 34: return EVC_34;
            case 35: return EVC_35;
            case 36: return EVC_36;
            case 37: return EVC_37;
            case 38: return EVC_38;
            case 39: return EVC_39;
            case 40: return EVC_40;
            case 41: return EVC_41;
            case 42: return EVC_42;
            case 43: return EVC_43;
            case 44: return EVC_44;
            case 45: return EVC_45;
            case 46: return EVC_46;
            case 47: return EVC_47;
            case 48: return EVC_48;
            case 49: return EVC_49;
            case 50: return EVC_50;
            case 51: return EVC_51;
            case 52: return EVC_52;
            case 53: return EVC_53;
            case 54: return EVC_54;
            case 55: return EVC_55;
            case 56: return EVC_56;
            case 57: return EVC_57;
            case 58: return EVC_58;
            case 59: return EVC_59;
            case 60: return EVC_60;
            case 61: return EVC_61;
            case 62: return EVC_62;
            case 63: return EVC_63;
            case 64: return EVC_64;
            case 65: return EVC_65;
            case 66: return EVC_66;
            case 67: return EVC_67;
            case 68: return EVC_68;
            case 69: return EVC_69;
            default: throw new EnigmaException("EVC not found.");
        }
    }
    
    //For Generating New Arrays ================================================
    public void buildAndPrintArray(int beginAt, int endAt) {
        for (int i = beginAt; i <= endAt; i++) {
            List<String> list = Arrays.asList(EVC_0);
            Collections.shuffle(list);

            String printMe = "private final String[] EVC_" + i + " = {";
            for (String s : list) {
                printMe += "\"" + s + "\"" + ", ";
            }
            printMe = printMe.substring(0, printMe.length() - 2);
            System.out.println(printMe + "};");  
        }
    }
    
    public void buildAndPrintSwitch(int beginAt, int endAt) {
        for (int i = beginAt; i <= endAt; i++) {
            System.out.println("case " + i + ": return EVC_" + i + ";"); 
        }
    }
    
}
