public class StockBuySell2 {

    int maxProfit2(int price[], int n) {
        int profit = 0;
        for (int i = 1; i < n; i++) {
            if (price[i] > price[i - 1]) {
                profit += (price[i] - price[i - 1]);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 8, 12};
        int n = arr.length;

        StockBuySell2 stock = new StockBuySell2();
        int result = stock.maxProfit2(arr, n);
        System.out.println("Maximum profit is " + result);
    }
}

