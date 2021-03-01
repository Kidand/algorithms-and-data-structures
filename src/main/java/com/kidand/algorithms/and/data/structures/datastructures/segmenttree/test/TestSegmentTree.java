package com.kidand.algorithms.and.data.structures.datastructures.segmenttree.test;

import com.kidand.algorithms.and.data.structures.datastructures.segmenttree.SegmentTree;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: TestSegmentTree
 * @author: Kidand
 * @date: 2020/1/17 10:31
 * Copyright © 2019-Kidand.
 */
public class TestSegmentTree {
    public static void main(String[] args) {
        Integer[] nums = {-2, 0, 3, -5, 2, -1};
        //Lamda
        SegmentTree<Integer> segTree = new SegmentTree<>(nums, (a, b) -> a + b);
        System.out.println(segTree);

        System.out.println(segTree.query(2, 5));
    }
}
