package p1854;

/**
 * 1854. Maximum Population Year
 * https://leetcode.com/problems/maximum-population-year/
 */
class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] counts = new int[101];
        for (int[] log : logs) {
            counts[log[0] - 1950]++;
            counts[log[1] - 1950]--;
        }
        int max = 0;
        for (int j = 1; j < counts.length; j++) {
            counts[j] += counts[j - 1];
            if (counts[j] > counts[max]) {
                max = j;
            }
        }
        return max + 1950;
    }
}