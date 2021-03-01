package com.kidand.algorithms.and.data.structures.algorithms.sort.shellsort;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: ShellSort 希尔排序
 * @author: Kidand
 * @date: 2020/12/3 10:57
 * Copyright © 2019-Kidand.
 */
public class ShellSort {
    /**
     * 私有构造方法
     */
    private ShellSort() {
    }

    /**
     * 希尔排序
     *
     * @param data
     * @param <E>
     */
    public static <E extends Comparable<E>> void sort(E[] data) {
        int h = data.length / 2;
        while (h >= 1) {
            // 对 data[h, n)，进行插入排序
            for (int i = h; i < data.length; i++) {
                E t = data[i];
                int j;
                for (j = i; j - h >= 0 && t.compareTo(data[j - h]) < 0; j -= h) {
                    data[j] = data[j - h];
                }
                data[j] = t;
            }
            h /= 2;
        }
    }

    /**
     * 希尔排序优化
     *
     * @param data
     * @param <E>
     */
    public static <E extends Comparable<E>> void sort2(E[] data) {
        int h = 1;
        while (h < data.length) {
            h = h * 3 + 1;
        }

        while (h >= 1) {
            // 对 data[h, n)，进行插入排序
            for (int i = h; i < data.length; i++) {
                E t = data[i];
                int j;
                for (j = i; j - h >= 0 && t.compareTo(data[j - h]) < 0; j -= h) {
                    data[j] = data[j - h];
                }
                data[j] = t;
            }
            h /= 3;
        }
    }
}
