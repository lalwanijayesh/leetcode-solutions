package p1160;

/**
 * 1160. Find Words That Can Be Formed by Characters
 * https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
 */
class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charArr = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            charArr[chars.charAt(i) - 'a']++;
        }
        int count = 0;
        for (String word : words) {
            if (isGoodString(word, charArr.clone())) {
                count += word.length();
            }
        }
        return count;
    }

    private boolean isGoodString(String str, int[] charCount) {
        for (int i = 0; i < str.length(); i++) {
            if (--charCount[str.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
