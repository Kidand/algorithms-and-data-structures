package com.kidand.algorithms.and.data.structures.datastructures.queue.test;

import com.kidand.algorithms.and.data.structures.util.FileOperation;

import java.util.*;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: TestPriorityQueue
 * @author: Kidand
 * @date: 2020/1/16 15:12
 * Copyright © 2019-Kidand.
 */
public class TestPriorityQueue {

    /**
     * 对文本中的词汇进行统计
     *
     * @param map
     * @param filename 文件相对路径
     * @param num      前 num 个高频词
     * @return
     */
    private static double testPriorityQueue(TreeMap<String, Integer> map, String filename, int num) {
        long startTime = System.nanoTime();

        System.out.println(filename);

        ArrayList<String> words = new ArrayList<>();
        if (FileOperation.readFile(filename, words)) {
            System.out.println("Total words: " + words.size());

            for (String word : words) {
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }

            PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
                @Override
                public int compare(String a, String b) {
                    return map.get(a) - map.get(b);
                }
            });
            for (String key : map.keySet()) {
                if (pq.size() < num) {
                    pq.add(key);
                } else if (map.get(key) > map.get(pq.peek())) {
                    pq.remove();
                    pq.add(key);
                }
            }
            LinkedList<String> res = new LinkedList<>();
            while (!pq.isEmpty()) {
                String temp = pq.remove();
                res.add(temp + " appears " + map.get(temp) + " times\n");
            }
            System.out.println("Total different words: " + map.size());

            System.out.println("Vocabulary frequency: " + res);
        }

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {
        String filename = "pride-and-prejudice.txt";

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        double time = testPriorityQueue(treeMap, filename, 100);
        System.out.println("BST Map: " + time + " s");
    }
}
