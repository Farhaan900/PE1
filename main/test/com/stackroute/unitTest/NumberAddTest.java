package com.stackroute.unitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberAddTest {

    NumberAdd nams;

    @Before
    public void setUp() throws Exception {
        nams = new NumberAdd();
    }

    @After
    public void tearDown() throws Exception {
        nams = null;
    }

    @Test
    public void numberAdd1() {
        int outans = nams.numberAdd("11 1");
        assertEquals(12,outans);
    }

    @Test
    public void numberAdd2() {
        int outans = nams.numberAdd("12 12 55");
        assertEquals(79,outans);
    }

    @Test
    public void numberAdd3() {
        int outans = nams.numberAdd("12");
        assertEquals(12,outans);
    }

    @Test
    public void numberAdd4() {
        int outans = nams.numberAdd("11 1 44");
        assertNotNull( outans);
    }
}