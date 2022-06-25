package p1304;

/**
 * 1304. Find N Unique Integers Sum up to Zero
 * https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
 */
class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int idx = 0;
        for (int x = 1; x <= n / 2; x++) {
            arr[idx++] = x;
            arr[idx++] = -x;
        }
        return arr;
    }
}
