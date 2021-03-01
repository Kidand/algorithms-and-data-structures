package com.kidand.algorithms.and.data.structures.practice;
/**
*
*  ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
*  ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
*  █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
*  ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
*  ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
*  ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
*
* @description:LongestSubstring 395. 至少有K个重复字符的最长子串
* @author: Kidand
* @date: 2021/2/27 9:00 上午
* Copyright © 2019-Kidand.
*/
public class LongestSubstring {
    public int longestSubstring(String s, int k) {
        int n = s.length();
        int[] cnt = new int[26];
        // 统计所有的字母出现个数
        for(int c : s.toCharArray()) {
            cnt[c - 'a'] ++;
        }
        // 定义一个字符串，用于传入split函数分割当前字符串
        StringBuilder cut = new StringBuilder();
        cut.append("[");
        // 定义一个标志，用于标记是否所有字符都满足要求
        boolean flag = true;
        // 遍历所有字符
        for(int i = 0; i < 26; i++) {
            if(cnt[i] > 0 && cnt[i] < k) {
                // 这个字符不满足要求，并且加入分割串
                flag = false;
                cut.append("//");
                cut.append((char)(i + 'a'));
            }
        }
        // 所有字符都满足要求的话，就直接返回字符串长度
        if(flag) {
            return n;
        }

        cut.append("]");
        // 切割当前字符串，得到被切割的子串数组
        String[] cuted = s.split(cut.toString());

        int res = 0;
        for(String c : cuted) {
            // 递归处理子串
            res = Math.max(longestSubstring(c, k), res);
        }

        return res;
    }
}
