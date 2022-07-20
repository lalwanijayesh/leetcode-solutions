package p1086;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1086. High Five
 * https://leetcode.com/problems/high-five/
 */
class Solution {
    public int[][] highFive(int[][] items) {
        Arrays.sort(items, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            } else {
                return a[0] - b[0];
            }
        });
        List<int[]> list = new ArrayList<>();
        int i = 0;
        while (i < items.length) {
            int id = items[i][0];
            int sum = 0;
            int count = 0;
            while (i < items.length && id == items[i][0]) {
                if (count++ < 5) {
                    sum += items[i][1];
                }
                i++;
            }
            list.add(new int[]{id, sum / 5});
        }
        return list.toArray(new int[list.size()][]);
    }
}
