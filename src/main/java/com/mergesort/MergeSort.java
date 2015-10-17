package com.mergesort;

import java.util.Arrays;

public class MergeSort {

    public static void doSort(int[] array) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        splitArray(array, leftIndex, rightIndex);
    }

    private static void splitArray(int[] array, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;
            splitArray(array, leftIndex, middleIndex);
            splitArray(array, middleIndex + 1, rightIndex);
            mergeSort(array, leftIndex, middleIndex, rightIndex);
        }
    }

    private static void mergeSort(int[] array, int leftIndex, int middleIndex, int rightIndex) {
        int[] buffer = new int[array.length];

        int k = leftIndex;
        int m = middleIndex + 1; //counters of indexes of input parts

        for (int i = leftIndex; i <= rightIndex; i++) {
            buffer[i] = array[i];
        }

        for (int i = leftIndex; i <= rightIndex; i++) {
            if (k <= middleIndex && m <= rightIndex) {
                if (buffer[k] < buffer[m]) {
                    array[i] = buffer[k];
                    k++;
                } else {
                    array[i] = buffer[m];
                    m++;
                }
            } else if (k <= middleIndex) {
                array[i] = buffer[k];
                k++;
            } else {
                array[i] = buffer[m];
                m++;
            }
        }
    }
}