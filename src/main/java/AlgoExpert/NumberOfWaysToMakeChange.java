package AlgoExpert;

public class NumberOfWaysToMakeChange {
    public static int numWays(int n, int[] denoms) {

        if (n <= 0 || denoms == null || denoms.length == 0) return 1;

        int[] cache = new int[n + 1];
        cache[0] = 1;

        for (int d: denoms) {
            for (int amount = 1; amount <= n; amount++) {
                if (d > amount) continue;
                int remainingAmount = amount - d;
                cache[amount] += cache[remainingAmount];
            }
        }

        return cache[n];
    }
}
