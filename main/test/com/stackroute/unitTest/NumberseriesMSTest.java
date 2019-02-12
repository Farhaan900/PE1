package com.stackroute.unitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberseriesMSTest {

    NumberseriesMS nms;
    @Before
    public void setUp() throws Exception {
        nms = new NumberseriesMS();
    }

    @After
    public void tearDown() throws Exception {
        nms = null;
    }

    @Test
    public void numberSeriesMS1() {
        long outnum = nms.numberSeriesMS(2);
        assertEquals(122,outnum);
    }


    @Test
    public void numberSeriesMS2() {
        long outnum = nms.numberSeriesMS(4);
        assertEquals(1223334444,outnum);
    }


    @Test
    public void numberSeriesMS3() {
        long outnum = nms.numberSeriesMS(1);
        assertNotNull(outnum);
    }
}