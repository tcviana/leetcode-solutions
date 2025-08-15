// https://leetcode.com/problems/zigzag-conversion

class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder[] rows = new StringBuilder[numRows];

        for (int i=0; i<numRows; i++) {
            rows[i] = new StringBuilder();
        }
        int increment = -1;
        int row = 0;

        for (char c : s.toCharArray()) {
            rows[row].append(c);

            if (row == 0 || row == (numRows-1)) {
                increment *= -1;
            }
            row += increment;
        }

        StringBuilder result = new StringBuilder();
        for (int i=0; i<numRows; i++) {
            result.append(rows[i]);
        }

        return result.toString();

    }
}
