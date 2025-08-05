// https://leetcode.com/problems/integer-to-roman

class Solution {
    fun intToRoman(num: Int): String {
        val symbol = listOf("M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I")
        val value = listOf(1000, 900, 500, 400, 100 ,90, 50, 40, 10, 9, 5, 4, 1)

        val result = StringBuilder()
        var n = num;

        for (i in value.indices) {
            while (n>=value[i]) {
                n -= value[i]
                result.append(symbol[i])
            }
        }

        return result.toString();
    }
}
