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
 * View Pending Orders
 * Creates Shipments
 *
 * MAKE getOrderNumber and getPriority
 */

public class Employee {
    /**
     * OVERVIEW: This class provides all the functions for employee like viewing pending orders and then assigning their shipper appropriately. 
     */
    private static Scanner input = new Scanner(System.in);
    private static String ship;
    private static int orNum;
    
    protected static void PendingOrders() {
        /**
        * REQUIRES:
        * MODIFIES:
        * EFFECTS: Returns all the pending orders to be shipped in a sorted manner under their priority. 
        */
        String oPri, oStat;

        System.out.println("Shipping Priority: Same Day");
        for (Order o : Admin.Orders) {
            oStat = o.getShipper();

            if (oStat.equalsIgnoreCase("Pending")) {
                oPri = o.getPriority();
                if (oPri.equalsIgnoreCase("SameDay")) {
                    System.out.println("Order Number:" + o.getOrderNumber());
                }
            }
        }
        System.out.println("Shipping Priority: 2 Days");
        for (Order o : Admin.Orders) {
            oStat = o.getShipper();

            if (oStat.equalsIgnoreCase("Pending")) {
                oPri = o.getPriority();
                if (oPri.equalsIgnoreCase("TwoDays")) {
                    System.out.println("Order Number:" + o.getOrderNumber());
                }
            }
        }

        System.out.println("Shipping Priority: Standard");
        for (Order o : Admin.Orders) {
            oStat = o.getShipper();
            if (oStat.equalsIgnoreCase("Pending")) {
                oPri = o.getPriority();
                if (oPri.equalsIgnoreCase("Standard")) {
                    System.out.println("Order Number:" + o.getOrderNumber());
                }
            }
        }


        System.out.println("Shipping Priority: Free");
        for (Order o : Admin.Orders) {
            oStat = o.getShipper();

            if (oStat.equalsIgnoreCase("Pending")) {
                oPri = o.getPriority();
                if (oPri.equalsIgnoreCase("Free")) {
                    System.out.println("Order Number:" + o.getOrderNumber());
                }
            }
        }       
    }            
    protected static void ViewShippers() {
        /**
        * REQUIRES:
        * MODIFIES:
        * EFFECTS: Just displays the available shipping methods for employee to see. 
        */
        String oPri1, oStat1; 
        
        System.out.println("Shipping Company: FedEx");
        for(Order o:Admin.Orders) {
            oStat1 = o.getShipper();
                      
            if(oStat1.equalsIgnoreCase("FedEx")){
                oPri1 = o.getPriority();
                System.out.println("Order Number:" + o.getOrderNumber());       
            }
        }
        
        System.out.println("Shipping Company: Canada Post");
        for(Order o:Admin.Orders) {
            oStat1 = o.getShipper();
                      
            if(oStat1.equalsIgnoreCase("CanadaPost")){
                oPri1 = o.getPriority();
                System.out.println("Order Number:" + o.getOrderNumber());   
            }
        }
        
        System.out.println("Shipping Company: UPS");
        for(Order o:Admin.Orders) {
            oStat1 = o.getShipper();
                      
            if(oStat1.equalsIgnoreCase("UPS")){
                oPri1 = o.getPriority();
                System.out.println("Order Number:" + o.getOrderNumber());   
            }
        }

    }

    protected static void CreateShipment() {
        /**
        * REQUIRES: int Order number provided by the user.
        * MODIFIES: shipper of the specific orders 
        * EFFECTS: Takes the order numbers and changes their shipper variable with the shipping method.
        */
        while(true) {
            
            System.out.println("Enter Order Number:");
            System.out.println("When done type 000 to exit.");
            orNum = input.nextInt();
            if (orNum == 000) {
                break;
            }
            for(Order o:Admin.Orders) {
                if(o.getOrderNumber() == orNum) {
                    System.out.println("Enter Shipping Company:");
                    ship = input.next();
                    o.setShip(ship);
                }
            }
        }
    }
}

