package C_09_Array;

public class IMP_DSA_Best_Time_To_Buy_And_Sell_Stock {
    public static int buyAndSellStocks(int prices[]){
        int buy_price = prices[0];

        // at the beginning the minimum  profit is zero
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {

            // if the current price is less update the buy_price
            if (prices[i] < buy_price) {
                buy_price = prices[i];
            }
            else {
                // else check if we can get a better profit
                int current_profit = prices[i] - buy_price;
                profit = Math.max(current_profit, profit);
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int []prices={7,1,2,5,6,3};
        System.out.println(buyAndSellStocks(prices));
    }
}
