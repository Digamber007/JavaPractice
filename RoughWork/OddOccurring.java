package RoughWork;

import java.util.Arrays;
import java.util.Scanner;

public class OddOccurring {

    public static int oddOccurring(int[] arr, int n){
        int i;
        for(i=0; i<n; i++){
            int count =0;

            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }

            }
            if(count % 2 != 0){
                return arr[i];
            }
        }
        return -1;

    }

    public static void main(String[] args) {

       // Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }

        int[] arr = {5, 5, 3, 4, 4};
        int n = arr.length;

//        Arrays.sort(arr);
//        int left = 0, right = n - 1;
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//
//            if (mid % 2 == 0) {
//                if (arr[mid] == arr[mid + 1]) {
//                    left = mid + 2;
//                } else {
//                    right = mid;
//                }
//
//            } else {
//                if (mid % 2 == 0) {
//                    if (arr[mid] == arr[mid - 1]) {
//                        left = mid + 1;
//                    } else {
//                        left = mid -1;
//                    }
//
//                }
//            }
//            return;
//
//        }

//        System.out.println(oddOccurring(arr, n);
       int res =  oddOccurring(arr, n);
        System.out.println(res);
    }
}
