class Solution {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int src = 0;     
        List<Integer> path = new ArrayList<Integer>();
        path.add(0);
        return dfsDAG(path, graph, src, graph.length-1);
    }
    
    public List<List<Integer>> dfsDAG(List<Integer>path, int[][] graph, int src, int dest){
        if(src==dest){
            result.add(new ArrayList<Integer>(path));
            return result;
        }
                       
        for(int i=0; i<graph[src].length; ++i){ 
            path.add(graph[src][i]);
            dfsDAG(path, graph, graph[src][i], dest);     
            path.remove(path.size()-1);
        }
        
        return result;
    }
}
