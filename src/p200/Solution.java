package p200;

/**
 * 200. Number of Islands
 * https://leetcode.com/problems/number-of-islands/
 */
class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    visitIsland(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private void visitIsland(char[][] grid, int x, int y) {
        grid[x][y] = '0';
        int[][] next = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        for (int[] pos : next) {
            int newX = x + pos[0];
            int newY = y + pos[1];
            if (newX >= 0 && newX < grid.length
                    && newY >= 0 && newY < grid[0].length
                    && grid[newX][newY] == '1') {
                visitIsland(grid, newX, newY);
            }
        }
    }
}
