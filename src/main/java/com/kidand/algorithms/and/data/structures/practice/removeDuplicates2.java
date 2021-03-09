package com.kidand.algorithms.and.data.structures.practice;

import java.util.Stack;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: removeDuplicates2 1047. 删除字符串中的所有相邻重复项
 * @author: Kidand
 * @date: 2021/3/9 9:10
 * Copyright © 2021 by Kidand
 */
public class removeDuplicates2 {
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (stack.isEmpty() || S.charAt(i) != stack.peek()) {
                stack.push(S.charAt(i));
            } else {
                stack.pop();
            }
        }

        StringBuilder str = new StringBuilder();
        for (Character c : stack) {
            str.append(c);
        }
        return str.toString();
    }
}
