package Strings;

public class AllRemove {
    public static void main(String[] args) {
        
        String str = "Hhhheeeelllllloooooh";

        String ans = allremove(str);

        System.out.println(ans);

    }

    public static String allremove(String str){

        String ans = "";

        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);

            boolean flag = true;

            for(int j=0; j<ans.length(); j++){
                char ch2=ans.charAt(j);
                if(ch==ch2){
                    flag = false;
                    break;
                }
            }

            if(flag == true){
                ans +=ch;
            }
        }
        return ans;
    }
}

