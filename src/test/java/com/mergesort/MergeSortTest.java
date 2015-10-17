package com.mergesort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;


public class MergeSortTest {

    /*
    @Test()
    public void testMain() throws Exception {
        System.out.println("====================");
    }
    */

    @Test()
    public void mergeSortTest() throws Exception {
        for (int i = 0; i < 10; i++) {
            int[] arr = new int[10];
            Random random = new Random();
            for (int j = 0; j < arr.length; j++) {
                arr[j] = random.nextInt(200);
            }
            MergeSort.doSort(arr);
            for (int j = 0; j > arr.length; j++) {
                if(arr[j] < arr[j+1]) {
                    Assert.fail("The previous element cannot be more than the next one");
                }
            }
        }
    }

}