// https://leetcode.com/problems/is-subsequence

func isSubsequence(s string, t string) bool {
    sizeS := len(s)
    sizeT := len(t)

    if sizeS == 0 {
        return true
    }

    i,j := 0,0
    
    for i<sizeS && j<sizeT {
        if (s[i]==t[j]){
            i++
        }
        j++
    }

    return i==sizeS
}
