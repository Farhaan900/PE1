package com.stackroute.unitTest;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeMSTest {

    PalindromeMS pms;

    @Before
    public void setUp() throws Exception {
        pms = new PalindromeMS();
    }

    @After
    public void tearDown() throws Exception {
        pms = null;
    }

    @Test
    public void palindrome1() {
        String outdata = pms.palindrome(12345);
        assertEquals("not palindrome",pms.palindrome(12345));
    }

    @Test
    public void palindrome2() {
        String outdata = pms.palindrome(12345);
        assertEquals("palindrome",pms.palindrome(123454321));
    }

    @Test
    public void palindrome3() {
        String outdata = pms.palindrome(12345);
        assertEquals("palindrome",pms.palindrome(1));
    }
}