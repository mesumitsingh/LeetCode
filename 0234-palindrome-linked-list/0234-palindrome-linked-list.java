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
        if(head == null || head.next == null) { 
            return true;
        }

        ListNode slow = head; 
        ListNode fast = head; 
        while(fast.next !=null && fast.next.next != null) { 
            slow = slow.next; 
            fast = fast.next.next;
        }

        ListNode middle = reverseList(slow.next); 

        ListNode firstHalf = head; 
        ListNode secondHalf = middle; 
        boolean palindrome = true; 
        while(secondHalf != null) { 
            if(firstHalf.val != secondHalf.val) { 
                palindrome = false;
            }

            secondHalf = secondHalf.next; 
            firstHalf = firstHalf.next;
        }

        return palindrome;

    }

    private ListNode reverseList(ListNode head) { 
        ListNode prev = null; 
        ListNode curr = head; 
        while(curr != null) { 
            ListNode temp = curr.next; 
            curr.next = prev; 
            prev = curr; 
            curr = temp;
        }

        return prev;
    }
}