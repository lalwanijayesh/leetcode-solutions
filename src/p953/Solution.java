package p953;

/**
 * 953. Verifying an Alien Dictionary
 * https://leetcode.com/problems/verifying-an-alien-dictionary/
 */
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] rank = new int[order.length()];
        for (int i = 0; i < order.length(); i++) {
            rank[order.charAt(i) - 'a'] = i;
        }
        for (int j = 0; j < words.length - 1; j++) {
            String word1 = words[j];
            String word2 = words[j + 1];
            int k = 0;
            while (k < word1.length() && k < word2.length()) {
                char ch1 = word1.charAt(k);
                char ch2 = word2.charAt(k);
                if (ch1 == ch2) {
                    k++;
                } else if (rank[ch1 - 'a'] > rank[ch2 - 'a']) {
                    return false;
                } else {
                    break;
                }
            }
            if (k == word2.length() && k != word1.length()) {
                return false;
            }

        }
        return true;
    }
}