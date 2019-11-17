
/*
Google intern
You are given a string that represents time in the format hh:mm. Some of the digits are blank (represented by ?). Fill in ? such that the time represented by this string is the maximum possible. Maximum time: 23:59, minimum time: 00:00. You can assume that input string is always valid.

Example 1:
Input: "?4:5?"
Output: "14:59"

Example 2:
Input: "23:5?"
Output: "23:59"

Example 3:
Input: "2?:22"
Output: "23:22"

Example 4:
Input: "0?:??"
Output: "09:59"

Example 5:
Input: "??:??"
Output: "23:59"
*/

public class Main {
    
    public static String maxTime(String time){
        String str[] = new String[2];
        str = time.split(":");
        List<String> st = new ArrayList<>();
        String s1 = null, s2=null;
        st = Arrays.asList(str);
        
        //Time Before " : "
        if(st.get(0).contains("?")){            
            if(st.get(0).charAt(0)=='?' && st.get(0).charAt(1)=='?'){
            s1 = st.get(0); s1 = s1.replace("??","23");
            }
            else if(st.get(0).charAt(0)=='?' && st.get(0).charAt(1)!='?'){
                if(Integer.parseInt(st.get(0).charAt(1)+"") > 3){ 
                    s1 = st.get(0); s1 = s1.replace('?','1');
                }
                else{   s1 = st.get(0); s1 = s1.replace("?","2"); }
            }
            else if(st.get(0).charAt(0)!='?' && st.get(0).charAt(1)=='?'){
                if(Integer.parseInt(st.get(0).charAt(0)+"") < 2){
                   s1 = st.get(0); s1 = s1.replace("?","9"); 
                }
                else{ s1 = st.get(0); s1 = s1.replace("?","3");}
            }
            else{;}
        }
        else{
             s1 = st.get(0);
        }
        
        //Time After ":"
        if(st.get(1).contains("?")){
            
            if(st.get(1).charAt(0)=='?' && st.get(1).charAt(1)=='?'){
                s2 = st.get(1); s2 = s2.replace("??","59");
            }
            else if(st.get(1).charAt(0)=='?' && st.get(1).charAt(1)!='?'){
                s2 = st.get(1); s2 = s2.replace("?", "5");
            }
            else if(st.get(1).charAt(0)!='?' && st.get(1).charAt(1)=='?'){
                s2 = st.get(1); s2 = s2.replace('?', '9');
            }
            else{ ;}
        }
        else{
            s2 = st.get(1);
        }
        return s1 + ":" + s2;
    }
    
    public static void main(String[] args) {
        System.out.println("Calculating Max Time!");
        String time = null;
        //inputs 
        time = Main.maxTime("?4:5?");
        System.out.println("Max Time: " + time);
        
        time = Main.maxTime("23:5?");
        System.out.println("Max Time: " + time);
        
        time = Main.maxTime("2?:22");
        System.out.println("Max Time: " + time);
        
        time = Main.maxTime("0?:??");
        System.out.println("Max Time: " + time);
        
        time = Main.maxTime("??:??");
        System.out.println("Max Time: " + time);
        
    }
}