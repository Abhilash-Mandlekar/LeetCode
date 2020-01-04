class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer>  hm = new HashMap<>();
        for (int j=0;j<nums.length; j++)
        {
            if(!hm.containsKey(nums[j]))
                hm.put(nums[j],1);
            else
                hm.put(nums[j], hm.get(nums[j]) + 1);
        }
     //System.out.println(hm);
        int j=0;
        for(int i: hm.keySet())
        {
            int val = hm.get(i);
            for(int k=0; k<val;k++)
            {
                nums[j] = i; j++;
            }
        }
    }
}
