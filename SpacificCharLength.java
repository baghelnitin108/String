package Strings;

public class SpacificCharLength {
    public static void main(String[] args) {
        
        String str = "Hello in the world";

        int ans = specific(str);

        System.out.println(ans);

    }

    public static int specific(String str){

        char k = 'd';
        int ans = 0;
        for(int i=0; i<str.length(); i++){

            char ch=str.charAt(i);

            if(k==ch){

                ans = i;
            }
        }
        return ans;
    }

}
