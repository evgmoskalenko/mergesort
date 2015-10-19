package com.mergesort;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.Random;

public class MergeSortTest {

    @Test()
    public void randomDataArrayForTestMergeSort() throws Exception {
        for (int i = 0; i < 5; i++) {
            int[] arr = new int[5];
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
    public void differentDemoDataArrayForTestMergeSort() throws Exception {
        int[] actualResults = {4, 7, 0, -10};
        int[] expectedResults = {-10, 0, 4, 7};
        MergeSort.doSort(actualResults);
        Assert.assertArrayEquals(expectedResults, actualResults);
    }

    @Test()
    public void identicDemoDataArrayForTestMergeSort() throws Exception {
        int[] actualResults = {4, 7, 0, -10, -7};
        int[] expectedResults = {4, 7, 0, -10, -7};
        MergeSort.doSort(actualResults);
        Arrays.sort(expectedResults);
        Assert.assertArrayEquals(expectedResults, actualResults);
    }

}