package p605;

/**
 * 605. Can Place Flowers
 * https://leetcode.com/problems/can-place-flowers/
 */
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        boolean prev, next;
        for (int i = 0; i < len && n > 0; i++) {
            if (flowerbed[i] == 0) {
                prev = (i == 0 || flowerbed[i - 1] == 0);
                next = (i == len - 1 || flowerbed[ i + 1] == 0);
                if (prev && next) {
                    n--;
                    i++;
                }
            }
        }
        return n == 0;
    }
}
