# https://leetcode.com/problems/is-subsequence/

class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        i,j=0,0
        size_s = len(s)
        size_t = len(t)

        while i<size_s and j<size_t:
            if s[i]==t[j]:
                i=i+1
            j=j+1
        
        return i==size_s
        
