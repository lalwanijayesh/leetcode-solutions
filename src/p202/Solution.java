package p202;

import java.util.HashSet;
import java.util.Set;

/**
 * 202. Happy Number
 * https://leetcode.com/problems/happy-number/
 */
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            n = sumSquaredDigits(n);
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
        }
        return true;
    }

    private int sumSquaredDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int d = num % 10;
            sum += d * d;
            num = num / 10;
        }
        return sum;
    }
}
