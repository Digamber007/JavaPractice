package RoughWork;

public class StringPalindrome {

    static boolean isPalin(String str){

        int n = str.length();
        if(n ==0 || n == 1) return true;

        if(str.charAt(0) == str.charAt(n-1))
            return isPalin(str.substring(1, n-1));

        return false;

    }

    public static void main(String[] args) {
        String str = "racecar";

        if(isPalin(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
