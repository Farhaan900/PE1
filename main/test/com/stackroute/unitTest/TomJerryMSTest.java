package com.stackroute.unitTest;


import org.junit.*;

import static org.junit.Assert.*;

public class TomJerryMSTest {

    TomJerryMS tjms ;
    @BeforeClass
    public static void oneTimeSetup (){
        System.out.println("setup complete");
    }

    @Before
    public void setUp() throws Exception {
        tjms = new TomJerryMS();

    }

    @After
    public void tearDown() throws Exception {

        tjms = null;
    }

    @Test
    public void tomJerry1() {


        String val = tjms.tomJerry(21);
        assertEquals("Tom",val);

    }

    @Test
    public void tomJerry2() {


        String val = tjms.tomJerry(22);
        assertEquals("Jerry",val);

    }

    @Test
    public void tomJerry3() {


        String val = tjms.tomJerry(55);
        assertEquals("Error",val);

    }

    @Test
    public void tomJerry4() {


        String val = tjms.tomJerry(1);
        assertEquals("Error",val);

    }

    @AfterClass
    public static void finalTeardown (){
        System.out.println("Teardown here");
    }

}