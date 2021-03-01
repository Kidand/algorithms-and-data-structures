package com.kidand.algorithms.and.data.structures.datastructures.segmenttree.leetcode;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: NumArray2 303 区域和检索——数组不可变 （方法2 不使用线段树）
 * @author: Kidand
 * @date: 2020/1/17 11:10
 * Copyright © 2019-Kidand.
 */
public class NumArray2 {
    /**
     * sum[i] 存储前i个元素和，sum[0] = 0
     * sum[i] 存储nums[0...i-1]的和
     */
    private int[] sum;

    public NumArray2(int[] nums) {

        sum = new int[nums.length + 1];
        sum[0] = 0;
        for (int i = 1; i < sum.length; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int i, int j) {
        return sum[j + 1] - sum[i];
    }
}
