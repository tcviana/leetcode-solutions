// https://leetcode.com/problems/zigzag-conversion/

package main

import (
    "strings"
)

func convert(s string, numRows int) string {
    if numRows == 1 || len(s) <= numRows {
        return s
    }

    rows := make([]strings.Builder, numRows)
    row := 0
    direction := -1

    for _, c := range s {
        rows[row].WriteRune(c) // accept runes without convert
        if row == 0 || row == numRows-1 {
            direction *= -1
        }
        row += direction
    }

    var sb strings.Builder
    for i := 0; i < numRows; i++ {
        sb.WriteString(rows[i].String())
    }
    return sb.String()
}
