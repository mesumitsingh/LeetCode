class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) { 
            return null;
        }
        
        ListNode currNode = head; 

        while(currNode.next != null) { 
            if(currNode.val == currNode.next.val) { 
                currNode.next = currNode.next.next;
            } else { 
                currNode = currNode.next;
            }
        }

        return head;
    }
}
