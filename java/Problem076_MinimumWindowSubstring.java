// https://leetcode.com/problems/minimum-window-substring/description/

class Solution {
    public String minWindow(String s, String t) {
        
        if (s.length() < 1 || t.length() > s.length() || t.length() < 1) {
            return "";
        }

        Set<Character> map = new HashSet<>();
        Set<Character> set = new HashSet<>();

        for (char c : t.toCharArray()) {
            map.add(c);
        }

        int sizeRequired = map.size();
        int count = 0, left = 0, right = 0; 
        int size = -1;

        for (int i=0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (map.contains(c)) {
                int j = i;
                while (j<s.length()) {
                    c = s.charAt(j);
                    if (map.contains(c) && set.add(c)) {
                        count++;
                    }
                    if (count == sizeRequired) {
                        int length = j - i +1;
                        if (size == -1 || size > length) {
                            size = length;
                            left = i;
                            right = j;
                        }
                        break;
                    }
                    j++;
                }
                set.clear();
                count = 0;
            }
        }

        return size != -1 ? s.substring(left, right+1) : "";
    }
}
