package com.kidand.algorithms.and.data.structures.algorithms.search.binarysearch;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: TestBinarySearchRecursion 二分查找法
 * @author: Kidand
 * @date: 2020/8/31 15:50
 * Copyright © 2019-Kidand.
 */
public class BinarySearch {
    /**
     * 私有构造方法
     */
    private BinarySearch() {
    }

    /**
     * 二分查找法（非递归）
     *
     * @param data   待查找元素所在数组
     * @param target 待查找元素
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> int search(E[] data, E target) {
        int l = 0, r = data.length - 1;

        // 在 data[l, r] 的范围中查找 target
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (data[mid].compareTo(target) == 0) {
                return mid;
            }

            if (data[mid].compareTo(target) < 0) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    /**
     * 二分查找法（递归）
     *
     * @param data   待查找元素所在数组
     * @param target 待查找元素
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> int searchR(E[] data, E target) {
        return searchR(data, 0, data.length - 1, target);
    }

    /**
     * 使用求解 >= target 的最小值索引的思路，实现 search
     * 在有序数组 data 中判断 target 是否存在，存在则返回相应索引，不存在则返回 -1
     *
     * @param data   待查找元素所在数组
     * @param target 待查找元素
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> int search2(E[] data, E target) {

        // 以下代码是求解 >= target 的最小值索引
        // ----------
        int l = 0, r = data.length;

        // 在 data[l, r] 中寻找解
        while (l < r) {

            int mid = l + (r - l) / 2;
            if (data[mid].compareTo(target) < 0) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        // ----------
        // 求解 >= target 的最小值索引算法结束
        // l 是 >= target 的最小值索引

        // 如果 data[l] == target，则返回 l；否则返回 -1
        // 注意，求解 >= target 的最小值索引，结果可能是 data.length，不是合法索引
        // 所以，我们要对 l 的合法性进行判断，即确定 l < data.length
        if (l < data.length && data[l].compareTo(target) == 0) {
            return l;
        }
        return -1;
    }

    /**
     * 找出大于 target 的最小值索引
     *
     * @param data   待查找元素所在数组
     * @param target 待查找元素
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> int upper(E[] data, E target) {
        int l = 0, r = data.length;

        // 在 data[l, r] 中寻找解
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (data[mid].compareTo(target) <= 0) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    /**
     * 找出小于 target 的最大值索引
     *
     * @param data
     * @param target
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> int lower(E[] data, E target) {
        int l = -1, r = data.length - 1;

        // 在 data[l, r] 中寻找解
        while (l < r) {
            // 相邻时有坑，需改成向上取整
            int mid = l + (r - l + 1) / 2;
            if (data[mid].compareTo(target) < 0) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    /**
     * data 中如果没有 target 返回大于 target 的最小值索引
     * data 中如果存在 target 返回所有 target 中的最大索引
     *
     * @param data   待查找元素所在数组
     * @param target 待查找元素
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> int upperCeil(E[] data, E target) {
        int u = upper(data, target);
        if (u - 1 >= 0 && data[u - 1].compareTo(target) == 0) {
            return u - 1;
        }
        return u;
    }

    /**
     * 找出大于等于 target 的最小值索引
     *
     * @param data   待查找元素所在数组
     * @param target 待查找元素
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> int lowerCeil(E[] data, E target) {

        int l = 0, r = data.length;

        // 在 data[l, r] 中寻找解
        while (l < r) {

            int mid = l + (r - l) / 2;

            // 在 upper 中，这里是 data[mid].compareTo(target) <= 0
            // 但是，对于 lower_ceil 来说，在 data[mid] == target 的时候，有可能是解
            // 所以在等于的情况下，不能排除掉 data[mid] 的值。在等于的情况下，应该归入下面的 else 中做处理
            // 也就是，data[mid] == target 的时候可能是解，也可能有更小的解在左边，应该去更新右边界
            if (data[mid].compareTo(target) < 0) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    /**
     * 找出小于等于 target 的最大索引
     *
     * @param data
     * @param target
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> int upperFloor(E[] data, E target) {

        int l = -1, r = data.length - 1;

        // 在 data[l, r] 中寻找解
        while (l < r) {

            int mid = l + (r - l + 1) / 2;
            // 请同学们根据下面的搜索范围的调整逻辑思考：
            // 为什么 upper_floor 同样需要使用上取整的方式来计算 mid?

            // 在 lower 中，这里是 data[mid].compareTo(target) < 0
            // 但是，对于 upper_floor 来说，在 data[mid] == target 的时候，有可能是解
            // 所以在等于的情况下，不能排除掉 data[mid] 的值，我们的搜索空间的变化，同样是 l = mid
            if (data[mid].compareTo(target) <= 0) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    /**
     * data 中如果没有 target 返回小于 target 的最大值索引
     * data 中如果存在 target 返回所有 target 中的最小索引
     *
     * @param data
     * @param target
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> int lowerFloor(E[] data, E target) {

        int l = lower(data, target);
        // 注意，因为我们要访问 data[l + 1]，所以，我们要先确保 l + 1 不越界，
        // 即 l + 1 < data.length
        if (l + 1 < data.length && data[l + 1].compareTo(target) == 0) {
            return l + 1;
        }
        return l;
    }

    /**
     * 二分查找法递归实现方法
     *
     * @param data   待查找元素所在数组
     * @param l      数组左边界
     * @param r      数组右边界
     * @param target 待查找元素
     * @param <E>
     * @return
     */
    private static <E extends Comparable<E>> int searchR(E[] data, int l, int r, E target) {
        if (l > r) {
            return -1;
        }

        // 避免整型溢出
        int mid = l + (r - l) / 2;

        if (data[mid].compareTo(target) == 0) {
            return mid;
        }

        if (data[mid].compareTo(target) < 0) {
            return searchR(data, mid + 1, r, target);
        }

        return searchR(data, l, mid - 1, target);
    }
}
