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
    protected static ArrayList<Order> Orders = new ArrayList<>();
//    protected static ArrayList<>;

    protected static void Initialize() {};
    protected static void Terminate() {};

    protected static void ViewLogs() {};

    protected static Object Instantiate() throws Exception{
        String name;

        //System.out.println("Enter the name of class");
        name = FileMang.scan.next();
        Class c = Class.forName(name);
        //Still gotta deal with the other stuff
        return new Object();
    }



}
