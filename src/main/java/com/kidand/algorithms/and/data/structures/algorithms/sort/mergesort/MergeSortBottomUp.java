package com.kidand.algorithms.and.data.structures.algorithms.sort.mergesort;

import com.kidand.algorithms.and.data.structures.algorithms.sort.insertionsort.InsertionSort;

import java.util.Arrays;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: MergeSortBottomUp 归并排序（自底向上）
 * @author: Kidand
 * @date: 2020/8/25 14:26
 * Copyright © 2019-Kidand.
 */
public class MergeSortBottomUp {
    /**
     * 私有构造方法
     */
    private MergeSortBottomUp(){

    }

    /**
     * 归并排序（自底向上）
     *
     * @param arr 待排序数组
     * @param <E>
     */
    public static <E extends Comparable<E>> void sortBottomUp(E[] arr) {
        E[] temp = Arrays.copyOf(arr, arr.length);
        int n = arr.length;
        // 使用插入排序优化
        // 遍历一遍，对所有 arr[i, i + 15] 的区间，使用插入排序法
        for (int i = 0; i < n; i += 16) {
            InsertionSort.sort(arr, i, Math.min(n - 1, i + 15));
        }
        //size为遍历合并的区间长度
        for (int size = 16; size < n; size += size) {
            //遍历合并的两个区间的起始位置i
            //合并 [i, i + size -1] 和 [i + size, Math.min(i + size + size - 1, n - 1)]
            for (int i = 0; i + size < n; i += size + size) {
                if (arr[i + size - 1].compareTo(arr[i + size]) > 0) {
                    merge(arr, i, i + size - 1, Math.min(i + size + size - 1, n - 1), temp);
                }
            }
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
