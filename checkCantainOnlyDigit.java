package Strings;

public class checkCantainOnlyDigit {
    public static void main(String[] args) {
        
        String str = "2756a5123a786";
        boolean flag = Digit(str);
        System.out.println(flag);

    }

    public static boolean Digit (String str){
     boolean flag = true;


    for(int i=0; i<str.length(); i++){
        char ch= str.charAt(i);

        if(ch<'0' || ch>'9'){
            flag = false;
            break;
        }
    }
    return flag;
}
}
