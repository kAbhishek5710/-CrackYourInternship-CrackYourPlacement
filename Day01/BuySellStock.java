public class BuySellStock {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println("Maximum profit : " + maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int gain = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, gain);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }
}
