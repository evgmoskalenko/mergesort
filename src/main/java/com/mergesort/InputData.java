package com.mergesort;

import jdk.internal.util.xml.impl.Input;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Please choose input data: 1 - from txt files, 2 - from keyboard.
 * If file does not exist - default input by keyboard.
 */

public class InputData {
//     public static void main(String[] args) {
//            chooseData();
//     }

    public static void chooseData() {
        System.out.println("\n Please choose input data: 1 - from txt files, 2 - from keyboard.\n If you choose: '1', and the file does not exist - default input by keyboard");
        Scanner in = new Scanner(System.in);
        System.out.println("\n Choose: 1 - from txt files, 2 - from keyboard");
        int methodDataEntry = in.nextInt();
        if (methodDataEntry == 1) {
            //System.out.println("\nYour choose: 1 - from txt files");
            filesData();
        } else {
            //System.out.println("\nYour choose: 2 - from keyboard");
            keyboardData();
        }
    }

    public static void filesData() {

        ClassLoader classLoader = InputData.class.getClassLoader();
        File file = new File(classLoader.getResource("inputdata.txt").getFile());

        try (FileReader reader = new FileReader(file)) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
                //inputStream = new BufferedReader(new FileReader("xanadu.txt"));
                //http://www.mkyong.com/java/how-to-read-file-from-java-bufferedinputstream-example/
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        //int[] array = new int[];
        //return array;
    }

    public static int[] keyboardData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int arrayLength = in.nextInt();
        System.out.println("Input " + arrayLength + " numbers");
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            int inputDataNumber = in.nextInt();
            array[i] = inputDataNumber;
        }
        return array;
    }
}