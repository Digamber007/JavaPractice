package Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KthPermutation {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int k = sc.nextInt();

            String result = KthPermutation.getKthPermotation(n, k);
            System.out.println(result);

    }

    private static String getKthPermotation(int n, int k) {

      //  StringBuilder result = new StringBuilder();
        List<Integer> list = new ArrayList<>();

        int fact = 1;
        for(int i=1; i<=n; i++){
            list.add(i);
            fact *= i;
        }
//        k = k-1;
//        for(int i=0; i<n; i++){
//            fact = fact / (n-i);
//            int ind = k/ fact;
//
//            result.append(list.get(ind));
//            list.remove(ind);
//
//            k = k - (ind * fact);

        String ans = "";
        if(k == fact){
            for (int i=n-1; i>=0; i--){
                ans += list.get(i)+"";
            }
            return ans;
        }
        while (list.size()>0){
            int unitPermo = fact/n;
            int ind = (k/unitPermo) - (k%unitPermo == 0 ? 1 : 0);

            ans += list.get(ind);
            list.remove(ind);

            k -= unitPermo*ind;
            fact /= n;
            n--;
        }
        for (int i=0; i<list.size(); i++){
            ans += list.get(i);
        }

        return ans;
    }
}
