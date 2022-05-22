package p941;

/**
 * 941. Valid Mountain Array
 * https://leetcode.com/problems/valid-mountain-array/
 */
class Solution {
    public boolean validMountainArray(int[] arr) {
        int i = 0;
        while (i < arr.length - 1 && arr[i] < arr[i + 1]) {
            i++;
        }
        if (i == 0 || i == arr.length - 1) {
            return false;
        }
        while (i < arr.length - 1 && arr[i] > arr[i + 1]) {
            i++;
        }
        if (i == arr.length - 1) {
            return true;
        }
        return false;
    }
}
