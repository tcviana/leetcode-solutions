// https://leetcode.com/problems/longest-common-prefix/

func longestCommonPrefix(strs []string) string {
    if len(strs) == 0 {
        return ""
    }

    res := strs[0]

    for _, word := range strs[1:] {

        size := min(len(word), len(res))

        i:=0
        for i<size && res[i] == word[i] {
            i++
        } 
        res = res[:i]
    }

    return res
}
