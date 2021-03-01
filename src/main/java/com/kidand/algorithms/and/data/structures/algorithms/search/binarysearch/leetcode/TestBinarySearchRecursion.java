package com.kidand.algorithms.and.data.structures.algorithms.search.binarysearch.leetcode;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: TestBinarySearchRecursion leetcode 704 二分查找（递归实现）
 * @author: Kidand
 * @date: 2020/8/31 16:00
 * Copyright © 2019-Kidand.
 */
public class TestBinarySearchRecursion {
    public int search(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }

    private int search(int[] data, int l, int r, int target) {
        if (l > r) {
            return -1;
        }

        // 避免整型溢出
        int mid = l + (r - l) / 2;

        if (data[mid] == target) {
            return mid;
        }

        if (data[mid] < target) {
            return search(data, mid + 1, r, target);
        }

        return search(data, l, mid - 1, target);
    }
}
