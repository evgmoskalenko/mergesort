package com.mergesort;

import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.util.InputMismatchException;
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
        System.out.println("\n Please choose input data: 1 - from txt files, 2 - from keyboard.\n Default input by keyboard, if the file does not exist");
        Scanner in = new Scanner(System.in);
        System.out.print("\n Choose: ");
        int methodDataEntry = in.nextInt();
        if (methodDataEntry == 1) {
            filesData();
        } else {
            keyboardData();
        }
    }

    public static void filesData() {
        ClassLoader classLoader = InputData.class.getClassLoader();
        File file = new File(classLoader.getResource("inputdata.txt").getFile());

        try (FileReader reader = new FileReader(file)) {
            int foobar;
            while ((foobar = reader.read()) != -1) {
                System.out.print((char) foobar);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
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