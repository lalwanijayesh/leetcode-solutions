package p56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 56. Merge Intervals
 * https://leetcode.com/problems/merge-intervals/
 */
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        int[] prev = null;
        for (int[] interval : intervals) {
            if (prev == null) {
                prev = interval;
            } else if (prev[1] < interval[0]) {
                result.add(prev);
                prev = interval;
            } else {
                prev[1] = Math.max(interval[1], prev[1]);
            }
        }
        if (prev != null) {
            result.add(prev);
        }
        return result.toArray(new int[result.size()][]);
    }
}
