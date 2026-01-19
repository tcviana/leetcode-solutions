// https://leetcode.com/problems/h-index/

class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int size = citations.length;

        for (int x=0; x<size; x++) {
            int citation = citations[x];
            int article = size-x;

            if (citation >= article) {
                return article;
            }
        }

        return 0;
    }
}
