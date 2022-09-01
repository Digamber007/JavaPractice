package GreedyAlgorithum;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumProductOfKIntegersOfArray {

    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] arr = new long[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            long ans = 1;
            for(int i = n - k; i < n; i++){
                ans *= arr[i];
            }
            System.out.println(ans);
        }
    }
}
