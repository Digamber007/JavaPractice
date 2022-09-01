package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MaxElementInWindowOfSizeK {

//    static void printMax(int[] arr, int k){
//
//        for(int i=0; i< arr.length; i++){
//            int max = arr[i];
//
//            for(int j=1; j<k; j++){
//
//                if(arr[i+j] > max){
//                    max = arr[i+j];
//                }
//            }
//            System.out.print(max + " ");
//        }
//    }


    public static ArrayList<Integer> maxElement(int[] arr, int k){

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        ArrayList<Integer> res = new ArrayList<>();

        int i=0;
        for(; i<k; i++){
            queue.add(arr[i]);

            res.add(queue.peek());

            queue.remove(arr[0]);

        }
        for(; i<arr.length; i++){

            queue.add(arr[i]);

            res.add(queue.peek());
            queue.remove(arr[i-k+1]);
        }

        return res;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int k = 3;

//        printMax(arr, k);

        List<Integer> res = maxElement(arr, k);
            for(int x : res){
                System.out.print(x+ " ");
            }
    }
}
