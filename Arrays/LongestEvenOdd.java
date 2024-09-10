public class LongestEvenOdd {

    int maxEvenOdd(int arr[], int n) {
        int res = 0;
        int curr = 0;

        for (int i = 1; i < n; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) ||
                (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
                curr++;
                res = Math.max(res, curr);
            } else {
                curr = 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {5, 10, 20, 6, 3, 8};
        int n = arr.length;
        LongestEvenOdd obj = new LongestEvenOdd();
        int result = obj.maxEvenOdd(arr, n);
        System.out.println("Length of the longest even-odd subarray: " + result);
    }
}
