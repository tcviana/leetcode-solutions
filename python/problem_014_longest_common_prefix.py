# https://leetcode.com/problems/longest-common-prefix

class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if not strs:
            return ""

        result = strs[0]

        for word in strs[1:]:
            size = min(len(word), len(result))

            i=0
            while i<size and word[i] == result[i]:
                i += 1
            
            result = result[:i]

        return result

        
