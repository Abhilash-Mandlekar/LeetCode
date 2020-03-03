class Solution {
    public String breakPalindrome(String palindrome) {
     int j = palindrome.length()-1; String str = "";
        int num = palindrome.length();
        if(num==1)
            return str;
        else if(num%2!=0){
        for(int i=0; i<Math.ceil(num/2); i++){
            if(palindrome.charAt(i)!='a'){
                palindrome = palindrome.substring(0, i) 
              + "a"
              + palindrome.substring(i + 1); 
                return palindrome;
            }
        }
            
            for(int i=num/2+1; i<=j; i++){
            if(palindrome.charAt(i)!='a'){
                palindrome = palindrome.substring(0, i) 
              + "a"
              + palindrome.substring(i + 1); 
                return palindrome;
            }
            if(i==j){
               palindrome = palindrome.substring(0, i) 
              + "b"
              + palindrome.substring(i + 1); 
                return palindrome;
            }
        }
    }
        else{
            for(int i=0; i<(num/2); i++){
            if(palindrome.charAt(i)!='a'){
                palindrome = palindrome.substring(0, i) 
              + "a"
              + palindrome.substring(i + 1); 
                
                return palindrome;
                }
            }
            
            for(int i=(num/2); i<=j; i++){
            if(palindrome.charAt(i)!='a'){
                palindrome = palindrome.substring(0, i) 
              + "a"
              + palindrome.substring(i + 1); 
                
            }
            if(i==j){
                palindrome = palindrome.substring(0, i) 
              + "b"
              + palindrome.substring(i + 1); 
                return palindrome;
            }
        }
        }
        return str;
    }
}
