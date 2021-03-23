package com.kidand.algorithms.and.data.structures.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: NestedIterator 341. 扁平化嵌套列表迭代器
 * @author: Kidand
 * @date: 2021/3/23 8:57
 * Copyright © 2021 by Kidand
 */
public class NestedIterator implements Iterator<Integer> {
    /**
     * This is the interface that allows for creating nested lists.
     * You should not implement it, or speculate about its implementation
     */
    public interface NestedInteger {
        /**
         * @return true if this NestedInteger holds a single integer, rather than a nested list.
         */
        public boolean isInteger();

        /**
         * @return the single integer that this NestedInteger holds, if it holds a single integer
         * Return null if this NestedInteger holds a nested list
         */
        public Integer getInteger();

        /**
         * @return the nested list that this NestedInteger holds, if it holds a nested list
         * Return null if this NestedInteger holds a single integer
         */
        public List<NestedInteger> getList();
    }

    private List<Integer> vals;
    private Iterator<Integer> cur;

    public NestedIterator(List<NestedInteger> nestedList) {
        vals = new ArrayList<Integer>();
        dfs(nestedList);
        cur = vals.iterator();
    }

    @Override
    public Integer next() {
        return cur.next();
    }

    @Override
    public boolean hasNext() {
        return cur.hasNext();
    }

    private void dfs(List<NestedInteger> nestedList) {
        for (NestedInteger nest : nestedList) {
            if (nest.isInteger()) {
                vals.add(nest.getInteger());
            } else {
                dfs(nest.getList());
            }
        }
    }
}
/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
