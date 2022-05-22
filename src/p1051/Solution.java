package p1051;

/**
 * 1051. Height Checker
 * https://leetcode.com/problems/height-checker/
 */
class Solution {
    public int heightChecker(int[] heights) {
        int[] counts = new int[101];
        for (int i = 0; i < heights.length; i++) {
            counts[heights[i]]++;
        }

        int res = 0;
        int curr = 0;

        for (int i = 0; i < heights.length; i++) {
            while (counts[curr] == 0) {
                curr++;
            }
            if (curr != heights[i]) {
                res++;
            }
            counts[curr]--;
        }
        return res;
    }
}
