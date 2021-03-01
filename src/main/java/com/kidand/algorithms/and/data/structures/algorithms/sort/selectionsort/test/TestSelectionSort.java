package com.kidand.algorithms.and.data.structures.algorithms.sort.selectionsort.test;

import com.kidand.algorithms.and.data.structures.algorithms.sort.selectionsort.SelectionSort;
import com.kidand.algorithms.and.data.structures.util.ArrayGenerator;
import com.kidand.algorithms.and.data.structures.util.SortingHelper;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: TestSelectionSort
 * @author: Kidand
 * @date: 2020/8/5 14:46
 * Copyright © 2019-Kidand.
 */
public class TestSelectionSort {
    public static void main(String[] args) {
        int[] dataSize = {10000, 100000};
        for (int n : dataSize) {
            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
            //测试排序
            SortingHelper.sortTest(SelectionSort.class,null, arr);
        }
    }
}
