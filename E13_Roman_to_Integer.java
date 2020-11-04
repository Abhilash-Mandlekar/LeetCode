class Solution {
    public int romanToInt(String s) {
        int sum =0;
        int n = s.length();
        if(n==0) return 0;
        int i=n-1;
        while(i>=0){
            // write conditions for IV, IX
            
            if(i!=0 && s.charAt(i)=='V' && s.charAt(i-1)=='I'){
                sum+=4; i-=2; continue;
            }
            else if(i!=0 && s.charAt(i)=='X' && s.charAt(i-1)=='I'){
                sum+=9; i-=2; continue;
            }
            // write conditions for XL and XC
            else if(i!=0 && s.charAt(i)=='L' && s.charAt(i-1)=='X'){
                sum+=40; i-=2; continue;
            }
            else if(i!=0 && s.charAt(i)=='C' && s.charAt(i-1)=='X'){
                sum+=90; i-=2; continue;
            }
            // write conditions for CD and CM
            else if(i!=0 && s.charAt(i)=='D' && s.charAt(i-1)=='C'){
                sum+=400; i-=2; continue;
            }
            else if(i!=0 && s.charAt(i)=='M' && s.charAt(i-1)=='C'){
                sum+=900; i-=2; continue;
            }
            else if(s.charAt(i)=='I')
                sum+=1;
            else if(s.charAt(i)=='V')
                sum+=5;
            else if(s.charAt(i)=='X')
                sum+=10;
            else if(s.charAt(i)=='L')
                sum+=50;
            else if(s.charAt(i)=='C')
                sum+=100;
            else if(s.charAt(i)=='D')
                sum+=500;
            else if(s.charAt(i)=='M')
                sum+=1000;
            --i;
        }
        
        return sum;
    }
}
