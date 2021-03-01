package com.kidand.algorithms.and.data.structures.datastructures.binarysearchtree.test;

import com.kidand.algorithms.and.data.structures.datastructures.binarysearchtree.BinarySearchTree;

import java.util.ArrayList;
import java.util.Random;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: TestRemoveNode
 * @author: Kidand
 * @date: 2020/1/14 16:29
 * Copyright © 2019-Kidand.
 */
public class TestRemoveNode {

    /**
     * test removeMin
     *
     * @param bst
     */
    public void removeMin(BinarySearchTree<Integer> bst) {

        ArrayList<Integer> nums = new ArrayList<>();
        while (!bst.isEmpty()) {
            nums.add(bst.removeMin());
        }
        System.out.println(nums);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i - 1) > nums.get(i)) {
                throw new IllegalArgumentException("Error");
            }
        }
        System.out.println("removeMin test completed");
    }

    /**
     * test removeMax
     *
     * @param bst
     */
    public void removeMax(BinarySearchTree<Integer> bst) {
        ArrayList<Integer> nums = new ArrayList<>();
        while (!bst.isEmpty()) {
            nums.add(bst.removeMax());
        }
        System.out.println(nums);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i - 1) < nums.get(i)) {
                throw new IllegalArgumentException("Error");
            }
        }
        System.out.println("removeMax test completed");
    }

    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        Random random = new Random();
        int n = 10;

        for (int i = 0; i < n; i++) {
            bst.add(random.nextInt(10000));
        }

        new TestRemoveNode().removeMax(bst);
        //new TestRemoveNode().removeMin(bst);
    }
}
