package p1089;

/**
 * 1089. Duplicate Zeros
 * https://leetcode.com/problems/duplicate-zeros/
 */
class Solution {
    public void duplicateZeros(int[] arr) {
        int zeros = 0;
        for (int num : arr) {
            if (num == 0) {
                zeros++;
            }
        }
        int len = arr.length;
        for (int i = len - 1; i >= 0; i--) {
            if (i + zeros < len) {
                arr[i + zeros] = arr[i];
            }
            if (arr[i] == 0) {
                zeros--;
                if (i + zeros < len) {
                    arr[i + zeros] = arr[i];
                }
            }
        }
    }
}
