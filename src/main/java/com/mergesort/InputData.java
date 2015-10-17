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

    public static void chooseData() {
        System.out.println("\n Please choose input data: 1 - from txt files, 2 - from keyboard.\n Default input by keyboard, if the file does not exist!");
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
            int characterValue;
            while ((characterValue = reader.read()) != -1) {
                System.out.print((char) characterValue);
            }
        } catch (IOException ex) {
            System.out.println("Something was happend! :-(");
        }
    }

    private static int[] keyboardData() {
        Scanner in = new Scanner(System.in);
        int arrayLength = 0;

        boolean isLengthInCorrect = true;
        while (isLengthInCorrect) {
            System.out.print(" Enter the length of the array: ");
            try {
                String input = in.nextLine();
                arrayLength = Integer.parseInt(input);
                if (arrayLength > 0) isLengthInCorrect = false;
                else {
                    System.out.print(" Length cannot be \"0\" or negative, try again please.");
                }
            } catch (NumberFormatException e) {
                System.out.print(" Your entered not an \"Integer\" length, try again please.");
            }
        }
        System.out.println(" Input " + arrayLength + " numbers: ");
        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            boolean isElementInCorrect = true;
            while (isElementInCorrect) {
                try {
                    System.out.print(" ");
                    String input = in.nextLine();
                    array[i] = Integer.parseInt(input);
                    isElementInCorrect = false;
                } catch (NumberFormatException e) {
                    System.out.print(" Your entered not an \"Integer\" length, try again please.");
                }
            }
        }

        return array;
    }
}