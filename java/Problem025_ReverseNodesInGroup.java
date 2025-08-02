// https://leetcode.com/problems/reverse-nodes-in-k-group

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) return head;

        ListNode start = head;
        ListNode current = head;

        while (true) {
            Deque<Integer> stack = new ArrayDeque<>();
            ListNode temp = current;
            int count = 0;

            while (count < k && temp != null) {
                stack.push(temp.val);
                temp = temp.next;
                count++;
            }

            if (count < k) break;

            for (int i = 0; i < k; i++) {
                current.val = stack.pop();
                current = current.next;
            }
        }

        return start;
    }
}
