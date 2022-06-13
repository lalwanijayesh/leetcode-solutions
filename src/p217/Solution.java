package p217;

import java.util.HashSet;
import java.util.Set;

/**
 * 217. Contains Duplicate
 * https://leetcode.com/problems/contains-duplicate/
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
