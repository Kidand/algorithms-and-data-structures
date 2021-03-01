package com.kidand.algorithms.and.data.structures.util;

import com.kidand.algorithms.and.data.structures.algorithms.sort.bubblesort.BubbleSort;
import com.kidand.algorithms.and.data.structures.algorithms.sort.insertionsort.InsertionSort;
import com.kidand.algorithms.and.data.structures.algorithms.sort.mergesort.MergeSort;
import com.kidand.algorithms.and.data.structures.algorithms.sort.mergesort.MergeSortBottomUp;
import com.kidand.algorithms.and.data.structures.algorithms.sort.mergesort.plus.MergeSortPlus;
import com.kidand.algorithms.and.data.structures.algorithms.sort.quicksort.QuickSort;
import com.kidand.algorithms.and.data.structures.algorithms.sort.quicksort.QuickSortThreeWays;
import com.kidand.algorithms.and.data.structures.algorithms.sort.quicksort.QuickSortTwoWays;
import com.kidand.algorithms.and.data.structures.algorithms.sort.selectionsort.SelectionSort;
import com.kidand.algorithms.and.data.structures.algorithms.sort.shellsort.ShellSort;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: SortingHelper
 * @author: Kidand
 * @date: 2020/8/5 14:58
 * Copyright © 2019-Kidand.
 */
public class SortingHelper {
    private SortingHelper() {
    }

    /**
     * 判断是否有序
     *
     * @param arr
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> boolean isSorted(E[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].compareTo(arr[i]) > 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 测试排序性能
     *
     * @param sortClass 排序类
     * @param type      方法类型
     * @param arr       待排序数组
     * @param <E>
     */
    public static <E extends Comparable<E>> void sortTest(Class sortClass, String type, E[] arr) {
        long startTime = System.nanoTime();

        if (sortClass.equals(SelectionSort.class)) {
            SelectionSort.sort(arr);
        } else if (sortClass.equals(InsertionSort.class)) {
            if ("1".equals(type)) {
                InsertionSort.sort(arr);
            } else if ("2".equals(type) || type == null) {
                InsertionSort.sort2(arr);
            }
        } else if (sortClass.equals(MergeSort.class)) {
            MergeSort.sort(arr);
        } else if (sortClass.equals(MergeSortBottomUp.class)) {
            MergeSortBottomUp.sortBottomUp(arr);
        } else if (sortClass.equals(MergeSortPlus.class)) {
            MergeSortPlus.sort(arr);
        } else if (sortClass.equals(QuickSort.class)) {
            QuickSort.sort(arr);
        } else if (sortClass.equals(QuickSortTwoWays.class)) {
            QuickSortTwoWays.sortTwoWays(arr);
        } else if (sortClass.equals(QuickSortThreeWays.class)) {
            QuickSortThreeWays.sortThreeWays(arr);
        } else if (sortClass.equals(BubbleSort.class)) {
            if ("1".equals(type)) {
                BubbleSort.sort(arr);
            } else if ("2".equals(type)) {
                BubbleSort.sort2(arr);
            } else if ("3".equals(type) || type == null) {
                BubbleSort.sort3(arr);
            }
        } else if (sortClass.equals(ShellSort.class)) {
            if ("1".equals(type)) {
                ShellSort.sort(arr);
            } else if ("2".equals(type) || type == null) {
                ShellSort.sort2(arr);
            }
        }
        long endTime = System.nanoTime();

        double time = (endTime - startTime) / Math.pow(10, 9);

        if (!SortingHelper.isSorted(arr)) {
            throw new RuntimeException(sortClass.getSimpleName() + "failed");
        }

        if (type != null) {
            System.out.println(String.format("%s, n = %d : %f s", sortClass.getSimpleName() + type, arr.length, time));

        } else {
            System.out.println(String.format("%s, n = %d : %f s", sortClass.getSimpleName(), arr.length, time));

        }
    }
}
