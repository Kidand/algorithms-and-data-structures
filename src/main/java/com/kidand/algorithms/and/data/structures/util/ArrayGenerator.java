package com.kidand.algorithms.and.data.structures.util;

import java.util.Random;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: ArrayGenerator 数组生成器
 * @author: Kidand
 * @date: 15:03
 * Copyright © 2019-Kidand.
 */
public class ArrayGenerator {
    private ArrayGenerator() {
    }

    /**
     * 生成顺序数组
     *
     * @param n 数组规模
     * @return
     */
    public static Integer[] generateOrderedArray(int n) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    /**
     * 生成随机数组
     *
     * @param n     数组规模
     * @param bound 随机数的界限 [0, bound)
     * @return
     */
    public static Integer[] generateRandomArray(int n, int bound) {
        Integer[] arr = new Integer[n];
        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = rnd.nextInt(bound);
        }

        return arr;
    }

    /**
     * 生成特殊数组
     *
     * @param n 数组大小
     * @return
     */
    public static Integer[] generateSpecialArray(int n) {
        //开空间
        Integer[] arr = new Integer[n];
        //生成 arr[0...n-1] 的测试用例，其中最小值是0
        generateSpecialArray(arr, 0, arr.length - 1, 0);
        return arr;
    }

    /**
     * 递归生成特殊数组
     *
     * @param arr   数组
     * @param l     数组左边界
     * @param r     数组右边界
     * @param value
     */
    private static void generateSpecialArray(Integer[] arr, int l, int r, int value) {
        if (l > r) {
            return;
        }

        int mid = (l + r) / 2;
        arr[mid] = value;
        swap(arr, l, mid);
        generateSpecialArray(arr, l + 1, r, value + 1);
        swap(arr, l, mid);
    }

    /**
     * 数组元素交换
     *
     * @param arr 数组
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
