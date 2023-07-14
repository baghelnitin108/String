package Strings;

public class toggleCase {
    public static void main(String[] args) {
        String str="NiTiN BaGhEl";

        String ans=toggleCase(str);
        System.out.println(ans);

    }

    public static String toggleCase(String str) {
        if(str.length()==0){
            return "";
        }else if(str.length()==1){
            return str;
        }

        String ans="";
        for(int i=0;i<str.length();i++){

        char ch=str.charAt(i);

        if(ch>='A' && ch<='Z'){
            ch=(char)(ch-'A'+'a');
        }
       else if(ch>='a' && ch<='z'){
            ch=(char)(ch-'a'+'A');
        }
        ans=ans+ch;
    }
        return ans;
    }
    
    
    
    
}
