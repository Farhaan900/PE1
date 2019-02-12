package com.stackroute.unitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubstrRepeatMSTest {

    SubstrRepeatMS ssrms;

    @Before
    public void setUp() throws Exception {
        ssrms = new SubstrRepeatMS();
    }

    @After
    public void tearDown() throws Exception {
        ssrms=null;
    }

    @Test
    public void substrRepeatMS1() {
        String outdata = ssrms.substrRepeatMS("farhaan",2);
        assertEquals("farhaananan",outdata);

    }

    @Test
    public void substrRepeatMS2() {
        String outdata = ssrms.substrRepeatMS("farhaan",0);
        assertEquals("farhaan",outdata);

    }

    @Test
    public void substrRepeatMS3() {
        String outdata = ssrms.substrRepeatMS("farhaan",3);
        assertEquals("farhaanaanaanaan",outdata);

    }

    @Test
    public void substrRepeatMS4() {
        String outdata = ssrms.substrRepeatMS("z",1);
        assertEquals("zz",outdata);

    }
}