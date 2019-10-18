/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0; int c=0; ListNode l3 = new ListNode(0); int num = 0; ListNode head = l3;
        while(l1!=null || l2!=null){
            if(l1!=null && l2!=null){
            num = carry + l1.val + l2.val;
            }
            else if(l1!=null && l2==null){
                num = carry + l1.val ;
            }
            else{
                num = carry + l2.val ;
            }
            // System.out.println("num"+num);
            if(num >= 10){
                carry = 1;
                l3.val = num%10; 
            }
            else{
            carry = 0; l3.val = num; 
            }
        
            if(l1!=null)
                l1 = l1.next;
            if(l2!=null)
                l2 = l2.next;
            
            if(l1!=null || l2!=null){
                l3.next = new ListNode(0); 
                l3 = l3.next;
                
            }
        }
    

        if(carry==1)
        {
            l3.next = new ListNode(0); 
            l3 = l3.next;
            l3.val = carry;
        }
        return head;
    }
}