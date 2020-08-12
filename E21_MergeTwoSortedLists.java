class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp = l1;
        ListNode result = new ListNode(0);
        ListNode t2 = result;
        
        while(l1!=null && l2!=null){
            result.next =  new ListNode(0);
            result = result.next;
            
            if(l1.val<=l2.val){                
                result.val = l1.val;
                l1 = l1.next;
                
            }
            else{
                result.val = l2.val;
                l2 = l2.next;
            }
            
                
                
        }
        if(l1==null && l2!=null){
            while(l2!=null)
            {
                result.next =  new ListNode(0);
                result = result.next;
                result.val = l2.val;             
                l2 = l2.next;
            }
        }
        if(l2==null && l1!=null){
            while(l1!=null)
            {
                result.next =  new ListNode(0);
                result = result.next;
                result.val = l1.val;
                l1 = l1.next;
            }
        }
        result = t2.next;
        return result;
    }
}
