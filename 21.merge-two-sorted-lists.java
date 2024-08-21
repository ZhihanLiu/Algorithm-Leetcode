/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 */

// @lc code=start
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
import java.util.*;
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode (0);
        ListNode ans = dummy;
        while(l1 != null || l2 != null){
            int left = l1 == null?Integer.MAX_VALUE: l1.val;
            int right = l2 == null?Integer.MAX_VALUE: l2.val;
            if(left < right){
                dummy.next = l1;
                dummy = dummy.next;
                if(l1 != null) l1 = l1.next;
            }
            else {
                dummy.next = l2;
                dummy = dummy.next;
                if(l2 != null) l2 = l2.next;
            }
              

        }
        return ans.next;
    }
}
// @lc code=end

