class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true;
        if(n<10 && n!=7) return false;
      List<Integer> al = new ArrayList<>();
        while(n>0){
            int m = n%10;
            al.add(m);
            n = n/10;
        }
        int num=0; int sum=0;
        for(int i=0;i<al.size();i++) {            
            num = al.get(i)*al.get(i); sum+=num;
        }
        
        return (isHappy(sum));
    }
}
