package GreedyAlgorithum;

import java.util.Scanner;

public class GoodNumbers {

    private static int countDigits(long n){
        int count = 0;
        while( n > 0){
            n = n/10;
            count++;
        }
        return count;
    }
    private static int firstDigit(long n){
        int fDigit = 0;
        while( n > 0){
            fDigit = (int) n % 10;
            n = n/10;
        }
        return fDigit;
    }
    private static long formGoodNumber(int nDigits,int fDigit){
        long ans = 0;
        while( nDigits > 0){
            ans = ans*10 + fDigit;
            nDigits--;
        }
        return ans;
    }
    private static int checknextgoodNumber(long gnum, long n, int fDigit) {
        if(gnum <= n){
            return fDigit;
        }
        else{
            return fDigit - 1;
        }
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int nDigits = countDigits(n);
        int ans = (nDigits-1)*9;
        int fDigit = firstDigit(n);
        long goodNumber = formGoodNumber(nDigits,fDigit);
        int extraGoodNumbers = checknextgoodNumber(goodNumber,n,fDigit);
        System.out.println(ans+extraGoodNumbers);
    }
}
