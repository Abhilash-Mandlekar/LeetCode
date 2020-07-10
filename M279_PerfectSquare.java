class Solution {
    public int numSquares(int n) {
        
        List<Integer> sq = new ArrayList<>();
        int[] dp = new int[n+1];
        
        // Get all the perfect squares till the number
        for(int i = 1; i<=n ; i++){
            double a = Math.sqrt(i);
            if((a - Math.floor(a)) == 0)
            {
                sq.add(i);
            }
        }
        
        // System.out.println(sq);
        Arrays.fill(dp, n);
        dp[0] = 0;
        
        //Apply coin change problem
        for (int i = 1; i <= n; i++) {
          for (int j = 0; j < sq.size(); j++) {
            if (sq.get(j) <= i) {
              dp[i] = Math.min(dp[i], dp[i - sq.get(j)] + 1 );
                
            }
              
      }
    }
        return dp[n];
    }
}
