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
    private static String s, ship;
    private static int i;

    private static String userInput() {
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
        String oPri, oStat;
        System.out.println("Shipping Priority: Same Day");
        for (Order o : Admin.Orders) {
            oStat = o.getOrderStatus();

            if (oStat.equalsIgnoreCase("Pending")) {
                oPri = o.getPriority();
                if (oPri.equalsIgnoreCase("SameDay")) {
                    System.out.println("Order Number:" + o.getOrderNumber());
                }
            }
        }
        System.out.println("Shipping Priority: 2 Days");
        for (Order o : Admin.Orders) {
            oStat = o.getOrderStatus();

            if (oStat.equalsIgnoreCase("Pending")) {
                oPri = o.getPriority();
                if (oPri.equalsIgnoreCase("2Days")) {
                    System.out.println("Order Number:" + o.getOrderNumber());
                }
            }
        }

        System.out.println("Shipping Priority: Standard");
        for (Order o : Admin.Orders) {
            oStat = o.getOrderStatus();

            if (oStat.equalsIgnoreCase("Pending")) {
                oPri = o.getPriority();
                if (oPri.equalsIgnoreCase("Standard")) {
                    System.out.println("Order Number:" + o.getOrderNumber());
                }
            }
        }

        System.out.println("Shipping Priority: Free");
        for (Order o : Admin.Orders) {
            oStat = o.getOrderStatus;

            if (oStat.equalsIgnoreCase("Pending")) {
                oPri = o.getPriority();
                if (oPri.equalsIgnoreCase("Free")) {
                    System.out.println("Order Number:" + o.getOrderNumber());
                }
            }
        }
    }

    protected static void ViewShippers() {

        System.out.println("Shipping Company: FedEx");

        System.out.println("Shipping Company: CanadaPost");

        System.out.println("Shipping Company: UPS");

    }

    protected static void CreateShipment() {

        System.out.println("Enter Shipping Company:");
        ship = userInput();

        if (ship.equalsIgnoreCase("FedEx")) {
            System.out.println("Enter Shipping Company:");
        }

    }

}
