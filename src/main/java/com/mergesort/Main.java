package com.mergesort;


public class Main {
    public static void main(String[] args) {
        InputData inputData = new InputData();
        inputData.chooseData();

        MergeSort mergeSort = new MergeSort();
        int[] arr = {5, 17, 12, 7};
        mergeSort.sortArray(arr);

        for (int i : mergeSort.getResult()) {
            System.out.print(i + " ");
        }
    }
}
