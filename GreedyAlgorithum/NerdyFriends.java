package GreedyAlgorithum;

import java.util.Scanner;

public class NerdyFriends {

    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        long arr[] = new long[n];
        long maxvalue = 0;
        long sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLong();
            maxvalue = Math.max(maxvalue,arr[i]);
            sum += arr[i];
        }
        if(sum-maxvalue < maxvalue){
            System.out.println(sum + (maxvalue - (sum-maxvalue)));
        } else{
            System.out.println(sum);
        }
    }
}
