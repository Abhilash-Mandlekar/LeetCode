class Solution {
    boolean visited[];
    public boolean validPath(int n, int[][] edges, int start, int end) {
        visited = new boolean[n];
        Map<Integer, List<Integer>> hm = new HashMap<>();
        
        for(int[] e: edges){
            List<Integer> temp = hm.getOrDefault(e[0], new ArrayList<>());
            temp.add(e[1]);
            hm.put(e[0], temp);
            
        }
        
        // For bi-directional graph
        for(int[] e: edges){
            List<Integer> temp = hm.getOrDefault(e[1], new ArrayList<>());
            temp.add(e[0]);
            hm.put(e[1], temp);   
        }
        
        return dfs(start, end, hm);
    }
    
    public boolean dfs(int s, int e, Map<Integer, List<Integer>> hm){
        if(s==e)
            return true;
        else if(visited[s] || !hm.containsKey(s))
            return false;
        
        visited[s] = true;
        
        List<Integer> vals = hm.get(s);
        for(int n: vals){
           if(dfs(n, e, hm))
               return true;
        }
           
        return false;
    }
}
