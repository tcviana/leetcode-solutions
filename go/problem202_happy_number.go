// https://leetcode.com/problems/happy-number/

func isHappy(n int) bool {
    seen := make(map[int]bool)

    for n!=1 && !seen[n] {
        seen[n] = true
        n = sumPairs(n)
    }

    return n==1

}

func sumPairs(n int) int {
    sum := 0

    for n>0 {
        num := n%10
        sum += num*num
        n /= 10
    }

    return sum
}
