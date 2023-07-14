package Strings;

import java.util.*;
public class FrequencySecondmax {
    public static void main(String[] args) {
        
        String str = "hello ghiiIIIiii lLLLAhfjllllll qwertyuiopasdfghjklzxcvbnm";

        char ans=Frequency(str);

        System.out.println(ans);
    }

    public static char Frequency(String str){

        int [] fre = new int [26];

        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);

            if(ch>='a' && ch<='z'){
                int idx=(int)(ch-'a');
                fre[idx]=fre[idx]+1;
            }else if(ch>='A' && ch<='Z'){
                int idx = (int)(ch-'A');
                fre[idx]=fre[idx]+1;
            }
        }

        int maxidx = 0;
        int smaxidx = 0;

        for(int i=0; i<fre.length; i++){

            if(fre[i]>fre[maxidx]){

                smaxidx=maxidx;
                maxidx=i;
            }else if(fre[i]>fre[smaxidx]){
                smaxidx=i;
            }
        }

        char ans = (char)(smaxidx+'a');
        return ans;
    }
}
