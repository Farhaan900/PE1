package com.stackroute.unitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VovelConsonentMSTest {

    VovelConsonentMS vcms;

    @Before
    public void setUp() throws Exception {

        vcms = new VovelConsonentMS();

    }

    @After
    public void tearDown() throws Exception {
        vcms = null;
    }

    @Test
    public void vovelConsonentMS1() {
        String outdata = vcms.vovelConsonentMS("az");
        assertEquals("Vovel Consonent ",outdata);
    }

    @Test
    public void vovelConsonentMS2() {
        String outdata = vcms.vovelConsonentMS("azza");
        assertEquals("Vovel Consonent Consonent Vovel ",outdata);
    }

    @Test
    public void vovelConsonentMS3() {
        String outdata = vcms.vovelConsonentMS("");
        assertEquals("",outdata);
    }

    @Test
    public void vovelConsonentMS4() {
        String outdata = vcms.vovelConsonentMS("aza");
        assertEquals("Vovel Consonent Vovel ",outdata);
    }
}