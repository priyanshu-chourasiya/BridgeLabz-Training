/*
 * . File Handling - Read and Write a Text File
📌 Problem Statement:
Write a Java program that reads the contents of a text file and writes it into a new file. If the source file does not exist, display an appropriate message.
Requirements:
Use FileInputStream and FileOutputStream.
Handle IOException properly.
Ensure that the destination file is created if it does not exist.

 */

package Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // source file
            fis = new FileInputStream("source.txt");

            // destination file (created if not exists)
            fos = new FileOutputStream("destination.txt");

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully.");

        } 
        catch (IOException e) {
            System.out.println("Source file not found or error occurred.");
        } finally {
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                System.out.println("Error while closing files.");
            }
        }
    }
}
