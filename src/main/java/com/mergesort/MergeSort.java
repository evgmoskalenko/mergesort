package com.mergesort;

public class MergeSort {
    private int[] result;

    public int[] getResult() {
        return result;
    }

    public int[] sortArray(int[] array) {
        if (array.length < 2) return array;
        int middleIndex = array.length / 2;
        return mergeSort(sortArray(copyArray(array, 0, middleIndex - 1)),
                    sortArray(copyArray(array, middleIndex, array.length - 1)));
    }

    private int[] copyArray(int[] array, int low, int high) {
        int[] newArray = new int[high - low + 1];
        for (int i = low, j = 0; i <= high && j < newArray.length; i++, j++) {
            newArray[j] = array[i];
        }
        return newArray;
    }

    private int[] mergeSort(int[] a, int[] b) {
        int resultLength = a.length + b.length;
        result = new int[resultLength];
        int k = 0;
        int m = 0; //counters of indexes of input arrays

        for (int i = 0; i < resultLength; i++) {
            if (k < a.length && m < b.length) {
                if (a[k] < b[m]) {
                    result[i] = a[k];
                    k++;
                } else {
                    result[i] = b[m];
                    m++;
                }
            } else if (k < a.length) {
                result[i] = a[k];
                k++;
            } else {
                result[i] = b[m];
                m++;
            }
        }
        return result;
    }
}