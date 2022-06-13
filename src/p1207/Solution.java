package p1207;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 1207. Unique Number of Occurrences
 * https://leetcode.com/problems/unique-number-of-occurrences/
 */
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Set<Integer> set = new HashSet<Integer>();
        for (int val : map.values()) {
            if (set.contains(val)) {
                return false;
            } else {
                set.add(val);
            }
        }
        return true;
    }
}
