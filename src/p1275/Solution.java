package p1275;

/**
 * 1275. Find Winner on a Tic Tac Toe Game
 * https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/
 */
class Solution {
    public String tictactoe(int[][] moves) {
        int[] rows = new int[3];
        int[] cols = new int[3];
        int diag1 = 0;
        int diag2 = 0;
        int player = 1;
        for (int[] move : moves) {
            int r = move[0];
            int c = move[1];
            rows[r] += player;
            cols[c] += player;
            if (r == c) {
                diag1 += player;
            }
            if (r + c == 2) {
                diag2 += player;
            }
            if (contains(rows, 3 * player) || contains(cols, 3 * player)
                    || diag1 == 3 * player || diag2 == 3 * player) {
                return player == 1 ? "A" : "B";
            }
            player *= -1;
        }
        return (moves.length == 9 ? "Draw" : "Pending");
    }

    private boolean contains(int[] arr, int x) {
        for (int num : arr) {
            if (num == x) {
                return true;
            }
        }
        return false;
    }
}
