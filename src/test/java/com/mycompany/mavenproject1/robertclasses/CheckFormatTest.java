/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.robertclasses;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author robertrook
 */
public class CheckFormatTest {
    
    public CheckFormatTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isInteger method, of class CheckFormat.
     */
    @org.junit.Test
    public void testIsInteger() {
        System.out.println("isInteger");
        String str = "10";
        boolean expResult = true;
        boolean result = CheckFormat.isInteger(str);
        assertEquals(expResult, result);
        
        String str2 = "pop";
        boolean expResult2 = false;
        boolean result2 = CheckFormat.isInteger(str2);
        assertEquals(expResult2, result2);


    }

    /**
     * Test of isBigDecimal method, of class CheckFormat.
     */
    @org.junit.Test
    public void testIsBigDecimal() {
        System.out.println("isBigDecimal");
        String str = "";
        boolean expResult = false;
        boolean result = CheckFormat.isBigDecimal(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
