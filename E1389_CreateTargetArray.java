class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> result = new ArrayList<>();
        int[] target = new int[nums.length];
        
        for(int i=0;i<nums.length; i++)
        {
            result.add(index[i], nums[i]);
        }
        
        // Copying the list to target array
        for(int i=0;i<nums.length; i++)
        {
            target[i] = result.get(i);
        }
        
        return target;
    }
}
