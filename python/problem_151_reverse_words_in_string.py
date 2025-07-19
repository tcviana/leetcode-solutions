# https://leetcode.com/problems/reverse-words-in-a-string/

class Solution:
    def reverseWords(self, s: str) -> str:
        s = self.remove_space(s)
        list_s = s.split()
        list_s = reversed(list_s)
        return ' '.join(list_s)

    def remove_space(self, s: str) -> str:
        return s.strip()
        
