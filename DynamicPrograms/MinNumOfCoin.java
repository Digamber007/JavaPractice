package DynamicPrograms;

public class MinNumOfCoin {
    static int minCoins(int coins[], int len, int V){
        
        int[] dp = new int[V + 1];

        dp[0] = 0;
        for (int i = 1; i <= V; i++)
            dp[i] = Integer.MAX_VALUE;

        for (int i = 1; i <= V; i++){
            for (int j = 0; j < len; j++)
                if (coins[j] <= i){
                    int sub_res = dp[i - coins[j]];
                    if (sub_res != Integer.MAX_VALUE
                            && sub_res + 1 < dp[i])
                        dp[i] = sub_res + 1;


                }

        }

        if(dp[V]==Integer.MAX_VALUE)
            return -1;

        return dp[V];

    }

    // Driver program
    public static void main (String[] args)
    {
        int coins[] = {2, 5, 3, 6};
        int len = coins.length;
        int V = 10;
        System.out.println ( "Minimum coins required is "+ minCoins(coins, len, V));
    }
}

