package JavaRoughWork;

public class ReverseString {

//    public static String reverse(String str){
//
//
//        String word[] = str.split(str);
//        String reverseWord = "";
//        for(int i=0; i<word.length; i++){;
//            if(i == word.length-1){
//                reverseWord = word[i] + reverseWord;
//
//            }else{
//                reverseWord = " " + word[i] +reverseWord;
//            }
//        }
//        return reverseWord;
//    }

    public static void main(String[] args) {
        String str = "I Love India";
       // String str1 = "";
//        int n = str.length();
//        char ch;
//        for(int i=0; i<n; i++){
//            ch = str.charAt(i);
//            str1 = ch+str1;
//           // str1.reverse();
//        }
        String word[] = str.split("\\s");
        String reverseWord = "";
        for(int i=0; i<word.length; i++){
            if(i == word.length-1){
                reverseWord = word[i] +reverseWord;

            }else{
               reverseWord =  " " + word[i] +reverseWord;
            }
        }

        System.out.println(reverseWord);
    }
}
// India love i