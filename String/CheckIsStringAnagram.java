package String;


import java.util.Arrays;

public class CheckIsStringAnagram {

    public static void main(String[] args) {

        String str1 = "Race";
        String str2 = "Care";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()){
            char[] chArrays1 = str1.toCharArray();
            char[] chArrays2 = str2.toCharArray();

            Arrays.sort(chArrays1);
            Arrays.sort(chArrays2);

            boolean res = Arrays.equals(chArrays1, chArrays2);

            if(res){
                System.out.println(str1+" and "+str2 + " are Anagram.");
            }
            else{
                System.out.println("Not an Anagram.");
            }

        }else{
            System.out.println("Not an Anagram.");
        }
    }
}
