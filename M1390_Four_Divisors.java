class Solution {
    public int sumFourDivisors(int[] nums) {
        List<Integer> al = new ArrayList(); 
        List<Integer> total = new ArrayList(); 
        int sum =0;
        for(int i=0;i<nums.length; i++)
        {
            int num = (int)Math.ceil(Math.sqrt(nums[i])); sum=0;
             int count =0;
            al.add(1); al.add(nums[i]);
            for(int j=2; j<=num; j++)
            {
                if((nums[i]%j==0) && !al.contains(j))
                {
                    //System.out.println(" J %" + j + " mod " + nums[i]);
                    
                    al.add(j); 
                    if((nums[i]/j) != j)    al.add(nums[i]/j);
                     sum=sum + (nums[i]/j) + j;                  
                }
            }
            count = al.size();
            //System.out.println(al); 
            al.removeAll(al);
            if(count==4){
                sum=sum + 1 + nums[i];
                //System.out.println(sum);
                total.add(sum);
            }
            
        }
        
        //System.out.println(total);
        sum = 0;
        for(int i: total)
        {
            sum+=i;
        }
        return sum;
    }
}
