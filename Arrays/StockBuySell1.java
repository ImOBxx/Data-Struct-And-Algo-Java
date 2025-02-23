public class StockBuySell1 {

    int maxProfit(int price[], int start, int end) {
        if (end <= start)
            return 0;
        
        int profit = 0;
        
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (price[j] > price[i]) {
                    int curr = price[j] - price[i] + maxProfit(price, start, i - 1) + maxProfit(price, j + 1, end);
                    profit = Math.max(profit, curr);
                }
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 8, 12};
        int n = arr.length;

        StockBuySell1 stock = new StockBuySell1();
        int result = stock.maxProfit(arr, 0, n - 1);
        System.out.println("Maximum profit is " + result);
    }
}

