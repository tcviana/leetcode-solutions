// https://leetcode.com/problems/reverse-words-in-a-string/

func reverseWords(s string) string {
    // Fields is a split that use space as default
    fields := strings.Fields(s)

    // double for, firt create variable after receive values
    for i,j := 0, len(fields)-1; i<j; i,j = i+1, j-1 {
        fields[i], fields[j] = fields[j], fields[i]
    }

    return strings.Join(fields, " ")
}
