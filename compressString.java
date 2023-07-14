package Strings;

public class compressString {
    public static void main(String[] args) {
        String str="aaaaabbbbbbcccccdefggggggg";
        String ans=compressString(str);
        System.out.println(ans);

    }

    public static String compressString(String str) {

        if(str.length()==0){
            return "";

        }else{
            String ans="";

           int count=1;
           for(int i=1;i<str.length();i++){
            char curr=str.charAt(i);
            char pre=str.charAt(i-1);

            if(curr==pre){
                count++;
            }else {
                if(count>1){
                    ans+=count;
                }

                ans+=pre;
                count=1;

            }
           }
           
                if(count>1){
                    ans+=count;
                }

                ans+=str.charAt(str.length()-1);
            

            
           return ans;
        }
        
    }
    
    
    }

