package p937;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 937. Reorder Data in Log Files
 * https://leetcode.com/problems/reorder-data-in-log-files/
 */
class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, new Comparator<String>() {
            public int compare(String a, String b) {
                String[] tokensA = a.split(" ", 2);
                String[] tokensB = b.split(" ", 2);
                boolean isDigitA = Character.isDigit(tokensA[1].charAt(0));
                boolean isDigitB = Character.isDigit(tokensB[1].charAt(0));
                if (!isDigitA && isDigitB) {
                    return -1;
                } else if (isDigitA && !isDigitB) {
                    return 1;
                } else if (!isDigitA && !isDigitB) {
                    int content = tokensA[1].compareTo(tokensB[1]);
                    if (content == 0) {
                        return tokensA[0].compareTo(tokensB[0]);
                    } else {
                        return content;
                    }
                } else {
                    return 0;
                }
            }
        });
        return logs;
    }
}
