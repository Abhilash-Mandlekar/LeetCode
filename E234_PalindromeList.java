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
        ListNode curr = head;
        ListNode l = head;
        
        // deep copy list
        ListNode rev = new ListNode(0, null);
        ListNode dummyHead = rev;        
        
        while(l!=null){
            rev.next = new ListNode(l.val);
            l = l.next;
            rev = rev.next;
        }
        
        rev = dummyHead.next;
        
            
        ListNode r = reverseList(rev);
        
        while(r!=null && curr!=null)
        {
            if(r.val != curr.val)
            {
                return false;
            }
            r = r.next;
            curr = curr.next;
        }
        
        return true;
    }
    
    public ListNode reverseList(ListNode l){
        ListNode curr = l;
        ListNode prev = null;
        
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        return prev;
    }
}
