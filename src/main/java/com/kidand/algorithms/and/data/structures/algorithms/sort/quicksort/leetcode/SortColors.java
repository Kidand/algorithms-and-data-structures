package com.kidand.algorithms.and.data.structures.algorithms.sort.quicksort.leetcode;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: SortColors leetcode 75 颜色分类
 * @author: Kidand
 * @date: 2020/8/26 10:01
 * Copyright © 2019-Kidand.
 */
public class SortColors {
    /**
     * 颜色分类
     *
     * @param nums 颜色数组
     */
    public void sortColors(int[] nums) {
        // nums[0...zero] == 0, nums[zero + 1, i] == 1, nums[two, n - 1] == 2
        int zero = -1, i = 0, two = nums.length;
        while (i < two) {

            if (nums[i] == 0) {
                zero++;
                swap(nums, zero, i);
                i++;
            } else if (nums[i] == 2) {
                two--;
                swap(nums, i, two);
            } else {
                // nums[i] == 0
                i++;
            }
        }
    }

    /**
     * 私有交换方法
     *
     * @param nums 待交换元素所在数组
     * @param i    元素i
     * @param j    元素j
     */
    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
