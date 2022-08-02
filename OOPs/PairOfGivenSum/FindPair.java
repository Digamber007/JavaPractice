package OOPs.PairOfGivenSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


class FindPair {
    
    
    public static void main(String[] args) {
        
        int[] arr = { 8, 7, 2, 5, 3, 1};

      //  int n = arr.length;

        int sum = 10;
        int k = 9;

        findPair(arr, sum);  // Brute-Force
        System.out.println();
        findPairSort(arr, k);  // Sort()
        System.out.println();
        findPairHash(arr, sum); // HashMap
        
    }

    // Brute-Force Approach

    public static void findPair(int[] arr, int sum) {
        
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j] == sum){
                    System.out.println("Pair found (" + arr[i] + "," + arr[j] + ")" );
                    return;
                }
            }
        }
        System.out.println("Pair not found");

    }


    // Sorting Approach

    public static void findPairSort(int[] arr, int k) {
        
        int n = arr.length;
        Arrays.sort(arr);

        int low = 0;
        int high = n-1;

        while(low < high){
            if(arr[low] + arr[high] == k){
                System.out.println("Pair found (" + arr[low] + "," + arr[high] + ")" );
                return;

            }
            if(arr[low]+arr[high] < k){
                low++;
            }else {
                high--;
            }
        }
        System.out.println("Pair not found");
 
    }

    // Hashing Approach

    public static void findPairHash(int[] arr, int sum) {

        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n-1; i++){
            if(map.containsKey(sum - arr[i])){
            System.out.printf("Pair found (%d, %d)",
                    arr[map.get(sum - arr[i])], arr[i]);

            return;
            }

            map.put(arr[i], i);
        }

        System.out.print("Pair not found");
        
    }

    
}
