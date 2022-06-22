package p118;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. Pascal's Triangle
 * https://leetcode.com/problems/pascals-triangle/
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(pascal.get(i - 1).get(j - 1)
                        + pascal.get(i - 1).get(j));
            }
            if (i > 0) {
                row.add(1);
            }
            pascal.add(row);
        }
        return pascal;
    }
}
