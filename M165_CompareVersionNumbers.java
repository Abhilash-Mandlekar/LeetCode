class Solution {
    public int compareVersion(String version1, String version2) {
        int countv1 = countDots(version1);
        int countv2 = countDots(version2);
        int diff = Math.abs(countv1-countv2);
        
        if(countv1>countv2)
            while(diff-->0) version2+=".0";
        else if(countv2>countv1)
            while(diff-->0) version1+=".0";
        
        String v1[] = version1.split("[.]");
        String v2[] = version2.split("[.]");
        
        for(int i=0; i<v1.length; ++i){
            int c1 = Integer.parseInt(v1[i]);
            int c2 = Integer.parseInt(v2[i]);
            if (c1==c2) continue;
            if(c1<c2)
                return -1; 
            else if(c1>c2)
                return 1;
        }
        return 0;
    }
    
    public int countDots(String s){
        int count=0;
        for(char ch: s.toCharArray()){
            if(ch=='.') count++;
        }
        return count;
    }
}
