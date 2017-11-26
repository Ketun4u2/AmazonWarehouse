/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;

import java.util.Scanner;
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
public class OrderTest {
    
    public OrderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        Order test = new Order(255, "SampleName", "SampleAdr", "Standard");
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
    
    
    @Test
    public void constructor() {
      
    }

    /**
     * Test of setPriority method, of class Order.
     */
    @Test
    public void testSetPriority() {
        System.out.println("setPriority");
        String name = "coe528.project.Standard";
        
        instance.setPriority("");
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setShip method, of class Order.
     */
    @Test
    public void testSetShip() {
        System.out.println("setShip");
        String name = "";
        Order instance = null;
        instance.setShip(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ShippingDetails method, of class Order.
     */
    @Test
    public void testShippingDetails() {
        System.out.println("ShippingDetails");
        Order instance = null;
        instance.ShippingDetails();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
