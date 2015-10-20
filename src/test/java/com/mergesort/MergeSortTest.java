package com.mergesort;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import java.util.Arrays;
import java.util.Random;

public class MergeSortTest {

    @Test()
    public void evenValueDemoDataArray() throws Exception {
        int[] actualResults = {4, 7, 0, -10};
        int[] expectedResults = {-10, 0, 4, 7};
        MergeSort.doSort(actualResults);
        Assert.assertArrayEquals(expectedResults, actualResults);
    }

    @Test()
    public void oddValueForDemoDataArray() throws Exception {
        int[] actualResults = {4, 7, 0, -10, 100500};
        int[] expectedResults = {-10, 0, 4, 7, 100500};
        MergeSort.doSort(actualResults);
        Assert.assertArrayEquals(expectedResults, actualResults);
    }

    @Test()
    public void boundaryValueForDemoDataArray() throws Exception {
        int[] actualResults = {0, -1, 2, -2, 1};
        int[] expectedResults = {-2, -1, 0, 1, 2};
        MergeSort.doSort(actualResults);
        Assert.assertArrayEquals(expectedResults, actualResults);
    }

    @Test()
    public void boundaryIntTypeValueForDemoDataArray() throws Exception {
        int[] actualResults = {7, 0, -2147483648, 2147483647, 10};
        int[] expectedResults = {-2147483648, 0, 7, 10, 2147483647};
        MergeSort.doSort(actualResults);
        Assert.assertArrayEquals(expectedResults, actualResults);
    }

    @Test()
    public void identicalValueForDemoDataArray() throws Exception {
        int[] actualResults = {0, 1, 2, 0, 0};
        int[] expectedResults = {0, 0, 0, 1, 2};
        MergeSort.doSort(actualResults);
        Assert.assertArrayEquals(expectedResults, actualResults);
    }

    @Test()
    public void twoDifferentMethodsOfSorting() throws Exception {
        int[] actualResults = {4, 7, 0, -10, -7};
        int[] expectedResults = {4, 7, 0, -10, -7};
        MergeSort.doSort(actualResults);
        Arrays.sort(expectedResults);
        Assert.assertArrayEquals(expectedResults, actualResults);
    }

    @Ignore("Incorrect test!!! Should not to do, bad test.")
    @Test()
    public void randomValueDemoDataArray() throws Exception {
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
}