package com.kidand.algorithms.and.data.structures.datastructures.linkedlist.recursivemethod;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: ArraySum 递归——数组求和
 * @author: Kidand
 * @date: 2019/11/18 10:40
 * Copyright © 2019-Kidand.
 */
public class ArraySum {
    /**
     * 数组求和，只让用户传入数组
     *
     * @param arr
     * @return
     */
    public static int sum(int[] arr) {
        return sum(arr, 0);
    }

    /**
     * 计算arr[l..n]这个区间内所有数字的和，不对用户暴露
     *
     * @param arr  数组
     * @param left 左边界
     * @return
     */
    private static int sum(int[] arr, int left) {
        if (left == arr.length) {
            return 0;
        }
        return arr[left] + sum(arr, left + 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(sum(nums));
    }
}
