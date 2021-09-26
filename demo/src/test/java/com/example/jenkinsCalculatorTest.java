package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class jenkinsCalculatorTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void addTest()
    {
        jenkinsCalulator addTest = new jenkinsCalulator();
        assertEquals(10, addTest.addNum(5, 5));
    }

    @Test
    public void addSub()
    {
        jenkinsCalulator subTest = new jenkinsCalulator();
        assertEquals(0, subTest.subNum(5, 5));
    }
}
