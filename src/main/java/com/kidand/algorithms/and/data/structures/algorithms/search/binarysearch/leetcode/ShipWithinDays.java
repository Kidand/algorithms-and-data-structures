package com.kidand.algorithms.and.data.structures.algorithms.search.binarysearch.leetcode;

import java.util.Arrays;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: ShipWithinDays leetcode 1011 在 D 天内送达包裹的能力
 * @author: Kidand
 * @date: 2020/9/22 16:57
 * Copyright © 2019-Kidand.
 */
public class ShipWithinDays {
    public int shipWithinDays(int[] weights, int D) {

        int l = Arrays.stream(weights).max().getAsInt();
        int r = Arrays.stream(weights).sum();

        while (l < r) {

            int mid = l + (r - l) / 2;
            if (days(weights, mid) <= D) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    private int days(int[] weights, int k) {

        int cur = 0, res = 0;
        for (int weight : weights) {
            if (cur + weight <= k) {
                cur += weight;
            } else {
                res++;
                cur = weight;
            }
        }
        res++;
        return res;
    }
}
