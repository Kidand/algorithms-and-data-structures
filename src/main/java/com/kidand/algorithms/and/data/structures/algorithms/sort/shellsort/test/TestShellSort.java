package com.kidand.algorithms.and.data.structures.algorithms.sort.shellsort.test;

import com.kidand.algorithms.and.data.structures.algorithms.sort.insertionsort.InsertionSort;
import com.kidand.algorithms.and.data.structures.algorithms.sort.mergesort.MergeSort;
import com.kidand.algorithms.and.data.structures.algorithms.sort.shellsort.ShellSort;
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
 * @description: TestShellSort
 * @author: Kidand
 * @date: 2020/12/3 11:08
 * Copyright © 2019-Kidand.
 */
public class TestShellSort {
    public static void main(String[] args) {
        int n = 1000000;

        Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
        Integer[] arr2 = Arrays.copyOf(arr, arr.length);
        Integer[] arr3 = Arrays.copyOf(arr, arr.length);
        Integer[] arr4 = Arrays.copyOf(arr, arr.length);

        SortingHelper.sortTest(ShellSort.class, "1", arr);
//        100万时插入排序需20分钟左右
//        SortingHelper.sortTest(InsertionSort.class, "2", arr2);
        SortingHelper.sortTest(ShellSort.class, "2", arr3);
        SortingHelper.sortTest(MergeSort.class, null, arr4);
    }
}
