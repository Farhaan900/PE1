package com.stackroute.unitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LetterNumberMSTest {

    LetterNumberMS lnms;

    @Before
    public void setUp() throws Exception {
        lnms = new LetterNumberMS();
    }

    @After
    public void tearDown() throws Exception {
        lnms = null;
    }

    @Test
    public void letterNumberMS1() {
        String outdata = lnms.letterNumberMS('A');
        assertEquals("Upper case",outdata);
    }

    @Test
    public void letterNumberMS2() {
        String outdata = lnms.letterNumberMS('a');
        assertEquals("Lower case",outdata);
    }

    @Test
    public void letterNumberMS3() {
        String outdata = lnms.letterNumberMS('1');
        assertEquals("Number",outdata);
    }

    @Test
    public void letterNumberMS4() {
        String outdata = lnms.letterNumberMS('@');
        assertEquals("Special Character",outdata);
    }
}