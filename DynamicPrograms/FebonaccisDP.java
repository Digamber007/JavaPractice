package DynamicPrograms;

import java.util.Arrays;

public class FebonaccisDP {
    static final int max = 10000;
    static int[] fib = new int[max];

    static int febonaccisDp(int num){
        if(num == 0) return 0;
        if(num == 1) return 1;

        if(fib[num] != 0) {
            return fib[num];
        }
        fib[num] = febonaccisDp(num -1) + febonaccisDp(num -2);
        return febonaccisDp(num);
    }
    public static void main(String[] args) {

        int num = 8;

        System.out.println(febonaccisDp(num));
    }
}
