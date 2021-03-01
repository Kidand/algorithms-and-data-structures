package com.kidand.algorithms.and.data.structures.datastructures.queue.test;

import com.kidand.algorithms.and.data.structures.datastructures.queue.ArrayQueue;
import com.kidand.algorithms.and.data.structures.datastructures.queue.LinkedListQueue;
import com.kidand.algorithms.and.data.structures.datastructures.queue.LoopQueue;
import com.kidand.algorithms.and.data.structures.datastructures.queue.Queue;

import java.util.Random;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description:TestQueuePerformance
 * @author: Kidand
 * @date: 2019/11/17 9:24 下午
 * Copyright © 2019-Kidand.
 */
public class TestQueuePerformance {
    /**
     * 测试使用q运行opCount个enqueue和dequeue操作所需要的时间，单位：秒
     *
     * @param q       队列
     * @param opCount 出队入队次数
     * @return
     */
    private static double testQueue(Queue<Integer> q, int opCount) {
        long startTime = System.nanoTime();

        Random random = new Random();

        for (int i = 0; i < opCount; i++) {
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        }

        for (int i = 0; i < opCount; i++) {
            q.dequeue();
        }

        long endTime = System.nanoTime();

        //纳秒转换为秒
        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {
        int opCount = 100000;

        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        double time1 = testQueue(arrayQueue, opCount);
        System.out.println("ArrayQueue: " + time1 + " s");

        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        double time2 = testQueue(loopQueue, opCount);
        System.out.println("LoopQueue: " + time2 + " s");

        LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<>();
        double time3 = testQueue(linkedListQueue, opCount);
        System.out.println("LinkedListQueue: " + time3 + " s");

    }
}
