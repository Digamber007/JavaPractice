package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PossibaleWords {

    static String[] combinations = new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static List<String> list;

    public static List<String> printCombos(String digits,int index,String comb){
        if(index == digits.length()){
            list.add(comb);
            return list;
        }
        char cur = digits.charAt(index);
        String map = combinations[cur-'0'];

        for(int i=0;i<map.length();i++){
            printCombos(digits,index+1,comb+map.charAt(i));
        }
        return list;

    }
    public static List<String> letterCombinations(String digits){
        list = new ArrayList<>();
        if(digits.length() == 0){
            return list;
        }
        return printCombos(digits,0,"");
    }

    public static void main(String[] args) {

    }
}

