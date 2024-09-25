class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0; // Initialize profit to 0, as we start with no transactions
        int buy = prices[0]; // Initialize buy to the first price in the array

        // Iterate through each price in the prices array
        for (int price : prices) {
            // Check if the current price is greater than the buy price
            if (price > buy) {
                // If it is, calculate the profit by selling at the current price
                // Update profit to the maximum of current profit or the new profit calculated
                profit = Math.max(profit, price - buy);
            } else {
                // If the current price is less than or equal to the buy price,
                // Update the buy price to the current price
                buy = price;
            }
        }

        // Return the maximum profit calculated
        return profit;
    }
}
