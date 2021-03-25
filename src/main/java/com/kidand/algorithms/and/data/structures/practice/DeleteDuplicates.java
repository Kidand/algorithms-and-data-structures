package com.kidand.algorithms.and.data.structures.practice;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: DeleteDuplicates 82. 删除排序链表中的重复元素 II
 * @author: Kidand
 * @date: 2021/3/25 8:53
 * Copyright © 2021 by Kidand
 */
public class DeleteDuplicates {
    /**
     * Definition for singly-linked list.
     */
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode dummy = new ListNode(0, head);

        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                int x = cur.next.val;
                while (cur.next != null && cur.next.val == x) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }
        }

        return dummy.next;
    }
}
