package com.kidand.algorithms.and.data.structures.algorithms.sort.countingsort;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: CountingSort 计数排序
 * @author: Kidand
 * @date: 2020/12/21 15:43
 * Copyright © 2019-Kidand.
 */
public class CountingSort {
    public static void sort(int[] nums, int R) {
        //处理元素取值范围是 [0, R) 的计数排序
        int[] cnt = new int[R];
        for (int num : nums) {
            cnt[num]++;
        }

        // [index[i], index[i + 1]) 的值为 i
        int[] index = new int[R + 1];
        for (int i = 0; i < R; i++) {
            index[i + 1] = index[i] + cnt[i];
        }
        for (int i = 0; i + 1 < index.length; i++) {
            // [index[i], index[i + 1]) 的值为 i
            for (int j = index[i]; j < index[i + 1]; j++) {
                nums[j] = i;
            }
        }
    }
}
