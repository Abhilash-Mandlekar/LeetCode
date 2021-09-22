class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return head;
        ListNode dummyHead = head;
        ListNode itr = head;
        
        int n = getLength(itr);
        
        itr = dummyHead;
        if(k==n || (k%n)==0)
            return dummyHead;
        else if(k>n)
            k = k % n;
        
        int num = n -k-1;
        while(num-->0)
            itr = itr.next;
        
        //result is head of next list
        ListNode result = itr.next;
        
        //traverse result list till end and attach its end to the head of original list (dummyHead)
        ListNode temp = result;
        while(temp.next!=null) temp = temp.next;
        temp.next = dummyHead;
        
        itr.next = null;
        return result;
    }
    
    public int getLength(ListNode node){
        int count = 0;
        ListNode itr = node;
        while(itr!=null){
            itr = itr.next;
            count++;
        }
        return count;
    }
}
