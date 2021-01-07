// There are two approaches discussed here both has O(nlogn) complexity because sorting is always needed.
/*
In Approach 1,
Consider E.g. Intervals = [[0,30],[5,10],[15,20]] output: 2
Create a Treeset (which is already sorted by values) [0, 5, 10, 15, 20, 30]
if number in tree set matches with start time then increment counter else decrement counter.
Count -- 1, 2, 1, 2, 1, 0   Max_count = 2

Approach 2,
It uses heap to keep track of end time,  Meeting structure is added to the heap
CompareTo is implemented in order to sort the heap by its end times

*/


//Approach 1 
class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> a[0]- b[0]);
        int count=0, max_count = 0;
        Set<Integer> time = new TreeSet<>();
        for(int i[]: intervals){
            time.add(i[0]); time.add(i[1]);
        }
        
        for(int t: time){
            for(int i[]: intervals){
                if(t==i[0])
                    count++;
                else if(t==i[1])
                    count--;
            }
            
            max_count = Math.max(max_count,count);
        }
        
        return max_count;
    }
}

//Approach 2
class Meeting implements Comparable<Meeting>{
    int start;
    int end;
    
    public Meeting(int start, int end){
        this.start = start;
        this.end = end;
    }
    
    
    public int compareTo(Meeting t){
        return Integer.compare(end, t.end);
    }
}

class Solution {
    public int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
       PriorityQueue<Meeting> time = new PriorityQueue<>();
        time.offer(new Meeting(intervals[0][0], intervals[0][1]));
        
        for(int i = 1; i < intervals.length; i++){         
                if(intervals[i][0]>=time.peek().end){
                    time.poll(); 
                }
             time.offer(new Meeting(intervals[i][0], intervals[i][1]));
            }
                
        
        return time.size();
    }
}
