package Strings;

public class ConvertFirstLatterInUpper {
    public static void main(String[] args) {
        
        String str = "Hello in the world in java";

        String ans = Convert(str);
        
        System.out.println(ans);

    }

    public static String Convert(String str){

    String [] arr = str.split(" ");
        String ans = "";

        for(int i=0; i<arr.length; i++){
            String temp = arr[i];
            char ch = temp.charAt(0);

            if(ch>='a' && ch<='z'){
                ch = (char)(ch -'a' + 'A');
                String rem = temp.substring(1);
                rem = ch + rem;
                ans+=rem+" ";
            }else{
                ans+=temp+" ";
            }
        }

        return ans;
}
          
}

