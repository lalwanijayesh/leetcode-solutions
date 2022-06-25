package p243;

/**
 * 243. Shortest Word Distance
 * https://leetcode.com/problems/shortest-word-distance/
 */
class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int x = -1;
        int y = -1;
        int dist = Integer.MAX_VALUE;
        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1)) {
                x = i;
                if (y >= 0) {
                    dist = Math.min(Math.abs(x - y), dist);
                }
            } else if (wordsDict[i].equals(word2)) {
                y = i;
                if (x >= 0) {
                    dist = Math.min(Math.abs(x - y), dist);
                }
            }
        }
        return dist;
    }
}
