package com.mergesort;

public class Sort {

    public int[] sortArray(int[] array) {

        int[] x = null;
        int[] y = null;

        if (array.length > 1) {

            int middleIndex = array.length / 2;
            x = sortArray(copyArray(array, 0, middleIndex));
            y = sortArray(copyArray(array, middleIndex + 1, array.length - 1));
        }
        return mergeSort(x, y);
    }

    public int[] copyArray(int[] array, int low, int high) {

        int[] newArray = null;
        for (int i = low; i < high; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }

    public int[] mergeSort(int[] a, int[] b) {
        int[] result = null;
        int resultLength = a.length + b.length;
        int k = 0,m = 0; //счетчики индексов входящих массивов

        for (int i = 0; i < resultLength; i++) {
            if (k <= a.length && m <= b.length) {
                if (a[k] < b[m]) {
                    result[i] = a[k];
                    k++;
                } else {
                    result[i] = b[m];
                    m++;
                }
            } else if (k <= a.length) {
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