package com.mergesort;


public class Main {
    public static void main(String[] args) {
        InputData.chooseData();

        int[] arr = {5, 17, 12, 7, 0, -5};
        MergeSort.doSort(arr);

    }
}
