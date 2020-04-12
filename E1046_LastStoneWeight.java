class Solution {
    public int lastStoneWeight(int[] stones) {
        
        List<Integer> st = new ArrayList<>();
        int temp;
        
        for(int i=0; i<stones.length; i++){
            st.add(stones[i]);
        }
        
        while(st.size()>1){
            Collections.sort(st);
            //System.out.println(st);
            if(st.get(st.size()-2)<st.get(st.size()-1)){
                temp = st.get(st.size()-1) - st.get(st.size()-2);
                st.remove(st.size()-1); st.remove(st.size()-1);
                st.add(temp);
            }
            else if (st.get(st.size()-2)>st.get(st.size()-1)){
                temp = st.get(st.size()-2) - st.get(st.size()-1);
                st.remove(st.size()-1); st.remove(st.size()-1);
                st.add(temp);
            }
            else{
                st.remove(st.size()-1); st.remove(st.size()-1);
            }
        }
        
        if(st.size()==0)
            return 0;
        else
            return st.get(0);
    }
        
}
