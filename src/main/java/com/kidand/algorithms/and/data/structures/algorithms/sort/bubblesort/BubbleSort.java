package com.kidand.algorithms.and.data.structures.algorithms.sort.bubblesort;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: BubbleSort 冒泡排序
 * @author: Kidand
 * @date: 2020/11/23 14:40
 * Copyright © 2019-Kidand.
 */
public class BubbleSort {
    /**
     * 私有构造方法
     */
    private BubbleSort() {
    }

    /**
     * 冒泡排序法
     *
     * @param data 待排序数组
     * @param <E>
     */
    public static <E extends Comparable<E>> void sort(E[] data) {
        for (int i = 0; i + 1 < data.length; i++) {
            // arr[n - i, n] 已排好序
            // 通过冒泡在 arr[n - i - 1] 位置放上合适的元素
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j].compareTo(data[j + 1]) > 0) {
                    swap(data, j, j + 1);
                }
            }
        }
    }

    /**
     * 冒泡排序法优化1
     *
     * @param data 待排序数组
     * @param <E>
     */
    public static <E extends Comparable<E>> void sort2(E[] data) {
        for (int i = 0; i + 1 < data.length; i++) {
            boolean isSwapped = false;
            // arr[n - i, n] 已排好序
            // 通过冒泡在 arr[n - i - 1] 位置放上合适的元素
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j].compareTo(data[j + 1]) > 0) {
                    swap(data, j, j + 1);
                    isSwapped = true;
                }
            }

            if (!isSwapped) {
                break;
            }
        }
    }

    /**
     * 冒泡排序法优化2
     *
     * @param data
     * @param <E>
     */
    public static <E extends Comparable<E>> void sort3(E[] data) {
        for (int i = 0; i + 1 < data.length; ) {
            int lastSwappedIndex = 0;
            // arr[n - i, n] 已排好序
            // 通过冒泡在 arr[n - i - 1] 位置放上合适的元素
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j].compareTo(data[j + 1]) > 0) {
                    swap(data, j, j + 1);
                    lastSwappedIndex = j + 1;
                }
            }

//            if (lastSwappedIndex == 0) {
//                break;
//            }

            i = data.length - lastSwappedIndex;
        }
    }

    /**
     * 倒着冒泡排序
     *
     * @param data
     * @param <E>
     */
    public static <E extends Comparable<E>> void sort4(E[] data) {
        for (int i = 0; i + 1 < data.length; ) {
            // arr[0, i) 已排好序
            // 通过冒泡在 arr[i] 位置放上合适的元素
            int lastSwappedIndex = data.length - 1;
            for (int j = data.length - 1; j > i; j--) {
                if (data[j - 1].compareTo(data[j]) > 0) {
                    swap(data, j - 1, j);
                    lastSwappedIndex = j - 1;
                }
            }
            i = lastSwappedIndex + 1;
        }
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
