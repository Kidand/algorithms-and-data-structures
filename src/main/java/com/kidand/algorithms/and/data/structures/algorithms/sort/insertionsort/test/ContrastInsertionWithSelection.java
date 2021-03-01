package com.kidand.algorithms.and.data.structures.algorithms.sort.insertionsort.test;

import com.kidand.algorithms.and.data.structures.algorithms.sort.insertionsort.InsertionSort;
import com.kidand.algorithms.and.data.structures.algorithms.sort.selectionsort.SelectionSort;
import com.kidand.algorithms.and.data.structures.util.ArrayGenerator;
import com.kidand.algorithms.and.data.structures.util.SortingHelper;

import java.util.Arrays;

/**
 * ContrastInsertionWithSelection 比较插入排序和选择排序的性能
 * @date: 2020/8/11 17:06
 * @author: YanJiangze
 * @version: V0.1
 * Copyright: 2020 www.richfit.com. All rights reserved.
 */
public class ContrastInsertionWithSelection {
    public static void main(String[] args) {
        int[] dataSize = {10000, 100000};
        for (int n : dataSize) {

            System.out.println("Random Array : ");

            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
            Integer[] arr2 = Arrays.copyOf(arr, arr.length);

            //测试选择排序
            SortingHelper.sortTest(SelectionSort.class,null, arr);
            //测试插入排序
            SortingHelper.sortTest(InsertionSort.class,"2", arr2);

            System.out.println();

            System.out.println("Ordered Array : ");

            arr = ArrayGenerator.generateOrderedArray(n);
            arr2 = Arrays.copyOf(arr, arr.length);

            //测试选择排序
            SortingHelper.sortTest(SelectionSort.class,null, arr);
            //测试插入排序
            SortingHelper.sortTest(InsertionSort.class,"2", arr2);

            System.out.println();

        }
    }
}
