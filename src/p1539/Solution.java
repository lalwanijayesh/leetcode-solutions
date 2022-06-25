package p1539;

/**
 * 1539. Kth Missing Positive Number
 * https://leetcode.com/problems/kth-missing-positive-number/
 */
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i = 0;
        for (int num : arr) {
            i++;
            while (i != num) {
                if (k == 1) {
                    return i;
                }
                i++;
                k--;
            }
        }
        return i + k;
    }
}
