package com.mergesort;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Please choose input data: 1 - from txt files, 2 - from keyboard.
 * If file does not exist - default input by keyboard.
 */

public class InputData {

    private static int[] array;

    public static int[] getArray() {
        chooseData();
        return array;
    }

    private static void chooseData() {
        System.out.println("\n Please choose input data: 1 - from txt files, 2 - from keyboard.\n Default input by keyboard, if the file does not exist!");
        Scanner in = new Scanner(System.in);
        System.out.print("\n Choose: ");
        String methodDataEntry = in.nextLine();
        try {
            if (Integer.parseInt(methodDataEntry) == 1) {
                filesData();
            } else {
                keyboardData();
            }
        } catch (NumberFormatException ex) {
            keyboardData();
        }
    }

    private static void filesData() {
        ClassLoader classLoader = InputData.class.getClassLoader();
        File file = new File(classLoader.getResource("InputSortedDataValuesArray.txt.txt").getFile());
        ArrayList<Integer> list = new ArrayList<>();

        try (Scanner in = new Scanner(file)) {
            while (in.hasNextInt()) {
                list.add(in.nextInt());
            }
        } catch (IOException ex) {
            System.out.println("Something was happend! :-(");
        }

        array = new int[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
    }

    private static void keyboardData() {
        Scanner in = new Scanner(System.in);
        int arrayLength = 0;
        boolean isLengthIncorrect = true;
        while (isLengthIncorrect) {
            System.out.print(" Enter the length of the array: ");
            try {
                String input = in.nextLine();
                arrayLength = Integer.parseInt(input);
                if (arrayLength > 0) isLengthIncorrect = false;
                else {
                    System.out.print(" Length cannot be \"0\" or negative, try again please.");
                }
            } catch (NumberFormatException e) {
                System.out.print(" Your entered not an \"Integer\" length, try again please.");
            }
        }
        System.out.println(" Input " + arrayLength + " numbers (-2147483648 to 2147483647): ");
        array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            boolean isElementIncorrect = true;
            while (isElementIncorrect) {
                try {
                    String input = in.nextLine();
                    array[i] = Integer.parseInt(input);
                    isElementIncorrect = false;
                } catch (NumberFormatException e) {
                    System.out.print(" Your entered not an \"Integer\" length, try again please.");
                }
            }
        }
    }
}