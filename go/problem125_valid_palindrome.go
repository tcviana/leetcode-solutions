// https://leetcode.com/problems/valid-palindrome/

func isPalindrome(s string) bool {
    s = strings.TrimSpace(s)
    s = strings.ToLower(s)
    reg, _ := regexp.Compile("[^a-z0-9]+")
    s = reg.ReplaceAllString(s, "")

    if s == "" {
        return true
    }

    for i,j := 0, len(s)-1; i<j; i,j = i+1, j-1 {
        if s[i] != s[j] {
            return false
        }
    }

    return true
}
