package com.stackroute.unitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringMSTest {

    ReverseStringMS rsms;

    @Before
    public void setUp() throws Exception {
        rsms = new ReverseStringMS();
    }

    @After
    public void tearDown() throws Exception {
        rsms=null;
    }

    @Test
    public void reverseStringMS1() {
        String outdata = rsms.reverseStringMS("apple");
        assertEquals("elppa",outdata);
    }

    @Test
    public void reverseStringMS2() {
        String outdata = rsms.reverseStringMS("banana");
        assertEquals("ananab",outdata);
    }
    @Test
    public void reverseStringMS3() {
        String outdata = rsms.reverseStringMS("z");
        assertEquals("z",outdata);
    }

    @Test
    public void reverseStringMS4() {
        String outdata = rsms.reverseStringMS("");
        assertEquals("",outdata);
    }

}