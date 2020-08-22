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
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> al = new ArrayList<Integer>();
        ListNode temp = new ListNode(0);
        
        while(head!=null){
        int num = head.val;
        head = head.next;
        
        temp = head;
        int var = next_larger(num, head);
        al.add(var);
        
        }
        
        int[] arr = new int[al.size()];
        for(int i=0; i<al.size(); ++i){
            arr[i] = al.get(i);
        }
        return arr;
    }
    
    public int next_larger(int num, ListNode node){
        
        while(node!=null){
            if(node.val>num)
                return node.val;
            node = node.next;
        }   
        return 0;
    }
}
