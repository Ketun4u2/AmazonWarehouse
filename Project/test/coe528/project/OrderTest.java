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
public class OrderTest {

    public OrderTest() {
    }

    /*
    *Test of Constructor in Order Class
    * Testing boundary conditions of the String withs
     */
    @Test
    public void testConstructor() {
        //Testing with a standard working constructor
        Order test1 = new Order(232, "SampleName", "SampleAdr", "Standard");
        //Testing with empty string for name and location
        Order test2 = new Order(432, "", "", "Standard");
        //Testing with 1 char in both name and location
        Order test3 = new Order(444, "a", "b", "Standard");
    }

    /**
     *
     * Test of setPriority method, of class Order.
     *
     */
    @Test
    public void testSetPriority() {
        //Since the requirement states that the Priority must be one of the specified Priorities
        //We can test changing priority from any of the specified ones.
        Order test4 = new Order(12, "SampleN", "SampleA", "Standard");
        test4.setPriority("2Days");
        assertEquals(test4.getPriority(), "2Days");

        //While the ability to change priority is possible,
        // it isn't entirely logical nor is it an option in the actual complied code.
    }

    /**
     *
     * Test of setShip method, of class Order.
     *
     */
    @Test
    public void testSetShip() {
        //The requirement states the Shipper must be one of the listed speicified ones
        //so we can test changing from any of the speicified ones.
        Order test5 = new Order(432, "SAM", "Markan", "Standard");
        test5.setShip("CanadaPost");
        assertEquals(test5.getShipper(), "CanadaPost");

    }

    /*
     * Test of getOrderNumber method, of class Order.
     */
    @Test

    public void testGetOrderNumber() {
        //The test is trivial, only checking to see if the correct number is returned.
        //However, the one thing about Order number is it has to be unique. To test
        //this we can use 2 test cases to ensure that both of these are unique.
        //This test isn't exhaustive but it should be enough.
        Order test6 = new Order(21, "Kim", "Toronto", "2Days");
        assertEquals(test6.getOrderNumber(), 1);
        Order test7 = new Order(43, "Jack", "Beanstock", "SameDay");
        assertEquals(test7.getOrderNumber(), 2);

        //Based of the code, it is evident that the two numbers should be different, since
        //each time the constructor is called the count variable jumps up one, and it's this
        //count variable that is assigned to OrderNumber variable for each object.
    }

    /**
     *
     * Test of canCancel method, of class Order.
     *
     */
    @Test
    public void testCanCancel() {
        //This method returns if the Order based of a few variables. Firstly the order cannot have been shipped.
        //Second the priority of the Order must allow for cancellation. To test this we can use 3 cases which
        // should satisfy all these conditions.
        boolean expf = false;
        boolean expt = true;
        //Let's test a case with a Priority that doesn't allow cancellation, with no shipper.
        Order test8 = new Order(456, "K2N", "Ryerson", "SameDay");
        assertEquals(test8.canCancel(), expf);

        //Let's test with a Priority that allows cancellation and with no shipper.
        Order test9 = new Order(5422, "TheDean", "TheDeansOffice", "Standard");
        assertEquals(test9.canCancel(), expt);

        //Now a test case with a Priority that allows cancellation and a shipper
        Order test10 = new Order(75, "Librarian", "SLC 2nd", "Standard");
        test10.setShip("CanadaPost");

        assertEquals(test10.canCancel(), expf);

    }

    /**
     *
     * Test of ETA method, of class Order.
     *
     */
    @Test
    public void testETA() {
        System.out.println("ETA");
        Order instance = null;
        String expResult = "";
        String result = instance.ETA();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");

    }

    /**
     *
     * Test of ShipmentCreated method, of class Order.
     *
     */
    @Test
    public void testShipmentCreated() {

        System.out.println("ShipmentCreated");
        Order instance = null;
        String expResult = "";
        String result = instance.ShipmentCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");

    }

    /**
     *
     * Test of ShippingDetails method, of class Order.
     *
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
