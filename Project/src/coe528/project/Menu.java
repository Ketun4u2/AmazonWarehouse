/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;

import java.io.File;
import java.lang.reflect.Constructor;
import java.util.*;

/**
 * @author k79patel
 */
public class Menu {
    private static int i, j;

    public static void main(String[] args) {
        //Effects: The main function. Initializes the orders from file on start, then runs
        // an indefinite loop which gives access to the menu interface. Upon exit
        // all the orders are saved to file and then program terminates.
        FileMang.Create();
        Admin.Initialize();
        while (i != 0) {
            Welcome();
            i = FileMang.scan.nextInt();
            switch (i) {
                case 1:
                    CustomerMenu();
                    break;
                case 2:
                    EmployeeLogin();
                    break;
                case 3:
                    AdminLogin();
                    break;
            }
        }
        Admin.Terminate();

    }

    protected static void Welcome() {
        //Effects: The basic menu screen
        System.out.println("");
        System.out.println("Welcome to The Amazon Warehouse");
        System.out.println("Press 0 to exit");
        System.out.println("Press 1 if Customer");
        System.out.println("Press 2 if Employee");
        System.out.println("Press 1 if Admin");
        System.out.println("");
    }

    protected static void CustomerMenu() {
        //Requires:
        //Modifies:
        //Effects: Menu interface for Customers. The menu options lead to other
        // functions found in other classes.

        j = 1;
        int value;
        System.out.println("Welcome  Guest");
        while (j != 0) {
            System.out.println("");
            System.out.println("Press 0 to Exit ");
            System.out.println("Press 1 to Make Order");
            System.out.println("Press 2 to View Order");
            System.out.println("");
            j = FileMang.scan.nextInt();
            switch (j) {
                case 1:
                    Customer.MakeOrder();
                    break;
                case 2:
                    Customer.ViewOrder();
                    break;
            }
        }

    }

    protected static void AdminMenu() {
        //Requires:
        //Modifies:
        //Effects: Menu interface for Admins. The menu options lead to other
        // functions found in other classes.

        j = 1;
        int value;
        System.out.println("Welcome  Admin");
        while (j != 0) {
            System.out.println("");
            System.out.println("Press 0 to Exit ");
            System.out.println("Press 1 to View Order Logs");
            System.out.println("");
            j = FileMang.scan.nextInt();
            switch (j) {
                case 1:
                    Admin.ViewLogs();
                    break;

            }
        }
    }

    protected static void EmployeeMenu() {
        //Requires:
        //Modifies:
        //Effects: Menu interface for Customers. The menu options lead to other
        // functions found in other classes.

        j = 1;
        int value;
        System.out.println("Welcome  Employee");
        while (j != 0) {
            System.out.println("");
            System.out.println("Press 0 to Exit ");
            System.out.println("Press 1 to View Pending Orders");
            System.out.println("Press 2 to View Shipping Providers");
            System.out.println("Press 3 to Create Shipment");
            System.out.println("");
            j = FileMang.scan.nextInt();
            switch (j) {
                case 1:
                    //Code to View all pending orders
                    Employee.PendingOrders();
                    break;
                case 2:
                    //Code to view Shipping Providers
                    Employee.ViewShippers();
                    break;
                case 3:
                    //Code for Creating Shipment
                    Employee.CreateShipment();
                    break;
            }
        }
    }

    protected static void AdminLogin() {
        //Code that verifies Admin
        if (Login("Admin", "Admin")) {
            AdminMenu();
        }
    }

    protected static void EmployeeLogin() {
        //Code that verifies Employee
        if (Login("Employee", "password")) {
            EmployeeMenu();
        }
    }

    protected static boolean Login(String ur, String ps) {
        String user, pass;
        System.out.println("Please Enter Username:");
        user = FileMang.scan.next();
        System.out.println("Please Enter Password");
        pass = FileMang.scan.next();

        if (user.equals(ur) && pass.equals(ps)) {
            return true;
        }

        System.out.println("Sorry, wrong info.");

        return false;
    }

    protected static Object Instantiate() throws Exception{
        String name;

        //System.out.println("Enter the name of class");
        name = FileMang.scan.next();
        Class c = Class.forName(name);
        //Still gotta deal with the other stuff
        return new Object();
    }


}
