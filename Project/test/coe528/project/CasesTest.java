/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;

import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ketup
 */
public class CasesTest {
    
    /**
     * Test of setPriority method, of class Order.
     * Given a valid Case
     */
    @Test
    public void testSetPriority() {
        System.out.println("setPriority - Valid Case");
        String name = ("SameDay");
        Order test = new Order(255, "SampleName", "SampleAdr", "Standard");
        test.setPriority(name);
        assertEquals(name,test.getPriority());
    }
    
    /*
    *Test of setPriority of Class Order
    *Given an invalid Case
    *Needs to catch an Exception
    */
    @Test
    public void testInvalidSetPriority() {     
        System.out.println("setPriority - Invalid Case");
        String name = ("Premium");
        Order test = new Order(255, "SampleName", "SampleAdr", "Standard");
        test.setPriority(name);
    }
    
    
    
}
