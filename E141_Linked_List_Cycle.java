/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       List<ListNode> al = new ArrayList();
        
        
        boolean flag = false;
        
        while(head!=null){
                if(!al.contains(head)){
                    al.add(head);
                    head = head.next;
                }
                else{
                    flag = true;
                    break;
                }
            }
            
            return flag;
        }
        
    
}
