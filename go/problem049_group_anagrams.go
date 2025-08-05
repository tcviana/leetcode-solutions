// https://leetcode.com/problems/group-anagrams/

func groupAnagrams(strs []string) [][]string {
    ans := make(map[string][]string)

    for _, s := range strs {
        b := []byte(s)
        sort.Slice(b, func(i,j int) bool {return b[i]<b[j] })
        key := string(b)

        ans[key] = append(ans[key], s)
    }

    result := make([][]string, 0, len(ans))
    for _, group := range ans {
        result = append(result, group)
    }

    return result
}
