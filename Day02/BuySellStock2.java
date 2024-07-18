import java.util.ArrayList;
import java.util.Arrays;

public class BuySellStock2 {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println("Max Profit : " + maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        ArrayList<ArrayList<Integer>> dp = new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {
            dp.add(new ArrayList<>(Arrays.asList(-1, -1)));
        }
        return func(prices, 0, 1, dp);
    }

    public static int func(int[] prices, int idx, int canBuy, ArrayList<ArrayList<Integer>> dp) {
        if (idx == prices.length) {
            return 0;
        }
        if (dp.get(idx).get(canBuy) != -1)
            return dp.get(idx).get(canBuy);
        int profit = 0;
        if (canBuy == 1) {
            profit = Math.max(-prices[idx] + func(prices, idx + 1, 0, dp), func(prices, idx + 1, 1, dp));
        } else {
            profit = Math.max(prices[idx] + func(prices, idx + 1, 1, dp), func(prices, idx + 1, 0, dp));
        }
        dp.get(idx).set(canBuy, profit);
        return profit;
    }
}
