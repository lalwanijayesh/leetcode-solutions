package p1346;

import java.util.HashSet;
import java.util.Set;

/**
 * 1346. Check If N and Its Double Exist
 * https://leetcode.com/problems/check-if-n-and-its-double-exist/
 */
class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(2 * num)) {
                return true;
            } else if (num % 2 == 0 && set.contains(num / 2)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }
}
