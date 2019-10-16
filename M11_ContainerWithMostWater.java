class Solution {
    int count =0;
    
    public int maxArea(int[] height) {
        int[] area = new int[height.length];
        
        for(int i = 0 ; i<height.length ; i++)
        {
            area[i] = myMaxArea(height,i);
            System.out.print(" " + area[i]);
        }        
        return max(area);            
    }
    
    public int myMaxArea(int[] hei, int i ) {
        int area; int[] arr = new int[hei.length]; int breadth;
        //System.out.print("hello i ---" + i + " hello hei len ---" + hei.length);
        for(int j=0; j<hei.length-i ; j++)
        {
            if(hei[j] < hei[hei.length-i-1])
                breadth = hei[j];
            else
                breadth = hei[hei.length-i-1];
            int length = (hei.length-i) - (j+1);
            area = length * breadth;
            arr[j] = area;
        }
        int max_area = max(arr);
        return max_area;
    }
    
        
    public int max(int[] arr){      
        int max = arr[0];
        for (int j=0; j<arr.length-1; j++)
        {
             
            if (arr[j+1] > max)
                max = arr[j+1];
        }            
         return max;                
    }
    
    
}