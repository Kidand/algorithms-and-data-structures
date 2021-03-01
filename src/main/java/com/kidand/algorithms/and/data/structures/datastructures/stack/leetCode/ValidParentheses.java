package com.kidand.algorithms.and.data.structures.datastructures.stack.leetCode;

import com.kidand.algorithms.and.data.structures.datastructures.stack.ArrayStack;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: ValidParentheses 括号匹配问题 20号题
 * @author: Kidand
 * @date: 2019/11/15 9:51
 * Copyright © 2019-Kidand.
 */
public class ValidParentheses {
    /**
     * 括号匹配问题
     *
     * @param s 传入字符串
     * @return 是否匹配
     */
    public boolean isValid(String s) {
        ArrayStack<Character> stack = new ArrayStack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char topChar = stack.pop();
                if (c == ')' && topChar != '(') {
                    return false;
                }
                if (c == ']' && topChar != '[') {
                    return false;
                }
                if (c == '}' && topChar != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    /**
     * 测试括号匹配问题
     *
     * @param args
     */
    public static void main(String[] args) {
        String string = "{()}";
        System.out.println(new ValidParentheses().isValid(string));
    }
}
