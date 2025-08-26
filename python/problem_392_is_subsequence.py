# https://leetcode.com/problems/is-subsequence/

class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        init = 0
        for i in t:
            if init >= len(s):
                break
            if s[init] == i:
                init += 1

        return init == len(s)
        
