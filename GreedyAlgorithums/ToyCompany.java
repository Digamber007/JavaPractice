package GreedyAlgorithums;

import java.util.Arrays;
import java.util.Scanner;

public class ToyCompany {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        int[] toysWeight = new int[n];
        int i;
//        for(i = 0; i < n; i++){
//            toysWeight[i] = scanner.nextInt();
//        }

        int n = 9;
        int[] toysWeight = {1, 2, 3, 4, 5, 10, 11, 12, 13};
        Arrays.sort(toysWeight);
        int units = 0;
        int weight;
        for(i = 0; i < n; i++){
            units++;
            weight = toysWeight[i] + 4;
            i++;
            while(i < n){
                if(toysWeight[i] <= weight){
                    i++;
                } else {
                    i--;
                    break;
                }
            }
        }
        System.out.println(units);
        //scanner.close();
    }
}
