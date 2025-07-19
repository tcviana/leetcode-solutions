// https://leetcode.com/problems/reverse-words-in-a-string/

class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }else if(sb.length()!=0){
                result.insert(0, sb);
                result.insert(0, " ");
                sb.setLength(0);
            }
        }
        result.insert(0, sb);
        return result.toString();
    }
}
