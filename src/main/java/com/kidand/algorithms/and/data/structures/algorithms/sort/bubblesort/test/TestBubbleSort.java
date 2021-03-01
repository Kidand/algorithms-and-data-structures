package com.kidand.algorithms.and.data.structures.algorithms.sort.bubblesort.test;

import com.kidand.algorithms.and.data.structures.algorithms.sort.bubblesort.BubbleSort;
import com.kidand.algorithms.and.data.structures.util.ArrayGenerator;
import com.kidand.algorithms.and.data.structures.util.SortingHelper;

import java.util.Arrays;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: TestBubbleSort
 * @author: Kidand
 * @date: 2020/11/23 16:31
 * Copyright © 2019-Kidand.
 */
public class TestBubbleSort {
    public static void main(String[] args) {
        int n = 100000;
        Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
        Integer[] arr2 = Arrays.copyOf(arr, arr.length);
        Integer[] arr3 = Arrays.copyOf(arr, arr.length);

        System.out.println("Random Array");
        SortingHelper.sortTest(BubbleSort.class, "1", arr);
        SortingHelper.sortTest(BubbleSort.class, "2", arr2);
        SortingHelper.sortTest(BubbleSort.class, "3", arr3);
        System.out.println();

        arr = ArrayGenerator.generateOrderedArray(n);
        arr2 = Arrays.copyOf(arr, arr.length);
        arr3 = Arrays.copyOf(arr, arr.length);

        System.out.println("Ordered Array");
        SortingHelper.sortTest(BubbleSort.class, "1", arr);
        SortingHelper.sortTest(BubbleSort.class, "2", arr2);
        SortingHelper.sortTest(BubbleSort.class, "3", arr3);
    }
}
