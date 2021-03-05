package com.kidand.algorithms.and.data.structures.practice;

import java.util.Stack;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: MyQueue 232. 用栈实现队列
 * @author: Kidand
 * @date: 2021/3/5 9:12
 * Copyright © 2021 by Kidand
 */
public class MyQueue {
    Stack<Integer> inStack;
    Stack<Integer> outStack;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        // A桶
        inStack = new Stack<>();
        // B桶
        outStack = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        // 插入前检查B桶是否有数据，如果有，先倒入A桶
        int m = outStack.size();
        for (int i = 0; i < m; i++) {
            inStack.push(outStack.pop());
        }
        // 插入新数据到A桶
        inStack.push(x);
        // 将A桶数据倒入B桶，除插入以外的操作在B桶进行
        int n = inStack.size();
        for (int i = 0; i < n; i++) {
            outStack.push(inStack.pop());
        }
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        return outStack.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        return outStack.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return outStack.size() == 0;
    }
}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */