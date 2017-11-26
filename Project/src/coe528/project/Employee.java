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
 /**
 * REQUIRES:
 * MODIFIES:
 * EFFECTS:
 */

public class Employee {
    /**
     * OVERVIEW:
     */
    private static String s, ship;
    private static int i, orNum;
    
    private static String userInput(){
        Scanner user_input = new Scanner(System.in); 
        s = user_input.next();
        return s;
    }

    private static int userInputInt() {
        Scanner user_input = new Scanner(System.in);
        i = user_input.nextInt();
        return i;
    }

    protected static void PendingOrders() {
        /**
        * REQUIRES:
        * MODIFIES:
        * EFFECTS:
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
                if (oPri.equalsIgnoreCase("2Days")) {
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
        * EFFECTS:
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
        * REQUIRES:
        * MODIFIES:
        * EFFECTS:
        */
        while(true) {
            
            System.out.println("Enter Order Number:");
            System.out.println("When done type 000 to exit.");
            orNum = userInputInt(); 
            if (orNum == 000) {
                break;
            }
            for(Order o:Admin.Orders) {
                if(o.getOrderNumber() == orNum) {
                    System.out.println("Enter Shipping Company:");
                    ship = userInput();
                    o.setShip(ship);
                }
            }
        }
    }
}

