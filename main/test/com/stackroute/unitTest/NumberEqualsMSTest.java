package com.stackroute.unitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberEqualsMSTest {

    int val = 20;
    NumberEqualsMS nems;

    @Before
    public void setUp() throws Exception {
        nems = new NumberEqualsMS();
    }

    @After
    public void tearDown() throws Exception {
        nems = null;
    }

    @Test
    public void numberEqualsMS1() {
        String outdata = nems.numberEqualsMS(20,val);
        assertEquals("equal",outdata);
    }

    @Test
    public void numberEqualsMS2() {
        String outdata = nems.numberEqualsMS(50,val);
        assertEquals("more",outdata);
    }

    @Test
    public void numberEqualsMS3() {
        String outdata = nems.numberEqualsMS(10,val);
        assertEquals("less",outdata);
    }
}