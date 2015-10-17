package com.mergesort;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Output data: 1 - to txt files, 2 - to console.
 * Default output to console!
 */

public class OutputData {

    public static void ChooseOutput(int[] array) {
        System.out.println("\n Please choose output data: 1 - to txt file, 2 - to console.\n Default output to console!");
        Scanner in = new Scanner(System.in);
        System.out.println("\n Choose: ");
        int methodOutput = in.nextInt();
        if (methodOutput == 1) {
            writeToFile(array);
        } else {
            consoleOutput(array);
        }
    }

    private static void writeToFile(int[] array) {

        ClassLoader classLoader = OutputData.class.getClassLoader();
        File file = new File(classLoader.getResource("outputdata.txt").getFile());
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (int i : array) {
                writer.write(i + " ");
            }
        } catch (IOException e) {
            System.err.println("Something wrong");
        }
    }

    private static void consoleOutput(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
