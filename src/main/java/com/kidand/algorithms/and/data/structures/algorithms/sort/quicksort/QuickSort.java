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
 * @description: QuickSort 快速排序
 * @author: Kidand
 * @date: 2020/8/21 14:04
 * Copyright © 2019-Kidand.
 */
public class QuickSort {
    /**
     * 私有构造方法
     */
    private QuickSort() {
    }

    /**
     * 快速排序法
     *
     * @param arr 待排序数组
     * @param <E>
     */
    public static <E extends Comparable<E>> void sort(E[] arr) {
        Random random = new Random();
        sort(arr, 0, arr.length - 1, random);
    }

    /**
     * 私有排序方法
     *
     * @param arr 待排序数组
     * @param l   数组左边界
     * @param r   数组右边界
     * @param <E>
     */
    private static <E extends Comparable<E>> void sort(E[] arr, int l, int r, Random random) {
        if (l >= r) {
            return;
        }

        int p = partition(arr, l, r, random);
        sort(arr, l, p - 1, random);
        sort(arr, p + 1, r, random);
    }

    /**
     * 私有数组分隔方法
     *
     * @param arr 数组
     * @param l   数组左边界
     * @param r   数组右边界
     * @param <E>
     * @return 标定点对应的索引
     */
    private static <E extends Comparable<E>> int partition(E[] arr, int l, int r, Random random) {
        // 生成 [l, r] 之间的随机索引
        int p = l + random.nextInt(r - l + 1);
        swap(arr, l, p);

        // arr[l+1...j] < v ; arr[j+1...i] >= v
        int j = l;
        for (int i = l; i <= r; i++) {
            if (arr[i].compareTo(arr[l]) < 0) {
                j++;
                swap(arr, i, j);
            }
        }
        swap(arr, l, j);
        return j;
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
