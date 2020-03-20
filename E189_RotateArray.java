class Solution {
    public void rotate(int[] nums, int k) {
        int len_arr = nums.length; 
        int arr[] = new int[len_arr];
        int j=0;
        if(k>len_arr){
            k = k % len_arr;
        }
        
        for(int i = len_arr-k; i<len_arr; i++)
        {
            arr[j] = nums[i];
            j++;
        }
        for(int i=0; i<len_arr-k; i++)
        {
            arr[j] = nums[i];
            j++;
        }
        
        j=0;  
        for(int i=0; i<len_arr; i++)
        {
            nums[i] = arr[j];
            j++;
        }
        
    }
}
