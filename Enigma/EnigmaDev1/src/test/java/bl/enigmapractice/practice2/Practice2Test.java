///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package bl.enigmapractice.practice2;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
///**
// *
// * @author Boone
// */
//public class Practice2Test {
//    
//    Practice2 aa = new Practice2();
//    
//    public Practice2Test() {
//    }
//    
//    //EncryptString ===========================================================
//    @Test
//    public void testEncryptString() {
//    }
//    
//    //VerifyStringLength =======================================================    
//    private final int MAX = 64;
//    private String buildString(int max) {
//        String s = "";
//        for (int i = 1; i <= max; i++) {
//            s += "a";
//        }
//        return s;
//    }
//    
//    @Test
//    public void testVerifyStringLength_1() {
//        String input = buildString(1);
//        assertEquals(MAX, aa.verifyStringLength(input, MAX).length());
//    }
//    
//    @Test
//    public void testVerifyStringLength_2() {
//        String input = buildString(2);
//        assertEquals(MAX, aa.verifyStringLength(input, MAX).length());
//    }
//    
//    @Test
//    public void testVerifyStringLength_3() {
//        String input = buildString(30);
//        assertEquals(MAX, aa.verifyStringLength(input, MAX).length());
//    }
//    
//    @Test
//    public void testVerifyStringLength_4() {
//        String input = buildString(MAX - 1);
//        assertEquals(MAX, aa.verifyStringLength(input, MAX).length());
//    }
//    
//    @Test
//    public void testVerifyStringLength_5() {
//        String input = buildString(MAX);
//        assertEquals(MAX, aa.verifyStringLength(input, MAX).length());
//    }
//    
//    @Test
//    public void testVerifyStringLength_6() {
//        String input = buildString(MAX + 1);
//        assertEquals("fail", aa.verifyStringLength(input, MAX));
//    }
//    
//    @Test
//    public void testVerifyStringLength_7() {
//        String input = "";
//        assertEquals("fail", aa.verifyStringLength(input, MAX));
//    }
//}
