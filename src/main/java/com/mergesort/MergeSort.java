package com.mergesort;

public class MergeSort {

    public static void setArray(int[] array) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        separateArray(array, leftIndex, rightIndex);
    }

    private static void separateArray(int[] array, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;
            separateArray(array, leftIndex, middleIndex);
            separateArray(array, middleIndex + 1, rightIndex);
            mergeSort(array, leftIndex, middleIndex, rightIndex);
        }
    }

    private static void mergeSort(int[] array, int leftIndex, int middleIndex, int rightIndex) {
        int[] buffer = new int[array.length];
        int leftLength = middleIndex - leftIndex + 1;
        int rightLength = rightIndex - middleIndex;

        int k = 0;
        int m = 0; //counters of indexes of input arrays

        for (int i = 0; i < array.length; i++) {
            if (k < leftLength && m < rightLength) {
                if (buffer[k] < buffer[m]) {
                    array[i] = buffer[k];
                    k++;
                } else {
                    array[i] = buffer[m];
                    m++;
                }
            } else if (k < leftLength) {
                array[i] = buffer[k];
                k++;
            } else {
                array[i] = buffer[m];
                m++;
            }
        }
    }
}