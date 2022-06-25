package p867;

/**
 * 867. Transpose Matrix
 * https://leetcode.com/problems/transpose-matrix/
 */
class Solution {
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] t = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                t[i][j] = matrix[j][i];
            }
        }
        return t;
    }
}
