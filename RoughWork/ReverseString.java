package RoughWork;

public class ReverseString {

    static void reverseString(String str){
        int n = str.length();

        if(n==0 || n<=1) {
            System.out.print(str);
        }else {
            System.out.print(str.charAt(n-1));
            reverseString(str.substring(0,n-1));
        }
    }



    public static void main(String[] args) {

        String str = "RACE TRACK";
        reverseString(str);
    }
}
