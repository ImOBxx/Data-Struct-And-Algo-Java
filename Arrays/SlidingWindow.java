public class SlidingWindow {

    int maxSum(int arr[], int n, int k)
    {
         int curr = 0;
         for (int i = 0; i < k; i++)
         {
             curr += arr[i];
         }

         int res = curr;

         for (int i = k; i < n; i++)
         {
            curr = curr + arr[i] - arr[i - k];
            res = Math.max(res, curr);
         }
         return res;
    }
public static void main(String[] args) {
    int arr[] = {1, 8, 30, -5, 20, 7};
    int k = 4;
    SlidingWindow x = new SlidingWindow();

    System.out.println("Sliding Window: " + x.maxSum(arr, k, k));

    }
}
