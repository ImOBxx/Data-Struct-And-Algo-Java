public class Test90 {

    public static void main(String[] args) {
        int arr[] = {1, 8, 30, -5, 20, 7};
        int k = 4;
        int n = arr.length;

        // Calculate the initial sum of the first 'k' elements
        int curr = 0;
        for (int i = 0; i < k; i++) {
            curr += arr[i];
        }

        // Initialize the result with the current sum
        int res = curr;

        // Use the sliding window technique to find the maximum sum
        for (int i = k; i < n; i++) {
            curr = curr + arr[i] - arr[i - k];
            System.out.println(res);
            System.out.println(curr);
            res = Math.max(res, curr);
            System.out.println(res);
            System.out.println(curr);
            //System.out.println(curr);
        }

        // Print the result
        System.out.println("Sliding Window: " + res);
    }
}
