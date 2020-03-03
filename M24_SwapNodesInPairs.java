/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode swap = new ListNode(0);
        ListNode temp = new ListNode(0);
        //ListNode temp2 = head;
        ListNode temp3 = swap;
        
        if(head==null)
            return head;
        
        int i=0;
       
        while(head.next!=null)
        {       
            if(i%2==0){
            swap.next = new ListNode(0);
            swap = swap.next;
            
            temp.val = head.next.val;
            
            swap.val = temp.val;            
            
            swap.next = new ListNode(0);
            swap = swap.next;
            swap.val = head.val;
            }
                
            head = head.next;
           i++;
        }
        
        if(i%2==0)
        {
            swap.next = new ListNode(0);
            swap.next.val = head.val;
        }
        swap = temp3.next;
        return swap;
    }
}
