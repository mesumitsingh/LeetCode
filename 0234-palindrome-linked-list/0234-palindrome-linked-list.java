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
    public boolean isPalindrome(ListNode head) {
        ListNode middle = middle(head); 
        ListNode reversed = reverse(middle); 

        while(head != null && reversed != null) { 
            if(head.val != reversed.val) { 
                return false; 
            }
            head = head.next; 
            reversed = reversed.next; 
        }

        return true; 
    }

    public ListNode middle(ListNode head) { 
        ListNode slow = head; 
        ListNode fast = head; 

        while(fast != null && fast.next != null) {
            slow = slow.next; 
            fast = fast.next.next; 
        }

        return slow; 
    }

    public ListNode reverse(ListNode head) {
        if(head.next == null || head == null) { 
            return head; 
        }

        ListNode last = reverse(head.next); 

        head.next.next = head; 
        head.next = null; 
        
        return last; 
    }
}