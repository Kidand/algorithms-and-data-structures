package com.kidand.algorithms.and.data.structures.practice;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: MaxSatisfied 1052. 爱生气的书店老板
 * @author: Kidand
 * @date: 2021/2/23 11:19
 * Copyright © 2019-Kidand.
 */
public class MaxSatisfied {
    /**
     * 复杂度略高，待完善
     *
     * @param customers
     * @param grumpy
     * @param X
     * @return
     */
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int result = 0;
        int n = customers.length;
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                result += customers[i];
                //点睛
                customers[i] = 0;
            }
        }

        int max = 0;
        for (int i = 0; i < n - X + 1; i++) {
            int cur = 0;
            for (int j = i; j < i + X; j++) {
                if (grumpy[j] == 1) {
                    cur += customers[j];
                }
            }
            max = Math.max(max, cur);
        }
        return result + max;
    }

    public static void main(String[] args) {
        MaxSatisfied maxSatisfied = new MaxSatisfied();
        int[] customers = {1, 0, 1, 2, 1, 1, 7, 5};
        int[] grumpy = {0, 1, 0, 1, 0, 1, 0, 1};
        int result = maxSatisfied.maxSatisfied(customers, grumpy, 3);
        System.out.println(result);
    }
}
