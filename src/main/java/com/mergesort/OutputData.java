package com.mergesort;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Output data: 1 - to txt files, 2 - to console.
 * Default output to console!
 */

public class OutputData {
    private static final String fileName = "D://SortedDataValuesArray.txt";

    public static void chooseOutput(int[] array) {
        System.out.println("\n Please choose output data: 1 - to txt file, 2 - to console.\n Default output to console!");
        Scanner in = new Scanner(System.in);
        System.out.print("\n Choose: ");
        String methodOutput = in.nextLine();
        try {
            if (Integer.parseInt(methodOutput) == 1) {
                writeToFile(array);
            } else {
                consoleOutput(array);
            }
        } catch (NumberFormatException e) {
            consoleOutput(array);
        }
    }

    /*
    private static void writeToFile(int[] array) {

        ClassLoader classLoader = OutputData.class.getClassLoader();
        File file = new File(classLoader.getResource("SortedDataValuesArray.txt").getFile());
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (int i : array) {
                writer.write(i + " ");
            }
        } catch (IOException e) {
            System.err.println("Something wrong");
        }
    }
    */

    private static void writeToFile(int[] array) {
        File file = new File(fileName);
        try (PrintWriter writer = new PrintWriter(file.getAbsoluteFile())) {
            for (int i : array) {
                writer.print(i + " ");
            }
        } catch (IOException e) {
            System.err.println("Something wrong");
        }
    }

    private static void consoleOutput(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
