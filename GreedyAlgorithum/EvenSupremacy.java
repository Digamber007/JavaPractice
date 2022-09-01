package GreedyAlgorithum;

import java.util.Scanner;

public class EvenSupremacy {

    static int val;
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum = sc.nextInt();
        int actualSummation = (n/2)*((2+n)/2);
        sum = sum - actualSummation;
        System.out.println(sum/(k-1));
    }
}
