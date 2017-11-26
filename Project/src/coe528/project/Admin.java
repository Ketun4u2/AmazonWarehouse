/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;

import java.util.*;

/**
 *
 * @author k79patel
 */
/*
 * Will Initialize and close the file
 * Hold all the orders
 * View the Logs
 * 
 */
 

public class Admin {
    /**
     * OVERVIEW:
     */
    protected static ArrayList<Order> Orders = new ArrayList<>();
//    protected static ArrayList<>;


    protected static void ViewLogs() {
        System.out.println("------------ List of Pending Orders ------------");
        Employee.PendingOrders();
        System.out.println("------------ List of Shipped Orders ------------");
    }

}
