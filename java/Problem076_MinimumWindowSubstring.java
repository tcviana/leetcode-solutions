// https://leetcode.com/problems/minimum-window-substring/description/

class Solution {
    public String minWindow(String s, String t) {
        
        if (s.length() < t.length()) {
            return "";
        }

        Map<Character, Integer> target = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for (char c : t.toCharArray()) {
            target.put(c, target.getOrDefault(c,0)+1);
        }

        int sizeMin = target.size();
        int count = 0, left = 0, right = 0; 
        int size = -1;

        for (int i=0, j=0; i < s.length(); i++) {
            char c = s.charAt(i);
            window.put(c, window.getOrDefault(c,0)+1);

            if (target.containsKey(c) && target.get(c).intValue() == window.get(c).intValue()) {
                count++;
            }

            while (left<=right && count==sizeMin) {
                int length = i-j +1;
                if (size == -1 || size > length) {
                    size = length;
                    left = j;
                    right = i;
                }

                c = s.charAt(j);
                window.put(c, window.get(c)-1);
                if (target.containsKey(c) && target.get(c).intValue() > window.get(c).intValue()) {
                    count--;
                }
                j++;
            }
        }

        return size != -1 ? s.substring(left, right+1) : "";
    }
}
