// https://leetcode.com/problems/triangle

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size()==1)
            return triangle.get(0).get(0);
        
        int sum = 0;

        for (List<Integer> list : triangle) {
            int minor = list.get(0);
            for (int i=1; i<list.size(); i++) 
                minor = Math.min(minor,list.get(i));
            sum += minor;
        }

        return sum;
    }
}
