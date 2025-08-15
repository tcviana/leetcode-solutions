# https://leetcode.com/problems/zigzag-conversion

class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1 or len(s) <= numRows:
            return s

        rows = [[] for _ in range(numRows)]
        increment = 1
        row = 0

        for c in s:
            rows[row].append(c)

            if row == 0:
                increment = 1
            elif row == numRows-1:
                increment = -1

            row += increment

        return "".join("".join(r) for r in rows)
        
