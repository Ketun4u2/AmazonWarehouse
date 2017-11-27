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
 */
public class Admin {

    /**
     * OVERVIEW: Maintains and holds the arraylist of orders and lets the
     * employee and customer access it.
     *
     * Abstraction Function: A list that contains all the orders in the form of
     * an Arraylist. For example the Arraylist {Order #1, Order #2...} is a list
     * containing all the orders The implementation of this list is done with
     * the use of an Arraylist, the Arraylist is only usable by the Employee and 
     * Customer classes. Naturally, it has all the operations an Arraylist would have.
     * Ex: View, Add, Delete.   Due to the nature of this implementation, there
     * is no abstraction function. At least not in this class. It can be found in the Order Class.
     *
     * Rep Invariant: The only condition on the rep is that all Order # must be
     * different. In other words, all the objects must be unique.
     */

    protected static ArrayList<Order> Orders = new ArrayList<>();
//    protected static ArrayList<>;

    protected static void ViewLogs() {
        System.out.println("------------ List of Pending Orders ------------");
        Employee.PendingOrders();
        System.out.println("------------ List of Shipped Orders ------------");
        Employee.ViewShippers();
    }

    public static boolean repOK() {
        int i, j;
        for (i = 0; i < Orders.size(); i++) {
            for (j = 0; j < Orders.size(); j++) {
                if (i != j) {
                    if (Orders.get(i).getOrderNumber() == Orders.get(j).getOrderNumber()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    

}
