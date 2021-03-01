package com.kidand.algorithms.and.data.structures.algorithms.sort.quicksort.test;

import com.kidand.algorithms.and.data.structures.algorithms.sort.mergesort.MergeSort;
import com.kidand.algorithms.and.data.structures.algorithms.sort.quicksort.QuickSort;
import com.kidand.algorithms.and.data.structures.algorithms.sort.quicksort.QuickSortThreeWays;
import com.kidand.algorithms.and.data.structures.algorithms.sort.quicksort.QuickSortTwoWays;
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
 * @description: TestQuickSort 测试快速排序
 * @author: Kidand
 * @date: 2020/8/21 14:19
 * Copyright © 2019-Kidand.
 */
public class TestQuickSort {
    public static void main(String[] args) {
        int n = 1000000;
        //生成随机数组
        Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
        Integer[] arr2 = Arrays.copyOf(arr, arr.length);
        Integer[] arr3 = Arrays.copyOf(arr, arr.length);
        Integer[] arr4 = Arrays.copyOf(arr, arr.length);

        System.out.println("Random Array");
        SortingHelper.sortTest(MergeSort.class, "1", arr);
        SortingHelper.sortTest(QuickSort.class, null, arr2);
        SortingHelper.sortTest(QuickSortTwoWays.class, null, arr3);
        SortingHelper.sortTest(QuickSortThreeWays.class, null, arr4);
        System.out.println();

        //生成有序数组
        arr = ArrayGenerator.generateOrderedArray(n);
        arr2 = Arrays.copyOf(arr, arr.length);
        arr3 = Arrays.copyOf(arr, arr.length);
        arr4 = Arrays.copyOf(arr, arr.length);

        System.out.println("Ordered Array");
        SortingHelper.sortTest(MergeSort.class, "1", arr);
        SortingHelper.sortTest(QuickSort.class, null, arr2);
        SortingHelper.sortTest(QuickSortTwoWays.class, null, arr3);
        SortingHelper.sortTest(QuickSortThreeWays.class, null, arr4);
        System.out.println();

        arr = ArrayGenerator.generateRandomArray(n, 1);
        arr2 = Arrays.copyOf(arr, arr.length);
        arr3 = Arrays.copyOf(arr, arr.length);
        arr4 = Arrays.copyOf(arr, arr.length);

        System.out.println("Same Value Array");
        SortingHelper.sortTest(MergeSort.class, "1", arr);
//        SortingHelper.sortTest(QuickSort.class, null, arr2);
        SortingHelper.sortTest(QuickSortTwoWays.class, null, arr3);
        SortingHelper.sortTest(QuickSortThreeWays.class, null, arr4);
    }
}
