package String;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingChar {

    public static int LengthOfLongestSubstring(String str){
        HashSet<Character> set = new HashSet<>();

        int left = 0, right = 0, res = 0;

        while (right < str.length()){
            char ch = str.charAt(right);
            if(set.contains(ch)){
                res = Math.max(res, right-left);
                left = findNextLeft(set, str, left, ch);
            }
            else{
                set.add(ch);
            }
            right++;
        }
        res = Math.max(res, right-left);
        return res;
    }

    private static int findNextLeft(HashSet<Character> set, String str, int curr, char ch) {
        for(int i=curr; i<str.length(); i++){
            if(str.charAt(i) == ch) {
                return i+1;
            }
            else {
                set.remove(str.charAt(i));
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";

        System.out.println(LengthOfLongestSubstring(str));
    }
}
