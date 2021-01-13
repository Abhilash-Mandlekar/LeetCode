enum Color {WHITE, GRAY, BLACK}

class Solution {
    boolean result = false;
    public boolean leadsToDestination(int n, int[][] edges, int source, int destination) {
        Color[] c = new Color[n];
        
        for(int i=0; i<n; ++i)
            c[i] = Color.WHITE;
        
        Map<Integer, List<Integer>> grph = new HashMap<>();
        for(int i[]: edges){
            if(!grph.containsKey(i[0])){
                List<Integer> temp = new ArrayList<>();
                temp.add(i[1]);
                grph.put(i[0], temp);
            }
            else{
                List<Integer> temp = grph.get(i[0]);
                temp.add(i[1]);
                grph.put(i[0], temp);
            }
                
        }
        
        //System.out.println(grph.get(0));
        return isPathPossible(c, grph, source, destination);
    }
    
    public boolean isPathPossible(Color[] visited, Map<Integer, List<Integer>> grph, int src, int dest){
        
        // WILL RETURN FALSE IF COLOUR IS GRAY -- GRAY TO GRAY IS CYCLE
        if(visited[src]!=Color.WHITE)
            return visited[src]==Color.BLACK;
            
        
        if(!grph.containsKey(src))
            return src==dest;
        
        // Mark currently in process sources as GRAY
        visited[src]=Color.GRAY;
        
        
        List<Integer> d = grph.get(src);

        for(int i: d)
            if(!isPathPossible(visited, grph, i, dest))
                return false;
        
        // Mark processed vertex as black -- BACKTRACK
        visited[src]=Color.BLACK;
        
        return true;
    }
}
