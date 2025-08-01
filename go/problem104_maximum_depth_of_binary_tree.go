// https://leetcode.com/problems/maximum-depth-of-binary-tree/description/?envType=study-plan-v2&envId=top-interview-150

/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func maxDepth(root *TreeNode) int {
    if root == nil {
        return 0
    }

    sizeLeftNode := maxDepth(root.Left)
    sizeRightNode := maxDepth(root.Right)
    biggerNode := max(sizeLeftNode, sizeRightNode)

    return 1 + biggerNode
}
