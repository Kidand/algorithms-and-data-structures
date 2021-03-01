package com.kidand.algorithms.and.data.structures.algorithms.sort.mergesort.leetcode;

import java.util.Arrays;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: ReversePairs leetcode 剑指 Offer 51 数组中的逆序对
 * @author: Kidand
 * @date: 2020/8/20 15:48
 * Copyright © 2019-Kidand.
 */
public class ReversePairs {
    /**
     * 统计数组中的逆序对
     *
     * @param nums 数组
     * @return 结果
     */
    public int reversePairs(int[] nums) {
        int[] temp = Arrays.copyOf(nums, nums.length);
        return sort(nums, 0, nums.length - 1, temp);
    }

    /**
     * 私有递归方法(优化)
     *
     * @param arr  待排序数组
     * @param l    数组左边界
     * @param r    数组右边界
     * @param temp 临时数组
     */
    private int sort(int[] arr, int l, int r, int[] temp) {
        if (l >= r) {
            return 0;
        }

        int res = 0;

        //不写成 (l + r) / 2 是为了防止整型溢出
        int mid = l + (r - l) / 2;
        res += sort(arr, l, mid, temp);
        res += sort(arr, mid + 1, r, temp);
        //优化归并过程
        if (arr[mid] > arr[mid + 1]) {
            res += merge(arr, l, mid, r, temp);
        }
        return res;
    }

    /**
     * 合并两个有序的区间 arr[l...mid] 和 arr[mid + 1, r]
     *
     * @param arr  传入数组
     * @param l    数组左边界
     * @param mid  数组分割点
     * @param r    数组右边界
     * @param temp 临时数组
     */
    private int merge(int[] arr, int l, int mid, int r, int[] temp) {
        System.arraycopy(arr, l, temp, l, r - l + 1);

        int i = l;
        int j = mid + 1;
        int res = 0;

        // 每轮循环为 arr[k] 赋值
        for (int k = l; k <= r; k++) {
            if (i > mid) {
                arr[k] = temp[j];
                j++;
            } else if (j > r) {
                arr[k] = temp[i];
                i++;
            } else if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                res += mid - i + 1;
                arr[k] = temp[j];
                j++;
            }
        }
        return res;
    }
}
