package p1710;

import java.util.Arrays;

/**
 * 1710. Maximum Units on a Truck
 * https://leetcode.com/problems/maximum-units-on-a-truck/
 */
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int i = 0;
        int max = 0;
        while (truckSize > 0 && i < boxTypes.length) {
            int count = Math.min(truckSize, boxTypes[i][0]);
            truckSize -= count;
            max += count * boxTypes[i][1];
            i++;
        }
        return max;
    }
}
