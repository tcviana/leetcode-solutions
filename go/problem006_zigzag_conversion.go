// https://leetcode.com/problems/zigzag-conversion/

func convert(s string, numRows int) string {

    if numRows == 1 {
        return s
    }

    m := make(map[int]string, numRows)
    row := 0
    direction := -1

    for _, c := range s {
        m[row] += string(c)
        
        if (row == 0 || row == numRows-1) {
            direction *= -1
        }
        row += direction
    }

    var sb strings.Builder

    for i:=0; i<numRows; i++ {
        sb.WriteString(m[i])
    }

    return sb.String()
}
