
/**
 * 
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 * 
 * 2019-11-29
 */

 class Solution {
     /**
      * 
      
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode head;
        ListNode tail;

        if (l1.val <= l2.val) {
            head = l1;
        } else {
            head = l2;
        }

        tail = head;

        while(l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                tail = tail.next;
                l1 = l1.next;
            } else {
                tail.next = l2;
                tail = tail.next;
                l2 = l2.next;
            }
        }

        if (l1 == null) {
            tail.next = l2;
        } else {
            tail.next = l1;
        }

        return head;

    }
    */

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode tail = head;

        while(l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                tail = tail.next;
                l1 = l1.next;
            } else {
                tail.next = l2;
                tail = tail.next;
                l2 = l2.next;
            }
        }

        if (l1 == null) {
            tail.next = l2;
        } else {
            tail.next = l1;
        }

        return head.next;

    }

 }