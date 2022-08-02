package GreedyAlgorithums;

import java.util.Scanner;
import java.util.Vector;

public class MIniNumberOfCoins {

    static int[] arr = {1, 2, 5, 10, 20, 50, 100, 200, 500 , 2000};
    static int n = arr.length;

    static void minCoin(int A){

        Vector<Integer> ans = new Vector<>();
        for (int i = n - 1; i >= 0; i--){
            while (A >= arr[i]){
                A -= arr[i];
                ans.add(arr[i]);
            }
        }
        System.out.println(ans.size());
    }
    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();

        while(testcase-- >0){
            int A = sc.nextInt();
            minCoin(A);
        }
    }
}
