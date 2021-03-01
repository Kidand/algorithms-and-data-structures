package com.kidand.algorithms.and.data.structures.algorithms.search.linearsearch.test;

import com.kidand.algorithms.and.data.structures.algorithms.search.linearsearch.LinearSearch;
import com.kidand.algorithms.and.data.structures.util.ArrayGenerator;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: TestLinearSearch
 * @author: Kidand
 * @date: 2020/7/16 15:07
 * Copyright © 2019-Kidand.
 */
public class TestLinearSearch {
    public static void main(String[] args) {
        int[] dataSize = {1000000, 10000000};
        for (int n : dataSize) {
            Integer[] data = ArrayGenerator.generateOrderedArray(n);

            Long startTime = System.nanoTime();

            for (int i = 0; i < 100; i++) {
                LinearSearch.search(data, n);
            }

            Long endTime = System.nanoTime();

            double time = (endTime - startTime) / Math.pow(10,9);

            System.out.println("n = " + n + ", 100 runs : " + time + " s");
        }
    }
}
