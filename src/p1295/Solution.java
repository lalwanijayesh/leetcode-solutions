package p1295;

/**
 * 1295. Find Numbers with Even Number of Digits
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 */
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (hasEvenDigits(num)) {
                count++;
            }
        }
        return count;
    }

    private boolean hasEvenDigits(int num) {
        int digits = 0;
        while (num > 0) {
            digits++;
            num = num / 10;
        }
        if (digits % 2 == 0) {
            return true;
        }
        return false;
    }
}