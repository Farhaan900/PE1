package com.stackroute.unitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberSortMSTest {
    NumberSortMS nsms;
    @Before
    public void setUp() throws Exception {
        nsms = new NumberSortMS();
    }

    @After
    public void tearDown() throws Exception {
        nsms = null;
    }

    @Test
    public void numberSortMS1() {
        int outnum = nsms.numberSortMS(332233);
        assertEquals(333322,outnum);
    }

    @Test
    public void numberSortMS2() {
        int outnum = nsms.numberSortMS(12345);
        assertEquals(54321,outnum);
    }

    @Test
    public void numberSortMS3() {
        int outnum = nsms.numberSortMS(11);
        assertEquals(11,outnum);
    }

    @Test
    public void numberSortMS4() {
        int outnum = nsms.numberSortMS(2323441);
        assertEquals(4433221,outnum);
    }
}