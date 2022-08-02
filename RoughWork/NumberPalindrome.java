package RoughWork;

public class NumberPalindrome {

    static int ispalin(int n, int temp){
        ;
        if(n == 0)
            return temp;
        temp = (temp*10) + (n%10);

        return ispalin(n/10, temp);
    }

    public static void main(String[] args) {
        int n = 12321;
        int result = ispalin(n,0);

        if(result == n) System.out.println("Yes");
            else System.out.println("No");
    }
}
