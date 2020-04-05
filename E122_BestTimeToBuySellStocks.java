class Solution {
    public int maxProfit(int[] prices) {
        int max=0; int max_profit =0, i=0;
       
        for(int j=0; j<prices.length-1; j++){
           
            if(prices[j]<prices[j+1]){
                    
                    max_profit+=(prices[j+1] - prices[j]);
                }
                
            }
        
        return max_profit;
    }
}
