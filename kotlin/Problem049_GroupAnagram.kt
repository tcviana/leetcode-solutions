// https://leetcode.com/problems/group-anagrams

class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String, MutableList<String>>()

        for (word in strs) {
            val key = word.toCharArray().sorted().joinToString("")

            map.getOrPut(key) { mutableListOf() }.add(word)
        }

        return map.values.toList();
    }
}
