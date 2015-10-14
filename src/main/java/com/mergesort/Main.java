package com.mergesort;


public class Main {
    public static void main(String[] args) {
        InputData inputData = new InputData();
        inputData.chooseData();

        MergeSort mergeSort = new MergeSort();
        int[] arr = {5, 7, 8, 10};
        mergeSort.sortArray(arr);
    }
}
