class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)
            return null;
        if(lists.length ==1)
            return lists[0];
        // ListNode head = mergeLists(lists[0],lists[1]);
        for(int i=1;i<lists.length;i++)
        {
            lists[0] = mergeTwoLists(lists[0],lists[i]);
        }
        
        return lists[0];
        
    }
    
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
