package com.kidand.algorithms.and.data.structures.practice;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: PlusOne 66. 加一
 * @author: Kidand
 * @date: 2021/2/24 15:53
 * Copyright © 2019-Kidand.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        // 判断参数
        if (digits.length == 0) {
            return null;
        }
        // 满10进1标记
        int tenCount = 0;
        // 从地位往高位遍历
        for (int i = digits.length - 1; i >= 0; i--) {
            // 判断地位是否满10进1
            if (tenCount == 1) {
                digits[i] += 1;
                // 重置标记
                tenCount = 0;
            }
            // 最低位+1
            if (i == digits.length - 1) {
                digits[i] += 1;
            }
            // 满10取地位，标记满10进1
            if (digits[i] == 10) {
                digits[i] = 0;
                tenCount = 1;
            }
        }
        // 最高位满10进一，需扩充数组
        if (tenCount == 1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for (int i = 1; i < result.length; i++) {
                result[i] = digits[i - 1];
            }
            return result;
        }
        return digits;
    }

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int[] test = {9};
        int[] ints = plusOne.plusOne(test);
        System.out.print("{");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.print("}");
        System.out.println();
    }
}
