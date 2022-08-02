package RoughWork;

public class FactorialRecursion {

    static  int factRecursion(int num){

        if(num != 0)
            return num * factRecursion(num-1);

        return 1;
    }

    public static void main(String[] args) {

        int num = 4;
        System.out.println(factRecursion(num));
    }
}
