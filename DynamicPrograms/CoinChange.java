package DynamicPrograms;

public class CoinChange {
    private int getNumberOfWays(int coin[], int amount) {
        int numberOfWaysTable[] = new int[amount + 1];

        numberOfWaysTable[0] = 1;

        for(int i = 0; i < coin.length; i++) {
            for(int j = coin[i]; j <= amount; j++) {
                numberOfWaysTable[j] = numberOfWaysTable[j] + numberOfWaysTable[j - coin[i]];
            }
        }

        return numberOfWaysTable[amount];
    }

    public static void main(String[] args) {
        int coin[] = {2, 5, 3, 6};
        int amount = 10;

        CoinChange coinChange = new CoinChange();

        int numberOfWays = coinChange.getNumberOfWays(coin, amount);

        System.out.println("Number of Ways: " + numberOfWays);
    }
}
