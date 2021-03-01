package com.kidand.algorithms.and.data.structures.algorithms.search.binarysearch.test;

import com.kidand.algorithms.and.data.structures.algorithms.search.binarysearch.BinarySearch;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: TestUpperFloor
 * @author: Kidand
 * @date: 2020/9/14 14:56
 * Copyright © 2019-Kidand.
 */
public class TestUpperFloor {
    public static void main(String[] args) {
        Integer[] arr = {1, 1, 3, 3, 5, 5};
        System.out.print("upper_floor : ");
        for (int i = 0; i <= 6; i++) {
            System.out.print(BinarySearch.upperFloor(arr, i) + " ");
        }
        System.out.println();
    }
}
