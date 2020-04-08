/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        ListNode result = new ListNode(0);
        ListNode temp2 = result;
        int total_nodes=0, start_node=0, count=1;
        
        while(head!=null){
            total_nodes++;
            head = head.next;
        }
        head = temp;
        start_node = total_nodes/2 + 1;
        
        while(count<=total_nodes){
            if(count<start_node){
                count++;
                head = head.next;
            }
            else{
            result.next = new ListNode(0);
            result = result.next;
            result.val = head.val;
            head = head.next;    
            count++;
            }
        }
        result = temp2.next;
        return result;
    }
}
