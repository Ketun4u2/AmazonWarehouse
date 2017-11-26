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
    
    private static String s, oNum;
    private static int i;
    
    private static String userInput(){
        Scanner user_input = new Scanner(System.in); 
        s = user_input.next();
        return s; 
    }
      
    private static int userInputInt(){
        Scanner user_input = new Scanner(System.in); 
        i = user_input.nextInt();
        return i; 
    }

    protected static void MakeOrder() {
        int itemNum;
        String name, location, pri;
        //Display UI to create an order by customer
        System.out.println("Please enter your item number:");
        itemNum = userInputInt();
        System.out.println("Please enter customer name:");
        name = userInput();
        System.out.println("Please enter shipping location:");
        location = userInput();
        System.out.println("Please enter shipping priority from below:");
        System.out.println("SameDay");
        System.out.println("2Days");
        System.out.println("Standard");
        System.out.println("Free");
        pri = userInput();
        
        //Create a new order
        Order order = new Order(itemNum, name, location, pri);       
        //Add the new order to the array list in admin class
        Admin.Orders.add(order); 
    }
    
    
    protected static void ViewOrder() {
        int OrderNum;
        //Ask them for Order Number
        System.out.println("Please enter your order number:");
        OrderNum = userInputInt();  //FileMang.scan.nextInt();  Only enter int values 
        
        //Search for the Order Number
        for(Order o:Admin.Orders) {
            if(o.getOrderNumber() == OrderNum) {
                //Continue
                o.ShippingDetails();
            }
        }
    }

    protected static void CancelOrder() {
        int OrderNum;
        
        //Ask them for Order Number
        System.out.println("Please enter your order number:");
        OrderNum = userInputInt();  //FileMang.scan.nextInt();  Only enter int values 
        
        //Search for the Order Number
        for(Order o:Admin.Orders) {
            if(o.getOrderNumber() == OrderNum) {
                oNum = o.getOrderStatus();
                //Need a method to check order status.
                //if(oNum.equalsIgnoreCase("Pending")){
                //  Admin.Orders.remove(o);
                //  System.out.println("Your order has been canceled.");
                //}
                //else{
                //  System.out.println("We appologies but your order cannt be canceled. It is already in transit and should arrive by:" + o.ETA());
                //} 
            }
        } 
    }

}
