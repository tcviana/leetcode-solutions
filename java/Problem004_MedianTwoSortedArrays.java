// https://leetcode.com/problems/median-of-two-sorted-arrays/

class Solution {
    private int index1, index2, m, n = 0;
    private final int DEFAULT = Integer.MIN_VALUE;

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        m = nums1.length-1;
        n = nums2.length-1;
        int size = nums1.length+nums2.length;
        boolean even = size%2 == 0;
        int until = size/2;
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i=0; i<=until; i++) {
            int mValue = getValue(nums1, m);
            int nValue = getValue(nums2, n);

            if (mValue > nValue) {
                stack.push(mValue);
                m--;
            } else {
                stack.push(nValue);
                n--;
            }
        }

        int median = stack.pop();
        if (even) {
            int next = stack.pop();
            return (median + next) / 2.0;
        } else {
            return median;
        }
    }

    private int getValue(int[] n, int index) {
        if (index>=0) {
            return n[index];
        } else {
            return DEFAULT;
        }
    }
}
