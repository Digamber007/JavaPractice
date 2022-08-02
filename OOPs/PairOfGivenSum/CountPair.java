package OOPs.PairOfGivenSum;

import java.util.Arrays;
import java.util.HashMap;

class CountPair{

    public static void main(String[] args) {
    
        int[] arr = {8, 7, 2, 5, 3, 1};
    
        int sum = 9;
    
        countPair(arr, sum); // Brute-Force approach
        System.out.println();
        getAllPairs(arr, sum);  // HashMap approach
        System.out.println();
        allPairs(arr, sum);  // two pointer approach

       // System.out.println(getPairsCount(arr, sum));
    }

    // Brute-Force approach
    public static void countPair(int[] arr, int sum) {

        int n = arr.length;

       // int count = 0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]== sum){
                  //  count++;
                  System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
        //System.out.println(count); 
        
    }

    // time complexity is O(n^2)


    
//public static int getPairsCount(int[] arr, int sum) {
    
public static void getAllPairs(int[] arr, int sum) {

    int n = arr.length;

    HashMap<Integer, Integer> map = new HashMap<>();

   // int count = 0;
        for(int i=0; i<n; i++){

            int res = sum - arr[i];

            if(map.containsKey(sum-arr[i])){
              // count += map.get(sum-arr[i]);

              int counter = map.get(res);

              for(int j=0; j<counter; j++)
                    System.out.println("(" + res + ", " + arr[i] + ")" );
            }

            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
       // return count;
}


// Two pointer method approach

public static void allPairs(int arr[], int sum){

    Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;
 
        while (low < high) {
            if (arr[low] + arr[high] == sum) {
                System.out.println("(" + arr[low] + ", " + arr[high] +")");
            }
            if (arr[low] + arr[high] > sum) {
                high--;
            }
            else {
                low++;
            }
        }
    }

    
}