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
 * @description: TestLowerCeil
 * @author: Kidand
 * @date: 2020/9/14 10:11
 * Copyright © 2019-Kidand.
 */
public class TestLowerCeil {
    public static void main(String[] args) {
        Integer[] arr = {1, 1, 3, 3, 5, 5};
        for(int i = 0; i <= 6; i ++) {
            System.out.print(BinarySearch.lowerCeil(arr, i) + " ");
        }
        System.out.println();
    }
}
