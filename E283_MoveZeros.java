class Solution {
    public void moveZeroes(int[] nums) {
        int temp = 0; int i = 0;  int count = 0;
        while((i<nums.length) && (count<nums.length)){
                 
             if(nums[i]==0){
                int k=nums.length-1;
                
                while((nums[k]==0) && (k<i))
                {             
                    k--;
                }
                temp = nums[k];
                nums[k] = 0;
                k--;
                while(k>=i)
                {
                    int t1 = nums[k];
                    nums[k] = temp;
                    temp = t1;
                    k--;
                    
                }
                // check how array rotates
                 // for(int m=0; m<nums.length; m++){
                 //     System.out.print(nums[m] + " ");
                 // }
                 // System.out.println();
                 count++;
               
            }
            else
                i++;
        }
    }
}
