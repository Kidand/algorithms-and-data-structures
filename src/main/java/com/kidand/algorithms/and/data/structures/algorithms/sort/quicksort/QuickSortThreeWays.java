package com.kidand.algorithms.and.data.structures.algorithms.sort.quicksort;

import java.util.Random;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: QuickSortThreeWays 三路快速排序
 * @author: Kidand
 * @date: 2020/8/25 16:13
 * Copyright © 2019-Kidand.
 */
public class QuickSortThreeWays {
    /**
     * 私有构造方法
     */
    private QuickSortThreeWays() {

    }

    /**
     * 双路快速排序法
     *
     * @param arr 待排序数组
     * @param <E>
     */
    public static <E extends Comparable<E>> void sortThreeWays(E[] arr) {
        Random random = new Random();
        sortThreeWays(arr, 0, arr.length - 1, random);
    }

    /**
     * 私有排序方法
     *
     * @param arr 待排序数组
     * @param l   数组左边界
     * @param r   数组右边界
     * @param <E>
     */
    private static <E extends Comparable<E>> void sortThreeWays(E[] arr, int l, int r, Random random) {
        if (l >= r) {
            return;
        }

        // 生成 [l, r] 之间的随机索引
        int p = l + random.nextInt(r - l + 1);
        swap(arr, l, p);

        // arr[l + 1, lt] < v, arr[lt + 1, i - 1] == v, arr[gt, r] > v
        int lt = l;
        int i = l + 1;
        int gt = r + 1;
        while (i < gt) {
            if (arr[i].compareTo(arr[l]) < 0) {
                lt++;
                swap(arr, i, lt);
                i++;
            } else if (arr[i].compareTo(arr[l]) > 0) {
                gt--;
                swap(arr, i, gt);
            } else {
                // arr[i] == arr[l]
                i++;
            }
        }
        swap(arr, l, lt);
        // 此时 arr[l, lt] < v, arr[lt, gt - 1] == v, arr[gt, r] > v

        sortThreeWays(arr, l, lt - 1, random);
        sortThreeWays(arr, gt, r, random);
    }

    /**
     * 私有交换方法
     *
     * @param arr 待交换元素所在数组
     * @param i   元素i
     * @param j   元素j
     * @param <E>
     */
    private static <E> void swap(E[] arr, int i, int j) {
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
