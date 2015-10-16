package com.mergesort;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ${freedomserg} on 16.10.2015.
 */
public class OutputData {
    private static final String filePath = "D:\\study_area\\projects\\mergesort\\files\\outputdata.txt";

    public static void ChooseOutput(int[] array) {
        System.out.println("\n Please choose output data: 1 - to txt file, 2 - to console.\n If you choose: '1', and the file does not exist - default output to console");
        Scanner in = new Scanner(System.in);
        System.out.println("\n Choose: 1 - to txt file, 2 - to console");
        int methodOutput = in.nextInt();
        if (methodOutput == 1) {
            //System.out.println("\nYour choose: 1 - to txt file");
            writeToFile(array);
        } else {
            //System.out.println("\nYour choose: 2 - to console");
            consoleOutput(array);
        }
    }

    private static void writeToFile(int[] array) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
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
