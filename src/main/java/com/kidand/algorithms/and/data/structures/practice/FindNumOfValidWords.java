package com.kidand.algorithms.and.data.structures.practice;


import java.util.*;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: FindNumOfValidWords 1178. 猜字谜
 * @author: Kidand
 * @date: 2021/2/26 9:35
 * Copyright © 2019-Kidand.
 */
public class FindNumOfValidWords {
    /**
     * 超时，有进一步优化空间
     *
     * @param words
     * @param puzzles
     * @return
     */
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        List<Integer> result = new ArrayList<>();

        for (String puzzle : puzzles) {
            String[] p = puzzle.split("");
            Set<String> puzzleSet = new HashSet<>(Arrays.asList(p));
            String first = p[0];

            int count = 0;
            for (String word : words) {
                String[] w = word.split("");
                Set<String> wordSet = new HashSet<>(Arrays.asList(w));

                Set<String> intersection = new HashSet<>(puzzleSet);
                boolean b = intersection.retainAll(wordSet);

                if (b && intersection.size() == wordSet.size() && intersection.contains(first)) {
                    count++;
                }
            }
            result.add(count);
        }

        return result;
    }

    public static void main(String[] args) {
        FindNumOfValidWords findNumOfValidWords = new FindNumOfValidWords();
        String[] words = {"aaaa", "asas", "able", "ability", "actt", "actor", "access"};
        String[] puzzles = {"aboveyz", "abrodyz", "abslute", "absoryz", "actresz", "gaswxyz"};
        List<Integer> numOfValidWords = findNumOfValidWords.findNumOfValidWords(words, puzzles);
        for (Integer numOfValidWord : numOfValidWords) {
            System.out.print(numOfValidWord + " ");
        }
        System.out.println();
    }
}
