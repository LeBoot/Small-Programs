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
        "y", "z", "!", "@", "#", "$", "%", "^", "&", "*",
        "(", ")", "-", "_", "+", "=", "`", "~", "{", "}",
        "[", "]", ";", "'", "?", "/", "|", ">", "<", ".",
        ",",
    };

    private final String[] EVC_1 = {"P", "N", "Y", "W", "C", "9", "U", "|", "5", "z", "^", "R", "J", "L", "7", "o", "E", "A", "b", "t", "H", "*", "0", "u", "_", "v", ";", "q", "[", "S", "p", "+", "n", "x", "F", "8", "c", "2", "4", "m", "k", "T", "<", "#", "%", "X", "g", "i", "!", ",", "Q", "@", "?", "{", "G", "I", "'", ">", "`", "6", "h", "y", "a", "~", "$", ".", "j", "D", "l", "V", "B", "&", "e", "/", "M", "3", "f", ")", "}", "s", "r", "]", "d", "w", "=", "O", "K", "Z", "(", "-", "1"};
    private final String[] EVC_2 = {"~", "_", "/", "P", ",", "m", "]", "'", "s", "l", "@", "C", "<", "%", "U", "a", "O", "j", "Y", "`", ";", "e", "3", "5", "D", "|", "K", ")", "0", "I", "d", "Q", "(", "!", "T", "v", "*", "R", "^", "X", "Z", "J", "F", "o", "n", "b", "-", "}", "4", "y", "g", "?", "A", "+", "S", "u", "9", "V", "2", "N", "c", "=", "p", "t", "#", "k", "q", "B", "{", "H", "f", "1", "L", "8", "w", "z", "M", "[", "E", ">", "7", "r", "W", "&", "$", ".", "x", "h", "i", "G", "6"};
    private final String[] EVC_3 = {"t", "Z", "h", "4", "T", "-", "@", "d", "0", "~", ",", ".", "K", "a", "M", "j", "v", "/", "D", "r", "W", "3", "O", "n", "N", "E", "q", "{", "B", "$", "y", "i", "l", "=", "|", "k", "F", "R", "#", "5", "b", "z", ";", "x", "s", "I", "J", "C", "S", "9", "p", "U", "!", "+", "c", "7", "w", "_", "[", "L", "(", "`", "6", "u", "X", "m", "o", "f", "&", "}", "V", "<", "?", "Q", "^", "]", "G", "A", "'", "P", ">", "*", "%", "H", "8", "2", "1", "e", "g", "Y", ")"};
    private final String[] EVC_4 = {"7", "4", "U", "[", "l", "I", "9", "e", "}", "a", "G", "q", "?", "@", "P", "u", "N", "B", "0", "j", "V", "^", "y", "5", "/", ">", "F", "z", "Y", ".", ",", ")", "K", "v", "6", "n", "&", ";", "|", "w", "X", "i", "m", "#", "2", "A", "b", "H", "k", "x", "t", "8", "R", "(", "r", "f", "%", "{", "E", "c", "*", "$", "g", "]", "p", "o", "h", "!", "O", "M", "L", "J", "W", "T", "D", "Q", "_", "~", "<", "C", "-", "d", "`", "s", "3", "=", "'", "S", "Z", "+", "1"};
    private final String[] EVC_5 = {"G", "k", "n", "?", "%", "}", "=", "1", "2", "P", "a", "-", "y", "W", "M", "w", "U", "E", "F", ";", "d", "0", "~", "[", ")", ">", "$", "S", "o", "J", "v", "C", "X", "e", "m", "V", "Q", "l", "{", "(", "|", "H", "9", "^", "s", "`", "R", "]", "Z", "5", "f", "Y", "h", "u", "c", "p", "x", "q", "&", "b", "O", "8", "L", "A", "*", "z", "g", "/", "#", "K", "N", "i", "'", "D", "!", "I", ",", "3", "T", "_", "t", "B", "6", "<", "+", "7", ".", "j", "r", "@", "4"};
    private final String[] EVC_6 = {"q", "O", "i", "v", "a", "p", "x", "Z", "[", "B", "n", "*", "Y", "L", "E", "g", ",", "I", "8", "e", "J", "/", "b", "2", "=", "o", "V", "z", "w", "R", "d", "_", "c", "`", "m", "3", "j", "C", "h", "D", "t", "7", "+", ">", "4", "$", "6", ")", "M", "f", "y", "l", "@", "'", "#", "T", "<", "s", "A", "0", "!", "H", "k", "5", "P", "F", "{", "~", "^", "9", ".", "N", "u", "-", "%", "U", "]", "(", "&", "X", "W", "1", "Q", "K", "?", "S", "G", "|", "r", "}", ";"};
    private final String[] EVC_7 = {"@", "{", ">", "F", "q", "^", "U", "h", "v", "=", "o", "*", "Z", "`", "t", "<", "l", "8", "+", "w", "?", ")", ";", "K", ",", "[", "9", "B", "(", "I", "T", "i", "~", "5", "-", ".", "V", "2", "R", "L", "G", "d", "M", "}", "C", "j", "3", "k", "O", "u", "n", "b", "#", "!", "W", "]", "g", "_", "A", "X", "D", "S", "a", "1", "p", "E", "N", "4", "s", "7", "c", "Q", "f", "$", "x", "|", "J", "y", "%", "e", "m", "z", "Y", "r", "P", "0", "H", "'", "/", "&", "6"};
    private final String[] EVC_8 = {"o", "0", "a", "N", "z", "&", ";", "1", "5", "W", "]", "Q", "8", "x", "R", "O", "T", "k", "V", "7", "{", "S", "i", "K", "e", ".", "I", "E", "g", "J", "n", "U", "p", "y", "`", "l", "d", "_", "+", "@", "|", "^", "q", "~", "X", "u", "G", "j", "m", "Y", "'", "w", ")", "f", "L", "*", "-", "c", ",", "A", "9", "Z", "!", "6", "=", "/", ">", "t", "b", "C", "v", "H", "[", "h", "s", "?", "$", "}", "D", "(", "B", "3", "P", "4", "#", "%", "2", "F", "M", "r", "<"};
    private final String[] EVC_9 = {"(", "0", "e", "E", "}", "`", "%", "~", "Z", "J", "'", "d", "g", "D", "&", "O", ",", "X", ">", "s", "w", "7", "q", ".", "5", "n", "/", "G", "i", ")", "l", "N", "|", "1", "m", "S", "?", "C", "H", "=", "k", "P", "W", "^", "M", "V", "h", "6", "2", "[", "R", "B", "o", "$", "F", "L", "K", "r", "+", "_", "A", "!", "z", "t", "<", ";", "{", "3", "8", "Y", "Q", "a", "T", "I", "U", "#", "4", "@", "c", "y", "b", "]", "v", "-", "u", "*", "x", "p", "f", "9", "j"};
    private final String[] EVC_10 = {"e", "C", "g", ">", "N", "Q", "'", "{", "K", "O", "i", "$", "=", "z", "b", "&", ";", "-", ")", "F", "]", "l", "r", "9", "[", "m", "W", "c", "u", "6", "f", "X", "h", "2", "y", "p", "R", "w", "T", "Z", "+", "`", "0", "x", "D", "L", "!", "#", "d", "M", "Y", "_", "(", "1", "/", "t", "A", "G", "o", "U", "s", "5", "j", "S", "I", "^", "}", "B", "E", "k", "*", "H", "a", "v", "7", "n", "4", ",", "|", "P", "q", "V", "J", "3", ".", "@", "?", "%", "<", "~", "8"};
    private final String[] EVC_11 = {"5", "f", ".", "]", "G", "W", "Q", "m", "K", "N", "`", ",", "~", "P", "9", "%", "o", "+", "j", "O", "^", "a", "@", "D", "h", "A", "_", "[", "S", "!", "#", "&", "R", "B", "E", "q", "$", "d", "Z", "i", ")", "L", "k", "C", "U", "e", "I", "Y", "X", "t", "'", "b", "=", "H", "F", "(", "z", "*", ">", "-", "J", "1", "n", "8", "}", "{", "T", "l", "3", "0", "?", "<", "s", "w", "g", "u", "7", "y", "6", "x", "p", "V", "v", ";", "4", "|", "/", "2", "M", "c", "r"};
    private final String[] EVC_12 = {"`", "P", "8", "f", "}", "G", "6", "Z", "T", ">", "n", "W", "~", "?", "<", "N", "+", "5", "r", "'", "e", "[", "y", "A", "c", "m", "S", "z", "g", "b", "D", "i", "v", "!", "V", "O", "p", "{", ";", "Y", "K", "3", "R", "Q", ".", "(", "|", "s", "M", "E", "l", "9", "L", "%", "4", "u", "-", "#", "0", ",", "F", "$", "H", "q", "a", "h", "t", "k", "^", ")", "/", "&", "x", "*", "I", "]", "C", "@", "J", "j", "1", "_", "d", "2", "U", "7", "X", "=", "B", "w", "o"};
    private final String[] EVC_13 = {"~", "H", "6", "I", "}", "h", "m", "2", "Y", "u", "]", "O", "d", "&", "(", "P", "3", "!", "5", "+", "7", "*", "q", "^", "D", "W", "x", "F", "z", "Z", "p", "i", "L", "t", "n", "8", "@", "G", "`", "0", "s", "e", "<", "X", "$", "/", "?", ",", "E", "j", "_", "b", "c", "w", "=", ";", "Q", ")", "9", ">", "K", "#", "o", "U", "S", "N", "R", "B", "v", "1", "T", "y", ".", "M", "l", "[", "C", "J", "a", "'", "%", "4", "k", "|", "V", "r", "A", "{", "-", "g", "f"};
    private final String[] EVC_14 = {"R", "N", "B", "u", "~", ".", "t", "4", "2", "[", "l", "S", "W", "(", "8", ",", "<", "X", "v", "3", "*", "O", "r", "?", "]", "%", "$", "7", "x", "F", "'", "b", "6", "c", "V", "I", "z", "@", "G", "_", "{", "q", "M", "-", ">", "o", "^", "m", "Q", "#", "s", "f", "n", "w", "`", "C", "e", "h", "a", "d", "9", "5", "U", ")", ";", "!", "j", "1", "Z", "E", "A", "T", "P", "D", "g", "|", "/", "=", "H", "p", "L", "i", "K", "0", "+", "Y", "k", "&", "}", "J", "y"};
    private final String[] EVC_15 = {"^", "W", "V", "C", ">", "7", "j", "S", "x", "f", "q", "0", ")", "6", "o", "]", "(", "5", "?", "-", "y", "n", "%", "e", "K", "c", "d", "A", "a", "_", "+", "p", "N", "!", "P", "b", "r", "v", "2", "*", "Q", "I", ";", "X", "T", "R", "M", ".", "|", "G", "u", "'", "$", "{", "H", "}", ",", "s", "@", "D", "F", "~", "1", "B", "9", "t", "J", "g", "O", "E", "=", "#", "L", "w", "`", "Z", "[", "8", "Y", "4", "/", "l", "U", "i", "m", "3", "&", "z", "k", "h", "<"};
    private final String[] EVC_16 = {"A", "-", ";", "_", "@", "k", "M", "z", "5", "[", "I", "m", "1", "H", "8", "b", "j", "t", "|", "^", "g", "V", "<", "L", "}", ")", "v", "d", ">", "'", "R", "h", ",", "~", "0", "n", "7", "F", "q", "3", "*", "4", "+", "&", "y", "c", "X", "W", "x", "/", "C", "r", "G", "f", "Y", "u", ".", "J", "U", "K", "E", "?", "Q", "O", "e", "S", "2", "{", "w", "(", "]", "Z", "N", "T", "P", "p", "9", "D", "a", "o", "`", "%", "$", "6", "=", "i", "B", "l", "s", "#", "!"};
    private final String[] EVC_17 = {"g", "v", "w", "p", "y", "!", ")", "s", "G", "K", "X", "<", "?", "]", "5", "M", ",", "a", "o", "`", "'", "Z", "3", "u", "f", "h", "W", "L", "k", "B", "4", "c", "1", "6", "*", "V", "}", "8", "R", "D", "b", "C", "7", ".", "H", "^", "|", "Y", "=", "~", "_", "[", "q", "S", "N", "#", "@", "l", "T", "A", "t", "x", "e", "i", "2", ">", "P", "/", "-", "m", "j", "z", "(", "$", ";", "E", "n", "9", "&", "+", "Q", "U", "%", "0", "O", "r", "F", "J", "I", "d", "{"};
    private final String[] EVC_18 = {"f", "$", "_", "O", "(", "N", ")", "%", "@", "Z", "}", "W", "*", "&", "F", "p", "x", "?", "U", "6", "5", "c", ",", "a", "m", "I", ";", "!", "w", "G", "^", "s", "P", "-", "h", "9", "V", "#", "L", "=", "]", ".", "i", "J", "C", "[", "~", "S", "v", "H", "r", "D", "|", "k", "B", "A", "j", "o", "E", "2", "y", "K", "z", "X", "'", "R", "n", "Y", "T", "e", "/", "u", "1", "t", "Q", "l", "`", "M", "+", "q", "0", "{", "3", "8", "4", "b", "g", ">", "7", "d", "<"};
    private final String[] EVC_19 = {"w", "n", "J", "7", "m", "Z", "Y", "k", "&", "8", "X", "j", "C", "v", "D", "2", "?", "H", "u", "r", "_", "q", "%", "@", "y", "g", "R", "U", "f", "O", "}", "(", "F", "h", "3", "4", "#", "]", "T", "P", "d", "=", "!", ".", "t", "6", ";", "A", "-", "z", "/", "[", "i", "9", "c", "^", "{", "G", "K", "e", "Q", "L", "*", "l", "B", "M", "a", "1", ",", "<", "N", "+", "5", "I", "0", "o", "b", "x", "W", "`", "V", "$", ">", "p", "E", "|", ")", "'", "~", "s", "S"};
    private final String[] EVC_20 = {"@", "P", "j", "8", "h", "U", "y", "G", "/", "u", "k", "Q", "X", "7", "I", "a", "n", "E", "6", "Z", "`", "c", "*", "%", "b", "p", "5", "^", "+", "#", "]", "1", ",", "J", "N", ";", "S", "q", "?", "C", "=", "r", "o", "A", "s", "9", "}", "v", "V", "-", "F", ".", "~", "O", "2", "w", "L", "<", "&", "l", "T", "e", "f", "m", "i", "3", ">", "R", "{", "z", "M", "d", "D", "B", "W", "'", "!", "H", "Y", "t", "K", "(", "g", ")", "[", "4", "|", "$", "0", "_", "x"};
    private final String[] EVC_21 = {"f", "'", "r", "@", "m", "z", "k", "j", "D", "J", ")", "i", "M", "_", "#", "4", "I", "!", "A", "B", "=", "l", "-", "$", "v", "o", "2", "3", "q", ".", "a", "F", "`", "L", "u", "c", "X", "C", "R", "O", "&", "b", "U", ";", "H", "+", "E", "p", "T", "g", "h", "Q", "1", "/", "~", "^", ",", "y", "w", "n", "%", "9", "|", "(", "7", "?", "N", "8", "Y", "P", "5", "x", "S", "]", "s", "G", "e", ">", "t", "d", "{", "}", "6", "W", "0", "Z", "K", "[", "*", "V", "<"};
    private final String[] EVC_22 = {"^", "g", "9", "r", ".", "D", "P", "K", "#", "%", "&", "=", "}", "y", "-", "'", "8", "$", "H", "T", "|", "L", "W", "n", "{", "v", "k", "o", "Z", "4", "u", "t", "z", "!", "6", "j", "b", "i", "5", "[", "C", "@", "J", "U", "c", "M", "s", "`", "S", ">", "f", "V", "x", "w", "A", "G", "R", "Q", "O", "(", "7", "B", "d", "q", "+", "X", ")", "F", "0", "~", "Y", "?", "N", "I", "a", "h", "/", ";", "p", "]", "2", "e", "E", "<", "m", "1", ",", "l", "3", "*", "_"};
    private final String[] EVC_23 = {"2", "b", "M", "E", "B", "5", "&", "l", "6", "z", "P", "a", "A", "G", "p", "9", "F", "-", "X", "0", "3", "i", "n", "+", "[", "]", "j", ";", "Y", "L", ".", "s", "J", "_", "?", "R", "y", "U", "'", "c", "k", "(", "T", ")", "Q", "d", "{", "@", "`", "g", ",", "D", "Z", "x", "m", "8", "|", "C", "%", "*", "7", "$", "t", "h", "w", "O", "}", "/", "q", "=", "H", "S", "4", "1", "<", "v", "^", "N", "r", "I", "K", "~", "#", "W", "f", "e", "u", "o", "V", ">", "!"};
    private final String[] EVC_24 = {"k", "d", "M", "b", "j", "H", "Z", "3", "*", "2", "6", "8", "+", "L", "@", "a", "y", "T", "g", "(", "4", "h", "-", "i", "c", "%", "o", "#", "^", "E", ";", ">", "r", ",", "n", "&", "'", "0", "G", "7", "z", "f", "}", "u", "P", "I", "<", "D", "!", "B", "S", "~", "[", "e", "w", "m", ".", ")", "l", "x", "A", "5", "p", "1", "v", "X", "t", "U", "$", "_", "|", "s", "V", "K", "q", "N", "]", "Y", "?", "9", "W", "=", "O", "C", "/", "F", "Q", "{", "J", "R", "`"};
    private final String[] EVC_25 = {"?", "@", "|", "O", "K", "R", "w", "y", "B", "n", "(", "k", "e", "C", "*", "S", "1", "m", "E", ";", "D", "s", "=", "[", "f", "L", ">", "+", "Z", "6", "'", "Y", "N", "b", "<", "%", "~", "&", "}", ",", "j", "H", "q", "M", "$", "0", "`", "7", ")", ".", "l", "X", "G", "Q", "9", "J", "t", "z", "P", "A", "3", "4", "d", "v", "_", "V", "r", "8", "u", "/", "a", "U", "{", "h", "p", "I", "5", "-", "^", "c", "x", "T", "g", "W", "#", "]", "F", "!", "o", "2", "i"};
    private final String[] EVC_26 = {"E", "?", "c", "B", "X", "D", "4", "e", "F", "2", "v", "G", "8", "*", "@", "Y", "m", "!", "N", "z", "U", "7", "p", "0", "x", "+", "Z", "u", "n", "<", "_", "l", ".", "f", "s", "-", "/", "I", "5", "%", "L", "j", "P", "(", "w", "k", "#", "r", "6", "|", "S", "]", "9", "`", "o", "y", "C", ")", "3", "=", "h", "b", "J", "'", "q", "R", ";", "M", "T", "d", "1", "Q", "&", "~", "}", "A", "^", "W", "K", ",", "g", "O", ">", "$", "[", "a", "{", "H", "V", "t", "i"};
    private final String[] EVC_27 = {"g", "C", "+", "u", "o", "P", "e", "n", "F", "z", "{", "5", "'", "Y", "?", "v", "a", "E", "c", "V", "3", "~", "2", "*", "/", "4", "X", "]", "T", "B", "0", "G", "A", "w", "m", "r", "x", "j", ";", "Z", "(", "s", "}", "D", "y", "8", "_", "J", "p", "^", "7", "#", "%", "M", "<", "W", "d", "i", "K", "S", "@", "1", "[", ",", "-", "`", ")", "N", "9", "|", "t", "H", "l", ">", "6", "&", "L", "!", "=", "Q", "f", "q", "b", "U", "I", "k", "R", "h", "$", "O", "."};
    private final String[] EVC_28 = {"@", "C", "O", "y", "4", "5", "U", "~", "u", "`", "*", ">", ")", "o", "L", "K", "E", "H", "=", "F", "m", "#", "?", "|", "r", "Q", "A", ".", "W", "X", "]", "0", "V", "_", "8", ";", "x", "z", "Y", "2", "%", "J", "7", "!", "}", "{", "l", "+", "d", ",", "c", "9", "S", "n", "[", "-", "e", "D", "i", "N", "<", "w", "B", "Z", "G", "j", "v", "T", "1", "q", "(", "M", "/", "p", "k", "&", "a", "$", "^", "b", "f", "'", "R", "6", "h", "s", "I", "3", "t", "P", "g"};
    private final String[] EVC_29 = {"l", ".", "?", "`", "A", "e", "V", "}", "5", "T", "d", "F", "3", "p", "2", "S", "o", "&", "U", "4", "7", "Y", "!", "-", "b", "H", "@", "%", "D", "O", "^", "K", ">", "{", "X", "/", "0", "s", "~", "|", "g", "C", "R", ";", "P", "t", "J", "n", "z", "[", ",", "+", "9", "I", "x", "*", ")", "_", "Q", "G", "Z", "j", "c", "N", "v", "r", "m", "a", "<", "$", "w", "q", "B", "L", "W", "M", "'", "i", "h", "6", "8", "#", "E", "=", "k", "(", "y", "u", "f", "]", "1"};
    private final String[] EVC_30 = {"j", ",", "m", "K", "H", "@", "J", "M", "1", "[", "q", "V", "N", "`", "A", "2", "n", "f", "e", "y", "x", "W", "4", "b", "(", "8", "a", "k", "}", "U", "t", ")", "v", "*", "P", "!", ";", "3", "7", "i", "0", "u", "_", "5", "R", "E", "g", "h", "]", "{", "S", "s", "Y", "T", "'", "D", "Q", "|", "I", "X", "?", "w", "O", "c", "Z", "%", "+", "r", "o", "/", "G", "C", "B", ">", "~", "-", "L", "z", "&", "l", "p", "=", "^", "F", "9", ".", "#", "<", "d", "6", "$"};
    private final String[] EVC_31 = {"o", "5", "9", "T", "M", "H", "Y", "A", "t", "-", "<", "a", "h", "s", "d", ".", "{", "~", "D", "f", "(", "1", "G", "7", "?", "I", "@", "E", "}", "N", "g", "c", "!", "e", "O", "&", ">", ",", "n", "|", "=", "Z", "W", "j", "V", "J", "R", ")", "b", ";", "z", "B", "l", "%", "r", "S", "'", "p", "0", "+", "_", "2", "`", "#", "x", "q", "L", "6", "F", "[", "y", "X", "i", "m", "v", "/", "w", "3", "4", "Q", "]", "C", "^", "U", "8", "*", "K", "k", "u", "P", "$"};
    private final String[] EVC_32 = {"7", "O", "6", "E", "5", "c", "b", "D", "C", "w", "|", "i", "p", "]", "R", ">", "G", "'", "e", "q", "<", "P", "u", ".", "1", "v", "#", "d", "J", "k", "I", "-", "l", "o", "8", "Q", "_", "3", "B", "&", "{", ")", "/", "m", "9", "^", "Z", "F", "?", "H", "+", "M", "T", "=", "f", "X", "K", "[", "r", ";", ",", "h", "t", "j", "!", "(", "`", "2", "*", "@", "y", "W", "U", "Y", "a", "n", "0", "s", "L", "z", "}", "S", "4", "$", "~", "x", "N", "A", "V", "%", "g"};
    private final String[] EVC_33 = {"j", "g", "7", "r", "&", "G", "z", "k", "K", "^", "S", "$", "<", "q", "-", "}", "?", "D", "/", "n", "e", "R", "+", "#", "x", "U", "%", "2", "c", "t", "u", "Q", "8", "h", "o", "[", "V", "l", "@", "W", ">", "_", "a", "Z", "H", "y", "i", "Y", "X", "N", "]", "'", "B", "{", "C", "E", "M", "I", "v", ".", ",", "d", "O", "*", "(", "5", "s", "3", "`", "A", ")", "!", "P", "0", "f", "1", "T", ";", "m", "b", "4", "|", "=", "F", "J", "w", "~", "9", "p", "6", "L"};
    private final String[] EVC_34 = {"e", "G", "*", "X", "z", "N", "1", "Z", "h", "k", "Y", "&", "q", "+", "K", "C", "s", "R", "I", "p", ",", "H", "~", "[", "a", ")", "Q", "/", "l", "4", "?", "0", "(", "m", "r", "M", "c", "d", "B", "7", "}", "L", "x", "O", "3", "i", "F", "'", "T", "P", "D", "t", "2", "b", "`", "f", "v", "$", "#", "{", ">", "E", "V", "g", "u", "|", "W", "A", "_", "j", "J", ";", "<", "y", "S", "@", "w", "%", "-", "8", "!", "U", "=", "5", "n", "6", ".", "]", "^", "9", "o"};
    private final String[] EVC_35 = {"-", "[", "F", "k", "o", "Y", "a", ".", "g", "@", "H", "^", "m", "D", "%", "Q", "z", "M", "R", "t", "N", "1", "p", "e", "A", "7", "_", "Z", "`", "S", "9", "u", "s", "B", ")", ">", "G", "d", "+", "h", "f", "n", "i", "*", "(", "X", "q", "&", "U", "I", "T", "x", "{", "$", "0", "#", "L", "E", "?", "c", "y", "<", "]", "V", ",", "2", "'", "~", "C", "6", "v", "l", "W", "j", "b", ";", "|", "=", "w", "O", "3", "r", "8", "!", "J", "/", "4", "5", "P", "}", "K"};
    private final String[] EVC_36 = {"%", "q", ")", "$", "i", "B", "s", ";", "t", "V", "J", "&", "L", "b", "@", "D", "o", ".", "0", "S", "<", "m", "U", "n", "5", "/", "|", "6", "Z", "H", "=", "`", "9", "+", "g", "Q", "R", "a", "2", "p", "*", "P", "j", "8", "x", "[", "{", "Y", "I", "O", "u", "#", ">", "~", "C", "]", "w", "K", "r", "7", "k", "3", "}", "4", "z", "(", "^", "!", "l", "N", "E", "'", "F", ",", "h", "c", "1", "W", "M", "y", "T", "G", "A", "_", "?", "-", "e", "f", "d", "v", "X"};
    private final String[] EVC_37 = {"g", "K", "j", "V", "b", "m", "6", "q", "n", ">", ";", "Y", "(", "H", "u", "$", "p", "`", "3", "v", "d", "[", "N", "!", "U", "5", "4", ",", "s", "<", "9", "^", "7", "G", "P", "h", "R", "|", "{", "L", "&", "Q", "/", "A", "'", "-", "I", ")", "T", "0", "W", "B", "i", "f", "w", "x", "c", "X", "E", "t", "=", "?", "]", "%", "C", "2", "#", "e", "S", ".", "k", "*", "1", "a", "F", "~", "z", "l", "r", "_", "8", "D", "O", "Z", "M", "}", "@", "J", "+", "o", "y"};
    private final String[] EVC_38 = {"/", "e", "i", "7", "x", "n", "|", "2", "I", "F", "d", ";", "W", ",", "=", "$", ".", "p", "P", "]", "z", "?", "3", "R", "v", "[", "`", "8", "1", "E", "w", "X", "(", "}", "a", "k", "b", "h", "D", "V", "#", "*", "Z", "@", "Q", "H", "t", "c", "&", "Y", "G", "<", "y", "4", "%", "_", "N", "U", "M", "u", "{", "q", "6", "C", "S", "+", "l", "-", "L", "j", ">", "A", "T", "r", "B", "m", "J", "g", "0", "o", "^", "'", "9", "5", "f", "~", "s", ")", "!", "O", "K"};
    private final String[] EVC_39 = {"t", "E", "c", "J", "*", "7", "4", "%", "?", "p", "X", "Z", "I", "2", "S", "l", "W", "3", "$", "h", "]", "d", "i", "-", "6", "`", "@", "~", "5", "P", "f", ";", "[", "N", "0", "s", "B", "C", "Q", ",", "9", "^", "o", "R", "m", "#", "O", "v", "n", ".", ")", "K", "y", "j", "&", "L", "<", "x", "+", "G", "w", "'", "a", "U", "H", "(", "A", "!", "q", "Y", "M", "/", "b", "{", "r", "1", "}", "e", "=", "|", ">", "F", "T", "k", "D", "8", "V", "u", "g", "_", "z"};
    private final String[] EVC_40 = {"d", "@", "v", "R", "B", "S", "P", "1", "#", "m", "V", "y", "+", "|", ".", "p", "J", "G", ";", "_", "%", "{", "t", "X", "}", "N", "-", "L", "W", "A", "!", "w", "8", "n", "5", "=", "a", "Q", "7", "2", "D", "[", "E", "T", "9", "c", "u", "*", "g", "b", "O", "'", "`", "$", "3", "Z", "U", "x", "h", "K", "q", ",", "s", "(", "r", "?", "6", "k", "M", "]", "H", "z", "I", "l", "C", ">", "o", "F", "i", "e", ")", "/", "^", "~", "f", "j", "Y", "<", "&", "4", "0"};
    private final String[] EVC_41 = {"G", "Q", "6", "f", "B", "X", "5", "r", ">", "m", "A", "a", "!", "9", "T", "q", "H", "M", "}", "@", "i", "2", "]", "U", "u", "s", "7", "h", "d", "y", "&", "j", ";", "Z", "N", "z", "|", "P", "n", "Y", "^", "[", "%", "3", "x", "e", "S", "v", "'", "1", "p", "/", "k", "0", "C", "w", "8", "<", "K", "+", "W", "L", "g", "*", "b", "#", "J", ")", "t", "F", "R", "~", "c", "_", "D", "o", "$", "(", ",", "4", "l", "I", "=", "`", ".", "?", "E", "{", "O", "-", "V"};
    private final String[] EVC_42 = {")", "R", "5", "9", "V", "U", "}", "'", "I", "z", "T", "*", "C", "p", "<", "M", "3", "l", "a", "d", "{", "6", "j", "!", "v", "%", "_", "]", "w", ".", "=", "@", "b", "~", "1", "0", "y", "L", "c", "f", "/", "[", "k", "E", "s", "o", "N", "P", "X", ",", "q", "2", "?", "`", "S", "Y", "u", "r", "^", "F", "g", "H", "B", ";", "+", "G", "8", "K", "A", ">", "Z", "e", "m", "O", "4", "$", "(", "h", "i", "7", "J", "|", "Q", "&", "x", "n", "t", "-", "#", "D", "W"};
    private final String[] EVC_43 = {"l", ">", "Q", "^", "|", "k", "9", "t", "P", "J", "B", "2", ")", "3", "6", "[", "A", "Y", ";", "x", "e", "4", "!", "o", "q", "W", "g", "+", ",", "p", "<", "V", "S", "G", "/", "#", "r", "L", "N", "i", "z", "R", "-", "*", "]", "f", "m", "K", "X", "U", "C", "`", "c", "1", "0", "h", "T", "b", "s", "?", "y", "j", "=", "u", "_", "w", "%", "@", "H", "d", "~", "F", "Z", "{", "v", "&", "D", "7", "n", "O", "}", "(", "E", "a", "8", "5", "$", "I", "M", ".", "'"};
    private final String[] EVC_44 = {"5", "[", "J", ";", "a", "%", "~", "/", "3", "R", "z", "&", "y", "f", "8", ".", "]", "c", "P", "F", "1", "}", "=", "M", "q", ")", "e", "!", "-", "U", "2", "k", "Z", "<", "V", "K", "7", "i", "I", "A", "C", "x", "E", "?", "9", "n", "$", "O", "W", "p", "#", "T", "*", "w", "@", "h", "t", "(", "|", "b", ">", "'", ",", "u", "g", "_", "o", "N", "{", "l", "Q", "`", "X", "j", "S", "6", "G", "H", "+", "B", "L", "0", "^", "m", "4", "Y", "v", "s", "d", "D", "r"};
    private final String[] EVC_45 = {"M", "7", "q", "!", "%", "C", "O", "}", "U", "G", "Q", "[", "L", "l", "'", "s", "N", ",", "3", "`", "$", "{", "D", "d", "H", "9", "i", "V", "8", "J", "w", "e", "?", "v", "-", "A", "^", "6", "&", "2", "n", "R", "k", "x", "/", "X", ";", "W", "u", "o", "h", "@", "B", "m", "P", ")", "(", "_", "*", "=", "]", "t", "Y", "y", "~", "F", "4", "Z", "0", "|", "I", "a", ".", "j", "b", "T", "<", "1", "f", "+", "p", ">", "#", "g", "S", "5", "K", "E", "z", "c", "r"};
    private final String[] EVC_46 = {"T", "_", "n", "L", "-", "?", "B", "2", "M", "9", "^", "}", ".", "0", "u", "D", "~", "i", "R", "<", "'", "6", "W", "@", "K", "!", "8", "y", "a", "t", "N", "j", "p", "]", "w", "h", "#", "(", "3", "f", "C", ")", ";", "I", "s", "U", "k", "/", "E", "r", ",", "|", "X", "o", "%", "O", "&", "`", "b", "F", "H", "Z", "l", "4", "[", "{", "5", "P", "q", "z", "g", "1", ">", "m", "Y", "=", "J", "$", "v", "e", "G", "V", "A", "c", "S", "d", "+", "x", "Q", "7", "*"};
    private final String[] EVC_47 = {"i", "K", "S", "N", "w", "M", "|", "f", "u", "o", "[", "t", "H", "q", "Q", "b", "O", "(", "9", "h", "y", "3", "^", ";", "/", "6", "`", "D", "0", "8", "s", "j", "I", "g", "F", "z", "E", "1", "v", "<", "a", "5", "C", "'", "?", "m", "p", "+", "n", "~", "U", "&", "c", "R", "!", "e", "7", "B", "*", "V", "}", "2", "r", "d", "P", ">", "W", "A", ",", "L", "x", ")", "Z", "%", "l", "#", "X", "-", "J", "{", "Y", "$", "_", "4", "k", "G", "=", ".", "@", "]", "T"};
    private final String[] EVC_48 = {"v", "U", "f", "A", "T", "J", "G", "}", "B", "+", ";", "#", "6", "d", "'", "8", "=", "[", "4", "t", "]", "X", "5", "/", "0", "g", "H", "9", "$", "h", ")", "i", "O", "D", "p", "Z", "2", "C", "~", "j", "n", "k", "-", "*", "u", "S", ",", "I", "&", "x", "@", "F", "7", "s", "a", "!", "3", "<", "N", "%", "W", "l", "m", "{", "R", "o", "?", "`", "y", "V", "Y", "Q", "E", "K", "|", "c", "^", "_", "z", "w", "P", ".", "L", "e", "q", "b", "r", "M", "(", "1", ">"};
    private final String[] EVC_49 = {"`", "{", "J", "7", "%", "8", "r", "V", "j", "?", "(", "D", "X", "P", "9", "q", "=", "$", "'", "2", "u", "s", "/", "Z", "E", "!", "T", "L", "g", ">", "Y", "H", "v", "0", "S", "~", "z", "U", "1", "e", "B", "k", ")", "+", "]", "A", "F", "_", "5", "W", "-", "o", "l", "}", "c", "K", "f", "O", "G", "y", "@", "^", "6", "n", "3", "t", "h", "<", "*", "a", ".", "4", "m", "i", "M", "N", ",", "p", "|", "I", ";", "#", "d", "w", "Q", "[", "R", "b", "&", "x", "C"};
    private final String[] EVC_50 = {"(", ">", "`", "'", "<", "5", "J", "l", "K", "t", "1", "2", ",", "r", "x", "4", "7", "y", "f", "E", "R", ")", "F", "/", "A", "U", "6", "s", "m", "M", "d", "C", "a", "e", "Z", "p", ";", "v", ".", "L", "3", "G", "H", "i", "&", "Q", "_", "B", "0", "z", "{", "P", "|", "b", "w", "g", "+", "%", "[", "j", "#", "D", "@", "T", "Y", "n", "q", "!", "N", "$", "c", "=", "k", "V", "W", "I", "o", "^", "h", "-", "?", "8", "S", "}", "]", "~", "O", "X", "9", "*", "u"};
    private final String[] EVC_51 = {"i", "7", "D", "~", "8", "-", "K", "Q", "y", "(", "T", "3", "#", "o", "n", "*", "b", "A", "Y", "R", "9", "]", ".", "B", "0", "|", "J", "1", "L", "d", ";", "5", "Z", "h", "u", "k", "f", "E", "U", "?", "q", "6", "G", "N", "e", "_", "F", "<", "l", ">", "!", "c", "/", "O", "I", "W", "$", "2", "}", "H", "C", "S", "&", "M", "w", "m", "V", "z", "r", "s", "j", "{", "@", "4", ")", "%", "^", "+", "a", "'", "t", "v", "X", "p", "x", "P", "=", "[", ",", "g", "`"};
    private final String[] EVC_52 = {"E", ">", "l", "b", "|", "J", ";", "k", "f", "U", "u", "g", "~", "4", "!", "v", "/", "0", "N", "z", "#", "e", "{", "?", "6", "Z", "c", "-", "H", "A", "x", "w", "@", "O", "S", ".", "B", "m", "Y", "`", "P", "h", "(", "F", "1", "G", "]", "j", "p", "'", "d", "^", "M", "D", "C", "&", "3", "*", "T", "9", "R", "8", "q", "[", "5", "7", "a", "W", "i", ")", "Q", "%", "L", "+", "I", "t", "<", "$", "=", "V", "n", ",", "s", "r", "o", "X", "}", "y", "K", "_", "2"};
    private final String[] EVC_53 = {")", "W", "@", "$", "*", "7", "f", "u", "d", "'", "G", "s", "/", "c", "j", "m", "+", "i", "o", "R", "X", ";", "Q", "8", ",", "y", "F", "N", "U", "_", "l", "x", "^", "e", "%", "}", "H", "=", "T", "r", "a", "3", ".", "6", "h", "<", "#", "D", "1", "9", "]", "!", "z", "~", "w", "2", "`", "0", "-", "Y", "5", "p", "L", "S", "V", "g", "4", "&", "|", "K", "(", ">", "v", "?", "B", "k", "J", "C", "t", "[", "M", "A", "n", "{", "Z", "P", "I", "E", "q", "b", "O"};
    private final String[] EVC_54 = {"v", "o", "E", "*", "!", "x", "C", "~", "I", "6", "g", ")", "G", "#", "W", "i", "F", "(", ";", "h", "P", "k", "w", "n", "M", "8", "d", "j", "3", "u", "H", "a", "X", "s", "p", "`", "]", "5", "S", "0", "D", "c", "4", ">", "f", "@", "$", "K", "V", "J", "Z", "R", "[", "L", "B", "m", "<", "b", "z", ",", "O", "?", "A", "%", "+", "&", "y", "l", ".", "2", "7", "q", "_", "-", "t", "'", "r", "U", "|", "1", "{", "/", "=", "T", "Y", "Q", "e", "}", "9", "^", "N"};
    private final String[] EVC_55 = {"-", "8", "+", "^", "u", "Y", "e", "s", "%", "o", "/", "6", "4", "B", "_", "#", "g", "p", "t", "v", "G", "l", "7", "Q", "W", "S", "I", "J", "A", "C", "m", ",", "2", "&", "L", "[", "R", ".", "O", "*", "z", "<", "E", "}", "5", "]", "X", "{", "F", "i", "N", "9", "@", "c", "K", ">", "$", "w", "(", "k", "U", "h", "a", "y", "M", "3", "r", "V", "P", "j", "d", "T", "H", ";", "D", "b", "`", "'", "!", "f", "x", "n", "1", "0", ")", "=", "?", "q", "Z", "~", "|"};
    private final String[] EVC_56 = {"0", ")", "x", ",", "N", "~", "w", "L", "B", "!", "3", "M", "[", "e", "T", "S", "D", "r", "W", "Y", "f", "c", "&", "+", "G", ">", "5", "F", "R", "^", "(", "g", "6", "#", "-", "H", "E", "]", "o", "m", "z", "7", "p", "_", "=", "h", "b", "n", "u", "t", "$", "O", "U", "1", "d", "?", "X", "|", "K", "y", "s", "V", "}", "P", "q", ";", "9", "A", "2", "Z", "J", "'", "C", "`", "i", ".", "8", "<", "Q", "I", "4", "/", "l", "a", "k", "j", "{", "v", "*", "@", "%"};
    private final String[] EVC_57 = {"t", "-", "M", "`", "a", "w", "|", "f", "o", "c", "5", "9", ">", "G", "U", "u", "V", "x", "N", "b", "T", "Z", "#", "~", "m", "y", "3", "[", "K", "6", "]", "v", "*", "{", "L", "g", "+", "%", "}", "<", "p", "?", "2", ",", "=", "C", "W", "S", "!", "&", "/", "J", "Y", "A", "8", "$", "D", "B", "R", "q", ";", "1", "(", "s", "X", "l", "0", ")", "'", "r", "e", "7", "n", "_", "d", "H", "4", "k", "@", "F", "i", ".", "^", "z", "h", "P", "O", "E", "I", "j", "Q"};
    private final String[] EVC_58 = {"I", "]", "_", "7", "e", "#", "G", "-", "Y", "u", "J", "5", "~", "z", "h", "!", "|", "N", "A", "r", "Q", "T", "o", "x", "}", "(", "d", "M", ">", "j", "`", "H", "2", "*", "g", "t", "@", "E", "s", ")", "$", "0", "m", "p", ",", "i", "1", "'", "y", "v", "l", "D", "^", "=", "K", "C", "9", "q", "[", "3", "S", "P", ";", "8", "<", "n", "&", "k", "L", "X", "F", ".", "U", "V", "/", "Z", "w", "+", "6", "a", "4", "c", "%", "?", "{", "B", "R", "W", "O", "f", "b"};
    private final String[] EVC_59 = {".", "+", "s", "^", "v", "[", "j", "n", "2", "M", "4", "@", "G", "y", "u", "&", "W", "a", "~", ";", "#", "]", "O", "V", "t", "g", "/", "q", "f", "Y", "<", "0", "x", "w", "'", "%", "L", "m", "h", "B", "{", "A", "b", "o", "U", "Z", "8", "9", "K", ">", "?", ")", "F", "3", "r", "(", "P", "k", "7", "e", "=", "$", "-", "p", "H", "S", "Q", "i", "I", "*", "|", "_", "E", "d", "T", "N", "`", "z", "6", "R", "c", "5", "!", "D", "}", ",", "C", "J", "1", "X", "l"};
    private final String[] EVC_60 = {"o", "E", "~", "}", "5", "q", "?", "9", "Z", "W", "j", "V", "T", "h", "w", "`", "H", "d", "B", "X", "&", "/", "k", ".", "K", "<", "{", "y", "I", "%", "P", ">", "v", "r", "U", "S", "g", "!", "n", "3", "+", ",", "D", "-", "2", "R", "s", "=", "i", "(", "N", "b", "|", "F", "J", "*", "^", "7", "a", "z", "p", "c", "u", "e", "O", ";", "x", "f", "m", "1", "A", "0", "4", "Y", "8", "t", "@", "_", "6", "M", "'", "Q", "[", "l", ")", "$", "C", "L", "]", "#", "G"};
    private final String[] EVC_61 = {"`", "/", "m", "j", "o", "x", "u", "H", "&", "@", "}", "]", "n", "8", "i", "y", "1", "6", "c", "A", "~", "k", "|", "T", "N", "X", "[", "D", "*", "s", "t", "e", "I", "b", "_", "Z", ">", "3", "7", "M", ",", "r", "'", "Y", "w", "#", "v", "a", "-", "L", "C", "U", "?", "(", "O", "!", "J", ".", "<", "2", "f", ")", "z", "9", "q", "F", "g", "V", "S", "l", "B", "^", "R", "E", "0", "5", "P", "d", "G", "4", "W", "=", "K", "{", ";", "%", "+", "$", "p", "h", "Q"};
    private final String[] EVC_62 = {"]", "$", "/", "@", "D", "3", "q", "1", "[", "P", "}", "j", "Y", "4", "G", "o", "?", "+", "b", "7", "B", "z", "c", "N", "X", ",", "W", "w", "l", "u", "Q", "C", "v", "A", "#", "I", "i", ".", "J", "F", "5", "t", "S", "{", "r", "f", "U", ";", "O", "L", "h", "p", "k", "2", "M", "V", "_", "d", "E", "%", "`", "a", "K", "H", "'", ">", "6", "=", "g", "T", "x", "|", "0", "-", "y", "(", "&", "9", "s", "e", "Z", "R", "~", ")", "n", "<", "!", "8", "^", "*", "m"};
    private final String[] EVC_63 = {"~", "(", "Q", "=", "0", ".", "Z", "C", "5", "A", "+", "v", "*", "#", "x", "9", "e", "V", "J", "t", "P", "l", "q", "g", "w", "M", "3", "I", "B", "u", ")", "s", "E", "a", "/", "&", "b", "y", "@", "i", "?", "j", "4", ">", "N", "Y", "!", "<", "O", "k", "]", "m", "R", "^", "z", "o", ";", "S", "2", "h", "$", "_", "1", "r", "'", "K", "p", "T", "6", "8", "{", "L", "-", "D", "7", "W", "[", "%", "|", "c", "U", ",", "f", "G", "d", "n", "F", "`", "}", "H", "X"};
    private final String[] EVC_64 = {"/", "q", "?", "+", "{", "'", "[", "d", "I", "X", "p", "^", "D", "9", "f", "U", "2", "E", "A", "!", "=", "M", "P", "Y", "b", "t", "v", "y", "T", "*", "i", "l", "u", "k", "0", "H", "7", "G", "1", "c", "o", "x", "&", ",", "6", "]", "g", "%", "j", ">", ")", "<", "`", "|", "Q", "W", "L", "a", "J", "@", "5", "_", "$", "F", "O", "C", "e", "-", "S", ";", "4", "(", "w", "K", "z", "}", "B", ".", "n", "Z", "h", "N", "m", "8", "V", "#", "~", "r", "3", "s", "R"};

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