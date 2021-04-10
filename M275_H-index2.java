
// Application of Binary Search 
class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length, i=0;
        
        if(n==1 && citations[0]==0) return 0;
        if(n==1 && citations[0]!=0) return 1;
        
        int left=0, right = n-1;
        
        while(left<=right){
            int mid = left + (right-left);
            
            if(citations[mid]==(n-mid))
                return citations[mid];
            
            //Move right
            else if(citations[mid]<(n-mid))
                left = mid+1;
            else 
                right = mid-1;
        }
        
        return n - left;
    }
}
