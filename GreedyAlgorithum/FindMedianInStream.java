package GreedyAlgorithum;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedianInStream {
    static PriorityQueue<Integer> smaller = new PriorityQueue<>(Collections.reverseOrder()); //Max heap for lower values
    static PriorityQueue<Integer> larger = new PriorityQueue<>(); // Min heap for larger values

    public static double getMedian(int X)
    {
        if(smaller.size() == 0 || smaller.peek() >= X){
            smaller.add(X);
        }
        else{
            larger.add(X);
        }

        if(smaller.size() - larger.size() > 1){
            larger.add(smaller.remove());
        }
        else if(larger.size() - smaller.size() > 1){
            smaller.add(larger.remove());
        }

        if(smaller.size() > larger.size()){
            return Double.valueOf(smaller.peek());
        }

        else if(larger.size() > smaller.size()){
            return Double.valueOf(larger.peek());
        }

        return (Double.valueOf(smaller.peek()) + Double.valueOf(larger.peek())) / 2.0;
    }
}
