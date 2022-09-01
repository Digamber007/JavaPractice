package Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PossibleWordsFromPhoneDigits {

    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0){
            String s="";
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
                s+=""+arr[i];
            }
            List<String> l=new ArrayList<>();
            l=letterCombinations(s);
            for(int i=0;i<l.size();i++){
                System.out.print(l.get(i)+" ");
            }
            System.out.println();
            T--;
        }
    }
    public static final Map<Character, List<Character>> digitMap = Map.of(
            '0', List.of(),
            '1', List.of(),
            '2', List.of('a', 'b', 'c'),
            '3', List.of('d', 'e', 'f'),
            '4', List.of('g', 'h', 'i'),
            '5', List.of('j', 'k', 'l'),
            '6', List.of('m', 'n', 'o'),
            '7', List.of('p', 'q', 'r', 's'),
            '8', List.of('t', 'u', 'v'),
            '9', List.of('w', 'x', 'y', 'z')
    );

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }

        letterCombinationsHelper(digits, result, new StringBuilder());
        return result;
    }

    public static void letterCombinationsHelper(String digits, List<String> result, StringBuilder sb) {
        int len = sb.length();
        if (len == digits.length()) {
            result.add(sb.toString());
            return;
        }

        for (char c : digitMap.get(digits.charAt(len))) {
            sb.append(c);
            letterCombinationsHelper(digits, result, sb);
            sb.setLength(len);
        }
    }
}
