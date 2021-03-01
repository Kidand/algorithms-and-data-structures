package com.kidand.algorithms.and.data.structures.datastructures.array.test;

import com.kidand.algorithms.and.data.structures.datastructures.array.Array;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: Main
 * @author: Kidand
 * @date: 2019/11/14 11:20
 * Copyright © 2019-Kidand.
 */
public class TestArrray {
    public static void main(String[] args) {
        Array<Integer> arr = new Array<>();
        for (int i = 0; i < 10; i++) {
            arr.addLast(i);
        }
        System.out.println(arr);

        arr.add(1, 100);
        System.out.println(arr);

        arr.addFirst(-1);
        System.out.println(arr);

        arr.set(9, 8777);
        System.out.println(arr);

        arr.remove(2);
        System.out.println(arr);

        arr.remove(2);
        System.out.println(arr);

        arr.remove(2);
        System.out.println(arr);
    }
}
