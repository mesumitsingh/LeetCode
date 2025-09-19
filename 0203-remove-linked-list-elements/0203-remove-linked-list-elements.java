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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0); 
        dummy.next = head; 

        ListNode currNode = dummy;
        while(currNode.next != null) { 
            if(currNode.next.val == val) { 
                currNode.next = currNode.next.next; 
            } else { 
                currNode = currNode.next;
            }
        }

        return dummy.next;
    }
}