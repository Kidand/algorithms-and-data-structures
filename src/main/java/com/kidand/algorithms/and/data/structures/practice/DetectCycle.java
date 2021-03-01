package com.kidand.algorithms.and.data.structures.practice;

import java.util.HashSet;
import java.util.Set;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: DetectCycle 142. 环形链表 II
 * @author: Kidand
 * @date: 2021/2/24 9:28
 * Copyright © 2019-Kidand.
 */
public class DetectCycle {
    /**
     * Definition for singly-linked list.
     */
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> listSet = new HashSet<>();
        while (head != null) {
            if (!listSet.add(head)) {
                return head;
            }
            head = head.next;
        }
        return null;
    }
}
