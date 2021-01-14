enum Color{ WHITE, GRAY, BLACK}

class Solution {
    
    List<Integer> schedule = new ArrayList<>();
    boolean result = true;
    
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> courses = new HashMap<>(); 
        
        Color[] c = new Color[numCourses];
        
        int[] order = new int[numCourses]; 
        
        //initialize with white colour
        
        for(int i=0; i<numCourses; ++i)
            c[i] = Color.WHITE; 
        
        
        for(int i=0; i<prerequisites.length; ++i){
            if(!courses.containsKey(prerequisites[i][1])){
                List<Integer> temp = new ArrayList<>();
                temp.add(prerequisites[i][0]);
                courses.put(prerequisites[i][1], temp);
            }
            else{
                List<Integer> temp = courses.get(prerequisites[i][1]);
                temp.add(prerequisites[i][0]);
                courses.put(prerequisites[i][1], temp);
            }
            
        }
        
        //System.out.println(courses);
        
        
        for(int i=0; i<numCourses; ++i){
            if(c[i]==Color.WHITE)
                isSchedulePossible(i, courses, c);               
        }
        
        //System.out.println(result);
        
        if(result){
            for(int i=0; i<numCourses; i++)
                order[i] = schedule.get(numCourses - i - 1);
            return order;
        }
            
        
        return new int[0];
    }
    
    public void isSchedulePossible(int course, Map<Integer, List<Integer>> courses, Color[] visited){
        
        //If GRAY to GRAY return false
        if(!result) return;
            
               
        visited[course] = Color.GRAY;
        
        if(courses.containsKey(course)){
            List<Integer> d = courses.get(course);
            for(int i: d){
                // If neighbours are GRAY return false
                if(visited[i]==Color.GRAY) result= false;
                else if(visited[i]==Color.WHITE) isSchedulePossible(i, courses, visited);
            }
        }
        
        visited[course] = Color.BLACK;
        
        schedule.add(course);

    }
        
        
}
