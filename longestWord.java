package Strings;

public class longestWord {
    public static void main(String[] args) {
        
        String str="India is a beautiful country in the world";

        int ans=method2(str);
        System.out.println(ans);

    }

    public static int  method1(String str) {
            
            String[]arr=str.split(" ");

            int max=0;
            for(int i=0;i<arr.length;i++){
                String temp=arr[i];

                int tempLength=temp.length();
                max=Math.max(max, tempLength);
            }

            return max;


        


        
    }


    public static int  method2(String str) {
        int max=0;
        int tempcount=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch!=' '){
                tempcount++;
            }else{
                max=Math.max(max, tempcount);
                tempcount=0;
            }
        }
        max=Math.max(max, tempcount);
        return max;
        
    }
     
    
}
