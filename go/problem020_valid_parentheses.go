// https://leetcode.com/problems/valid-parentheses/

func isValid(s string) bool {
    if len(s)%2 !=0 {
            return false
    }
    bracket := map[rune]rune {
        '(':')',
        '{':'}',
        '[':']',
    }

    var stack []rune

    for _, c := range s {

        if closeBracket, ok := bracket[c]; ok {
            stack = append(stack, closeBracket)
        } else {
            if len(stack) == 0 || stack[len(stack)-1] != c {
                return false
            }
            stack = stack[:len(stack)-1]
        }

    }
    return len(stack) == 0    

}

