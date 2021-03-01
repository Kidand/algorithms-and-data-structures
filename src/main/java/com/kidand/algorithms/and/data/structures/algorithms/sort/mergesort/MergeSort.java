package com.kidand.algorithms.and.data.structures.algorithms.sort.mergesort;

import java.util.Arrays;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: MergeSort 归并排序
 * @author: Kidand
 * @date: 2020/8/17 14:25
 * Copyright © 2019-Kidand.
 */
public class MergeSort {
    /**
     * 私有构造方法
     */
    private MergeSort() {
    }

    /**
     * 归并排序（自顶向下递归）
     *
     * @param arr 待排序数组
     * @param <E>
     */
    public static <E extends Comparable<E>> void sort(E[] arr) {
        E[] temp = Arrays.copyOf(arr, arr.length);
        sort(arr, 0, arr.length - 1, temp);
    }

    /**
     * 私有递归方法(优化)
     *
     * @param arr  待排序数组
     * @param l    数组左边界
     * @param r    数组右边界
     * @param temp 临时数组
     * @param <E>
     */
    private static <E extends Comparable<E>> void sort(E[] arr, int l, int r, E[] temp) {
        //数据规模小时使用插入排序法（优化思路，在部分语言中不适用）
//        if (r - l <= 15) {
//            InsertionSort.sort(arr, l, r);
//            return;
//        }
        if (l >= r) {
            return;
        }

        //不写成 (l + r) / 2 是为了防止整型溢出
        int mid = l + (r - l) / 2;
        sort(arr, l, mid, temp);
        sort(arr, mid + 1, r, temp);
        //优化归并过程
        if (arr[mid].compareTo(arr[mid + 1]) > 0) {
            merge(arr, l, mid, r, temp);
        }
    }

    /**
     * 合并两个有序的区间 arr[l...mid] 和 arr[mid + 1, r]
     *
     * @param arr  传入数组
     * @param l    数组左边界
     * @param mid  数组分割点
     * @param r    数组右边界
     * @param temp 临时数组
     * @param <E>
     */
    private static <E extends Comparable<E>> void merge(E[] arr, int l, int mid, int r, E[] temp) {
        System.arraycopy(arr, l, temp, l, r - l + 1);

        int i = l;
        int j = mid + 1;

        // 每轮循环为 arr[k] 赋值
        for (int k = l; k <= r; k++) {
            if (i > mid) {
                arr[k] = temp[j];
                j++;
            } else if (j > r) {
                arr[k] = temp[i];
                i++;
            } else if (temp[i].compareTo(temp[j]) <= 0) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
        }
    }
}
