package com.kidand.algorithms.and.data.structures.datastructures.binarysearchtree.test;

import com.kidand.algorithms.and.data.structures.datastructures.binarysearchtree.BinarySearchTree;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: TestBinarySearchTree
 * @author: Kidand
 * @date: 2020/1/14 15:11
 * Copyright © 2019-Kidand.
 */
public class TestBinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        int[] nums = {5, 3, 6, 8, 4, 2};
        for (int num : nums) {
            bst.add(num);
        }
        //前序
        bst.preOrder();
        System.out.println();
        //前序（非递归）
        bst.preOrderNonRecursive();
        System.out.println();
        //中序
        bst.inOrder();
        System.out.println();
        //后序
        bst.postOrder();
        System.out.println();
        //层序遍历
        bst.levelOrder();
        System.out.println();

        System.out.println(bst);

    }
}

