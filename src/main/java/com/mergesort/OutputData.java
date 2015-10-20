package com.mergesort;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Output data: 1 - to txt files, 2 - to console.
 * Default output to console!
 */

public class OutputData {

    private static final String currentDir = System.getProperty("user.dir");
    private static final String fs = System.getProperty("file.separator");
    private static final String dirFileInProject = fs + "files" + fs + "OutputSortedDataValuesArray.txt";

    public static void setArray(int[] array) {
        chooseOutput(array);
    }

    private static void chooseOutput(int[] array) {
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

    private static void writeToFile(int[] array) {

        File file = new File(currentDir, dirFileInProject);

        try (PrintWriter writer = new PrintWriter(file.getAbsoluteFile())) {
            for (int i : array) {
                writer.print(i + " ");
            }
        } catch (IOException e) {
            System.err.println(" Something wrong!");
        }
    }

    private static void consoleOutput(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
