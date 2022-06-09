package p414;

/**
 * 414. Third Maximum Number
 * https://leetcode.com/problems/third-maximum-number/
 */
class Solution {
    public int thirdMax(int[] nums) {
        Integer first = null;
        Integer second = null;
        Integer third = null;
        for (int num : nums) {
            if (first == null || num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num < first && (second == null || num > second)) {
                third = second;
                second = num;
            } else if (second != null && num < second
                    && (third == null || num > third)) {
                third = num;
            }
        }
        if (third == null) {
            return first;
        }
        return third;
    }
}
