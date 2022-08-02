package RoughWork;

public class CheckPrimeRec {

    static boolean checkPrimeRec(int n){
        if(n<=1) return false;
            for(int i=2; i< Math.sqrt(n); i++){
                if(n%i == 0) return false;
            }
            return true;
    }

    public static void main(String[] args) {

        int n = 59;

        if(checkPrimeRec(n)){
            System.out.println("Yes! It's Prime");
        }else{
            System.out.println("Not a Prime");
        }
    }
}
