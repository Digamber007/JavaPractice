package String;

import java.util.HashMap;

public class LongestUniqueSubstring {

    public static int uniqueSubstring(String str){

        HashMap<Character, Integer> map = new HashMap<>();
        int maxlength = 0;
        int start = 0;
        for(int i=0; i<str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                start = Math.max(start, map.get(str.charAt(i))+1);
            }
            map.put(str.charAt(i), i);
            maxlength = Math.max(maxlength, i-start+1);
        }
        return maxlength;
    }

    public static void main(String[] args) {

        String str = "geeksforgeeks";
        System.out.print(str);
        System.out.println();

        System.out.println(uniqueSubstring(str));
    }
}
