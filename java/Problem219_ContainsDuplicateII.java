// https://leetcode.com/problems/contains-duplicate-ii/

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            int value = nums[i];
            if (map.containsKey(value)) {
                int dif = i - map.get(value);

                if (dif <= k) return true;
            }
            map.put(value, i);
        }

        return false;
    }
}
