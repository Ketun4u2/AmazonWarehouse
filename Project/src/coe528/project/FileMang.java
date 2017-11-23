/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;

/**
 * @author k79patel
 */
/*
 * Manages the file operations:
 * Read
 * Write
 * Create
 * Clear
 * 
 */


import static java.nio.file.StandardOpenOption.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.*;
import java.io.*;
import java.nio.charset.Charset;

/**
 *
 * @author k79patel
 */
public abstract class FileMang {
    //Overview: An abstract class that is used to interact with files and user input


    private static Path file = Paths.get("./Orders.txt");
    private static ArrayList<String> info = new ArrayList<>();
    protected static Scanner scan = new Scanner(System.in);

    public static ArrayList<String> Read() {
        //Effects:Reads the text file ("Orders.txt") and
        // returns the raw info

        try (InputStream in = Files.newInputStream(file);
             BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
            String line;
            while ((line = reader.readLine()) != null) {
                info.add(line);
                // System.out.println(line);
            }
        } catch (IOException x) {
            System.err.println(x);
        }
        return info;
    }

    public static void Write(String s) {
        //Requires: The given String is in proper format
        //Modifies: Orders file
        //Effects: Takes the String and add its to the Orders file
        Charset charset = Charset.forName("US-ASCII");

        try (BufferedWriter writer = Files.newBufferedWriter(file, charset, APPEND)) {
            writer.write(s, 0, s.length());
            writer.newLine();
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }

    }

    public static void Create() {
        //Modifies: Orders file
        //Effects: Creates a new Orders file
        // if one doesn't already exist.
        try {
            // Create the empty file with default permissions, etc.
            Files.createFile(file);
            Write("Info Pending");
        } catch (FileAlreadyExistsException x) {
        } catch (IOException x) {
            // Some other sort of failure, such as permissions.
            System.err.format("createFile error: %s%n", x);
        }

    }

    public static void Reset() {
        //Modifies: Orders file
        //Effects: Clears the contents of the file.
        try {
            FileOutputStream writer = new FileOutputStream("./Orders.txt");
            writer.close();
        } catch (Exception x) {
            System.out.println("Error");
        }

    }

}