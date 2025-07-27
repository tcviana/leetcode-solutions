// https://leetcode.com/problems/ransom-note/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int left = 0;
        int right = magazine.length() -1;
        List<Character> note = new ArrayList<>();
        
        for (char c : ransomNote.toCharArray()) {
            note.add(c);
        }

        while (left<=right) {
            for (int i=0; i<note.size(); i++) {
                if (magazine.charAt(left) == note.get(i)) {
                    left++;
                    note.remove(i--);
                    continue;
                }
                if (magazine.charAt(right) == note.get(i)) {
                    right--;
                    note.remove(i--);
                    continue;
                }
            }
            left++;
            right--;
        }

        return note.isEmpty();
        
    }
}
