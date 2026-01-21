/*
 * Filter Streams - Convert Uppercase to Lowercase
📌 Problem Statement:
Create a program that reads a text file and writes its contents into another file, converting all uppercase letters to lowercase.
Requirements:
Use FileReader and FileWriter.
Use BufferedReader and BufferedWriter for efficiency.
Handle character encoding issues.

 */

package Streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class UpperToLower {
    public static void main(String[] args) {

        try (
            BufferedReader br = new BufferedReader(
                    new FileReader("input.txt", StandardCharsets.UTF_8));
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("output.txt", StandardCharsets.UTF_8))
        ) {

            int ch;
            while ((ch = br.read()) != -1) {
                bw.write(Character.toLowerCase((char) ch));
            }

            System.out.println("File converted successfully.");

        } catch (IOException e) {
            System.out.println("Error while reading or writing file.");
        }
    }
}

