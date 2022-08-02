package GreedyAlgorithums;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class IncreasingArray {

    static boolean checkIncreasingarray(int[] arr){

        int n = arr.length;
//        boolean result = true;
//        for(int i=0; i<n-1; i++){
//            if(arrr[i] > arrr[i+1]){
//                result = false;
//                break;
//            }
//        }
//        return result;

        if (n == 1)
            return true;
        else
        {

            if (arr[0] < arr[1])
            {

                int i = 1;

                while (i < n && arr[i - 1] < arr[i])
                {
                    i++;
                }

                while (i + 1 < n && arr[i] > arr[i + 1])
                {
                    i++;
                }
                if (i >= n - 1)
                    return true;
                else
                    return false;
            }
            else if (arr[0] > arr[1])
            {
                int i = 1;
                while (i < n && arr[i - 1] > arr[i])
                {
                    i++;
                }
                while (i + 1 < n && arr[i] < arr[i + 1])
                {
                    i++;
                }
                if (i >= n - 1)
                    return true;
                else
                    return false;
            }

            // Condition if arr[0] == arr[1]
            else
            {
                for (int i = 2; i < n; i++)
                {
                    if (arr[i - 1] <= arr[i])
                        return false;
                }
                return true;
            }
        }
    }


    // Driver code
    public static void main(String[] args){

        int[] arr = { 1, 3, 8, 4 };
        int n = arr.length;

        boolean result = checkIncreasingarray(arr);
        if(!result)
            System.out.print("Yes");
        else
            System.out.print("No");

    }
}
