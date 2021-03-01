package com.kidand.algorithms.and.data.structures.datastructures.set.test;

import com.kidand.algorithms.and.data.structures.datastructures.set.AVLSet;
import com.kidand.algorithms.and.data.structures.datastructures.set.BSTSet;
import com.kidand.algorithms.and.data.structures.datastructures.set.LinkedListSet;
import com.kidand.algorithms.and.data.structures.datastructures.set.Set;
import com.kidand.algorithms.and.data.structures.util.FileOperation;

import java.util.ArrayList;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: CompareSetPerformance
 * @author: Kidand
 * @date: 2020/1/15 10:32
 * Copyright © 2019-Kidand.
 */
public class CompareSetPerformance {
    /**
     * 通过读取书籍，测试集合性能
     *
     * @param set      集合类型
     * @param filename 文件名
     * @return
     */
    private static double testSet(Set<String> set, String filename) {
        long startTime = System.nanoTime();

        System.out.println(filename);
        ArrayList<String> words = new ArrayList<>();
        if (FileOperation.readFile(filename, words)) {
            System.out.println("Total words: " + words.size());

            for (String word : words) {
                set.add(word);
            }
            System.out.println("Total different words: " + set.getSize());
        }

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {
        String filename = "pride-and-prejudice.txt";

        BSTSet<String> bstSet = new BSTSet<>();
        double time1 = testSet(bstSet, filename);
        System.out.println("BST Set: " + time1 + "s");
        System.out.println();
        LinkedListSet<String> linkedListSet = new LinkedListSet<>();
        double time2 = testSet(linkedListSet, filename);
        System.out.println("LinkedList Set: " + time2 + "s");
        System.out.println();
        AVLSet<String> avlSet = new AVLSet<>();
        double time3 = testSet(avlSet, filename);
        System.out.println("AVL Set: " + time3 + "s");
    }
}
