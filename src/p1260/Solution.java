package p1260;

import java.util.Arrays;
import java.util.List;

/**
 * 1260. Shift 2D Grid
 * https://leetcode.com/problems/shift-2d-grid/
 */
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] shifted = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int newC = (j + k) % cols;
                int newR = (i + (j + k) / cols) % rows;
                shifted[newR][newC] = grid[i][j];
            }
        }
        return (List) Arrays.asList(shifted);
    }
}
