package JumpProblems;

class FrogJump {
    
    // count the number of Jumps
    static int minJumps(int arr[], int n){

        int[] jumps = new int[n];
        int min;
 
        jumps[n - 1] = 0;
 
        for (int i = n - 2; i >= 0; i--) {
           
            if (arr[i] == 0)
                jumps[i] = Integer.MAX_VALUE;
 
            else if (arr[i] >= n - i - 1)
                jumps[i] = 1;
 
            else {
                // initialize min value
                min = Integer.MAX_VALUE;

                for (int j = i + 1;
                     j < n && j <= arr[i] + i; j++) {
                    if (min > jumps[j])
                        min = jumps[j];
                }
 
                if (min != Integer.MAX_VALUE)
                    jumps[i] = min + 1;
                else
                    jumps[i] = min; // or Integer.MAX_VALUE
            }
        }
 
        return jumps[0];
    }

    public static void main(String[] args) {

       // int[] arr = {3, 2, 1, 0, 10};
        int[] arr = {1, 3, 2, 2, 0, 9};
        int n = arr.length;

            System.out.println("min jump of frog : " + minJumps(arr, n));
        
    }
}
