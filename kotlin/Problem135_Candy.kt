/**
// LeetCode 135 - Candy
// https://leetcode.com/problems/candy/

There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.

You are giving candies to these children subjected to the following requirements:

Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.
Return the minimum number of candies you need to have to distribute the candies to the children.

 

Example 1:

Input: ratings = [1,0,2]
Output: 5
Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
Example 2:

Input: ratings = [1,2,2]
Output: 4
Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
The third child gets 1 candy because it satisfies the above two conditions.
 

Constraints:

n == ratings.length
1 <= n <= 2 * 104
0 <= ratings[i] <= 2 * 104

*/

class Solution {
    fun candy(ratings: IntArray): Int {
        val size = ratings.size
        val candies = IntArray(size) { 1 }

        for (i in 1 until size) {
            if (ratings[i] > ratings[i-1]) {
                candies[i] = candies[i-1] + 1
            }
        }

        var sum = 0;
        for (i in size-2 downTo 0) {
            if (ratings[i] > ratings[i+1]) {
                candies[i] = maxOf(candies[i], candies[i+1] + 1)
            }
            sum += candies[i]
        }

        // variable sum bring more performance that use candies.sum() because avoid further processing
        return sum + candies[size - 1]

    }
}
