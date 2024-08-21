/*
 * @lc app=leetcode id=23 lang=java
 *
 * [23] Merge k Sorted Lists
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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length < 1) return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a,b)->
                a.val -  b.val
        );
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;
        
        for(int i = 0; i < lists.length; i++) if(lists[i] != null) pq.add(lists[i]);

        while(!pq.isEmpty()){
           ListNode cur= pq.poll();
           dummy.next = cur;
           dummy = dummy.next;
          if(cur.next != null) pq.add(cur.next);
        }
        return ans.next;


    }
}
// @lc code=end

