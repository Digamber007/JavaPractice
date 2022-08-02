package RoughWork;

import java.util.HashMap;

public class FabonaccicRecursion {

    public static void main(String[] args) {

        int num = 8;

        for(int i=0; i< num; i++){
            System.out.print(fabRecursion(i)+ " ");
        }
        System.out.println();
        int n = 8;
        System.out.println("Using hashmap ->" + fabRecHashmap(n));

    }

    static  int fabRecursion(int count){
        if(count == 0) return 0;

        if(count == 1 || count == 2) return  1;

            return fabRecursion(count-1) + fabRecursion(count -2);
    }

    // Using Hashmap

    static int fabRecHashmap(int n){
        HashMap<Integer, Integer> map = new HashMap<>();

        if(n==0) return 0;

        if(n==1 || n==2) return 1;

        if(map.containsKey(n))
            return map.get(n);

        int ans = fabRecHashmap(n-1)+fabRecHashmap(n-2);
            map.put(n, ans);

            return ans;
    }
}
