package com.kidand.algorithms.and.data.structures.datastructures.hashtable.test;

import java.util.HashMap;
import java.util.HashSet;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: TestHashCode
 * @author: Kidand
 * @date: 2020/3/31 14:23
 * Copyright © 2019-Kidand.
 */
public class TestHashCode {
    public static void main(String[] args) {
        int a = 42;
        System.out.println(((Integer) a).hashCode());

        int b = -42;
        System.out.println(((Integer) b).hashCode());

        double c = 3.1415926;
        System.out.println(((Double) c).hashCode());

        String d = "Kidand";
        System.out.println(d.toLowerCase().hashCode());

        //Java 默认的 TestHashCode 是根据对象的地址映射出的整形
        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println();

        Student student = new Student(3, 2, "Shilin", "Yan");
        System.out.println(student.hashCode());

        HashSet<Student> set = new HashSet<>();
        set.add(student);

        HashMap<Student, Integer> scores = new HashMap<>();
        scores.put(student, 100);

        Student student2 = new Student(3, 2, "Shilin", "Yan");
        System.out.println(student2.hashCode());
    }
}
