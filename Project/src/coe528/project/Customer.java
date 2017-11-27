/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;

import java.util.Scanner;

/**
 *
 * @author k79patel
 */
/*
 * Makes Order
 * Views Order
 * Cancel Order
 * 
 */

public class Customer {
     /**
     * OVERVIEW: This class provides with all the methods for customer to create a new order and view the status of their previous order.
     */
  //  private static Scanner input = new Scanner(System.in);
    private static String s, oNum;
    private static int i;
    private static Scanner input = new Scanner(System.in);

    protected static void MakeOrder() {
        /**
        * REQUIRES: item number, name, location, and priority provided by the user. 
        * MODIFIES: creates new order object
        * EFFECTS: it takes all the information and then creates a new order object for the customer. 
        */
        
        int itemNum;
        String name, location, pri;
        //Display UI to create an order by customer
        System.out.println("Please enter your item number:");
        System.out.println("...just FYI, it doesn't have to mean anything...");
              
        itemNum = input.nextInt();
        System.out.println("Please enter name:");
        name = input.next();
        System.out.println("Please enter shipping location:");
        location = input.next();
        System.out.println("Please enter shipping priority from below:");
        System.out.println("SameDay");
        System.out.println("2Days");
        System.out.println("Standard");
        System.out.println("Free");
        System.out.println("Please, only one of the above given options. (Also, Match Cases, Thanks!)");
       
        pri = input.next();
        
        //Create a new order
        Order order = new Order(itemNum, name, location, pri);       
        //Add the new order to the array list in admin class
        Admin.Orders.add(order); 
    }
    
    
    protected static void ViewOrder() {
        /**
        * REQUIRES: int order number 
        * MODIFIES:
        * EFFECTS: takes the order number and searches for it and prints out all its details. 
        */
        
        int OrderNum;
        System.out.println("Please enter your order number:");
        OrderNum = input.nextInt();
        
        for(Order o:Admin.Orders) {
            if(o.getOrderNumber() == OrderNum) {
                o.ShippingDetails();
                return;
            }
        }
        System.out.println("Sorry, the order probably doesn't exist");
    }

    protected static void CancelOrder() {
        /**
        * REQUIRES: int order number 
        * MODIFIES: order object, deletes it
        * EFFECTS: takes the order number and deletes the order from the arraylist, if possible. 
        */
        
        int OrderNum;
        
        //Ask them for Order Number
        System.out.println("Please enter your order number:");
        OrderNum = input.nextInt();  //FileMang.scan.nextInt();  Only enter int values 
        
        //Search for the Order Number
        for(Order o:Admin.Orders) {
            if(o.getOrderNumber() == OrderNum) {
                if(o.canCancel()){
                  Admin.Orders.remove(o);
                  System.out.println("Your order has been canceled.");
                  return;
                }
                else{
                  System.out.println("We appologize but your order cannot be cancelled.");
                  System.out.println("If you are not satisfied you can always return the item");
                  return;
                } 
            }
        }
        System.out.println("Sorry, the order probably doesn't exist");

    }

}
