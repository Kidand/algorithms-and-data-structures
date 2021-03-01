package com.kidand.algorithms.and.data.structures.datastructures.set.test;

import com.kidand.algorithms.and.data.structures.datastructures.set.LinkedListSet;
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
 * @description: TestLinkedListSet
 * @author: Kidand
 * @date: 2020/1/15 10:17
 * Copyright © 2019-Kidand.
 */
public class TestLinkedListSet {
    public static void main(String[] args) {
        //傲慢与偏见
        System.out.println("Pride and Prejudice");
        ArrayList<String> words1 = new ArrayList<>();
        FileOperation.readFile("pride-and-prejudice.txt", words1);
        System.out.println("Total words: " + words1.size());

        LinkedListSet<String> set1 = new LinkedListSet<>();
        for (String word : words1) {
            set1.add(word);
        }
        System.out.println("Total different words: " + set1.getSize());

        System.out.println();

        //狄更斯双城记
        System.out.println("A Tale of Two Cities");
        ArrayList<String> words2 = new ArrayList<>();
        FileOperation.readFile("a-tale-of-two-cities.txt", words2);
        System.out.println("Total words: " + words2.size());

        LinkedListSet<String> set2 = new LinkedListSet<>();
        for (String word : words2) {
            set2.add(word);
        }
        System.out.println("Total different words: " + set2.getSize());
    }
}
