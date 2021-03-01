package com.kidand.algorithms.and.data.structures.algorithms.sort.mergesort.plus;

import com.kidand.algorithms.and.data.structures.util.SortingHelper;

import java.util.Arrays;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: MergeSortPlus 归并排序并打印递归过程
 * @author: Kidand
 * @date: 2020/8/20 9:38
 * Copyright © 2019-Kidand.
 */
public class MergeSortPlus {
    /**
     * 私有构造方法
     */
    private MergeSortPlus() {
    }

    /**
     * 归并排序
     *
     * @param arr 待排序数组
     * @param <E>
     */
    public static <E extends Comparable<E>> void sort(E[] arr) {

        sort(arr, 0, arr.length - 1, 0);
    }

    /**
     * 归并排序递归实现并打印递归过程
     *
     * @param arr   待排序数组
     * @param l     数组左边界
     * @param r     数组右边界
     * @param depth 递归深度
     * @param <E>
     */
    private static <E extends Comparable<E>> void sort(E[] arr, int l, int r, int depth) {

        // 生成深度字符串
        String depthString = generateDepthString(depth);

        // 打印当前 sort 处理的数组区间信息
        System.out.print(depthString);
        System.out.println(String.format("mergesort arr[%d, %d]", l, r));

        if (l >= r) {
            return;
        }

        int mid = l + (r - l) / 2;
        sort(arr, l, mid, depth + 1);
        sort(arr, mid + 1, r, depth + 1);

        // 打印这次 merge 要处理的区间范围
        System.out.print(depthString);
        System.out.println(String.format("merge arr[%d, %d] and arr[%d, %d]", l, mid, mid + 1, r));

        merge(arr, l, mid, r);

        // 打印 merge 后的数组
        System.out.print(depthString);
        System.out.print(String.format("after mergesort arr[%d, %d] :", l, r));
        for (E e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    /**
     * 生成递归字符串
     *
     * @param depth
     * @return
     */
    private static String generateDepthString(int depth) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            res.append("--");
        }
        return res.toString();
    }


    /**
     * 合并两个有序的区间 arr[l...mid] 和 arr[mid + 1, r]
     *
     * @param arr 传入数组
     * @param l   数组左边界
     * @param mid 数组分割点
     * @param r   数组右边界
     * @param <E>
     */
    private static <E extends Comparable<E>> void merge(E[] arr, int l, int mid, int r) {

        E[] temp = Arrays.copyOfRange(arr, l, r + 1);

        int i = l, j = mid + 1;

        // 每轮循环为 arr[k] 赋值
        for (int k = l; k <= r; k++) {

            if (i > mid) {
                arr[k] = temp[j - l];
                j++;
            } else if (j > r) {
                arr[k] = temp[i - l];
                i++;
            } else if (temp[i - l].compareTo(temp[j - l]) <= 0) {
                arr[k] = temp[i - l];
                i++;
            } else {
                arr[k] = temp[j - l];
                j++;
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {7, 1, 4, 2, 8, 3, 6, 5};
        SortingHelper.sortTest(MergeSortPlus.class, null, arr);
    }
}
