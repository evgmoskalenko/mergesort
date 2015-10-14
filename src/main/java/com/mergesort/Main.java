package com.mergesort;


public class Main {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] arr = {5, 17, 12, 7};
        mergeSort.sortArray(arr);

        for (int i : mergeSort.getResult()) {
            System.out.print(i + " ");
        }
    }
}
