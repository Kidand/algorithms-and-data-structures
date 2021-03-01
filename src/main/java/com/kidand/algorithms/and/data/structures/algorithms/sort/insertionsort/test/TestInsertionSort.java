package com.kidand.algorithms.and.data.structures.algorithms.sort.insertionsort.test;

import com.kidand.algorithms.and.data.structures.algorithms.sort.insertionsort.InsertionSort;
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
 * @description: TestInsertionSort
 * @author: Kidand
 * @date: 2020/8/6 17:35
 * Copyright © 2019-Kidand.
 */
public class TestInsertionSort {
    public static void main(String[] args) {
        int[] dataSize = {10000, 100000};
        for (int n : dataSize) {
            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
            Integer[] arr2 = Arrays.copyOf(arr, arr.length);

            //测试排序
            SortingHelper.sortTest(InsertionSort.class,"1", arr);
            //测试优化排序
            SortingHelper.sortTest(InsertionSort.class,"2", arr2);
        }
    }
}
