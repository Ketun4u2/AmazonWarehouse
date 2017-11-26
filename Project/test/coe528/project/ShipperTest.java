/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ketup
 */
public class ShipperTest {
    
    public ShipperTest() {
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
     * Test of ETA method, of class Shipper.
     */
    @Test
    public void testETA() {
        System.out.println("ETA");
        Shipper instance = null;
        String expResult = "";
        String result = instance.ETA();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ShipmentCreated method, of class Shipper.
     */
    @Test
    public void testShipmentCreated() {
        System.out.println("ShipmentCreated");
        Shipper instance = null;
        String expResult = "";
        String result = instance.ShipmentCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shipperName method, of class Shipper.
     */
    @Test
    public void testShipperName() {
        System.out.println("shipperName");
        Shipper instance = null;
        String expResult = "";
        String result = instance.shipperName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ShipperImpl extends Shipper {

        public ShipperImpl() {
            super("", "", 0);
        }

        public String shipperName() {
            return "";
        }
    }
    
}
