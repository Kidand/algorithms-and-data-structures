package com.kidand.algorithms.and.data.structures.algorithms.sort.selectionsort;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: SelectionSort 选择排序
 * @author: Kidand
 * @date: 2020/7/17 14:20
 * Copyright © 2019-Kidand.
 */
public class SelectionSort {
    private SelectionSort() {
    }

    /**
     * 选择排序
     * @param arr 待排序数组
     * @param <E>
     */
    public static <E extends Comparable<E>> void sort(E[] arr) {
        //arr[0...i) 是有序的；arr[i...n)是无序的
        for (int i = 0; i < arr.length; i++) {
            // 选择 arr[i...n) 中的最小值索引
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            swap(arr, i, minIndex);
        }
    }

    private static <E> void swap(E[] arr, int i, int j) {
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 4, 2, 3, 6, 5};
        SelectionSort.sort(arr);
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();

        Student[] students = {new Student("Alice", 98),
                              new Student("Kidand", 100),
                              new Student("Charles", 66)};

        SelectionSort.sort(students);

        for (Student student : students) {
            System.out.print(student + " ");
        }
        System.out.println();
    }
}
