package p1299;

/**
 * 1299. Replace Elements with Greatest Element on Right Side
 * https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
 */
class Solution {
    public int[] replaceElements(int[] arr) {
        int rightMax = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = rightMax;
            rightMax = Math.max(temp, rightMax);
        }
        return arr;
    }
}
