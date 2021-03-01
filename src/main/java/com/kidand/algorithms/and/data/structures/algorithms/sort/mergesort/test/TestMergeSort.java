package com.kidand.algorithms.and.data.structures.algorithms.sort.mergesort.test;

import com.kidand.algorithms.and.data.structures.algorithms.sort.insertionsort.InsertionSort;
import com.kidand.algorithms.and.data.structures.algorithms.sort.mergesort.MergeSort;
import com.kidand.algorithms.and.data.structures.algorithms.sort.mergesort.MergeSortBottomUp;
import com.kidand.algorithms.and.data.structures.algorithms.sort.selectionsort.SelectionSort;
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
 * @description: TestMergeSort 测试归并排序
 * @author: Kidand
 * @date: 2020/8/17 14:58
 * Copyright © 2019-Kidand.
 */
public class TestMergeSort {
    public static void main(String[] args) {
        int n = 5000000;
        Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
        Integer[] arr2 = Arrays.copyOf(arr, arr.length);
        Integer[] arr3 = Arrays.copyOf(arr, arr.length);
        Integer[] arr4 = Arrays.copyOf(arr, arr.length);

//        SortingHelper.sortTest(SelectionSort.class,null, arr);
//        SortingHelper.sortTest(InsertionSort.class,2, arr2);
        SortingHelper.sortTest(MergeSort.class, null, arr3);
        SortingHelper.sortTest(MergeSortBottomUp.class, null, arr4);
    }
}
