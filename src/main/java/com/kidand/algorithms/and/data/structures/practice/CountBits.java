package com.kidand.algorithms.and.data.structures.practice;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: CountBits 338. 比特位计数
 * @author: Kidand
 * @date: 2021/3/3 9:18
 * Copyright © 2021 by Kidand
 */
public class CountBits {
    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        // 二进制表示中，奇数一定比前面那个偶数多一个 1
        // 例：0 = 0, 1 = 1, 2 = 10, 3 = 11
        // 二进制表示中，偶数中 1 的个数一定和除以 2 之后的那个数一样多
        // 例：2 = 10, 4 = 100, 8 = 1000
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1) {
                result[i] = result[i - 1] + 1;
            } else {
                result[i] = result[i / 2];
            }
        }
        return result;
    }
}
