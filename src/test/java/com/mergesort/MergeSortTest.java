package com.mergesort;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.Random;

public class MergeSortTest {

    @Test()
    public void mergeSortTest() throws Exception {
        for (int i = 0; i < 100; i++) {
            int[] arr = new int[50];
            Random random = new Random();
            for (int j = 0; j < arr.length; j++) {
                arr[j] = random.nextInt(200);
            }
            MergeSort.doSort(arr);
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    Assert.fail("The previous element cannot be more than the next one");
                }
            }
        }
    }

    @Test()
    public void mergeSortTest2() throws Exception {
        int[] initial = {4, 7, 0, -10};
        int[] expected = {-10, 0, 4, 7};
        MergeSort.doSort(initial);
        Assert.assertArrayEquals(expected, initial);
    }

    @Test()
    public void mergeSortTest3() throws Exception {
        int[] initial = {4, 7, 0, -10, -7};
        int[] expected = {4, 7, 0, -10, -7};
        MergeSort.doSort(initial);
        Arrays.sort(expected);
        Assert.assertArrayEquals(expected, initial);
    }

}