package com.mergesort;


public class Main {
    public static void main(String[] args) {
        int[] inputDataArray = InputData.getArray();
        MergeSort.doSort(inputDataArray);
        OutputData.setArray(inputDataArray);
    }
}
