package com.kidand.algorithms.and.data.structures.algorithms.search.linearsearch;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: LinearSearch 线性查找法
 * @author: Kidand
 * @date: 2020/7/14 9:10
 * Copyright © 2019-Kidand.
 */
public class LinearSearch {

    /**
     * 禁止创建对象
     */
    private LinearSearch() {
    }

    /**
     * 线性查找法
     *
     * @param data
     * @param target
     * @param <E>
     * @return
     */
    public static <E> int search(E[] data, E target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] data = {24, 28, 12, 9, 16, 66, 32, 4};
        int res = LinearSearch.search(data, 16);
        System.out.println(res);

        int res2 = LinearSearch.search(data, 666);
        System.out.println(res2);

        Student[] students = {new Student("Alice"),
                new Student("Kidand"),
                new Student("Charlse")};
        Student kidand = new Student("kidand");
        int res3 = LinearSearch.search(students, kidand);

        System.out.println(res3);

    }
}
