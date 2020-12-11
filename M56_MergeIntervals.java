class Solution {
    public int[][] merge(int[][] intervals) {
        int k=0;
        //List of arrays
        List<int[]> result = new ArrayList<int[]>();
        
        // Sorts array on start time 
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        //Add the first interval to the list
        result.add(intervals[0]);
        
        
        for(int[] i: intervals){
            // check if start < end (that means interesction and hence merge)
            // if the incomming interval is totally inside the interval already in list (e.g. [1,4], [2,3])
            //Here [2,3] is totatally inside [1,4] hence use Math.max to get 4 instead of 3 (max of end)
            if((i[0]<=result.get(result.size()-1)[1]))
                result.get(result.size()-1)[1] = Math.max(result.get(result.size()-1)[1], i[1]);
            else
               result.add(i);
        }
        
        int res[][] = new int[result.size()][2];
        for(int[] i: result)
            res[k++]=i;
        
        return res;
    }
}
