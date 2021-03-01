package com.kidand.algorithms.and.data.structures.practice;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description:IsMonotonic 896. 单调数列
 * @author: Kidand
 * @date: 2021/2/28 8:45 上午
 * Copyright © 2019-Kidand.
 */
public class IsMonotonic {
    public boolean isMonotonic(int[] A) {
        int up = 0;
        int down = 0;
        int equal = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i - 1]) {
                up++;
            } else if (A[i] < A[i - 1]) {
                down++;
            } else {
                equal++;
            }
        }
        if (up + equal == A.length - 1 || down + equal == A.length - 1) {
            return true;
        } else {
            return false;
        }
    }
}
