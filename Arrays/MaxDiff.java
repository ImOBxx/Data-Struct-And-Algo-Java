public class MaxDiff {

    int maxDiff(int arr[], int n) {
        int res = arr[1] - arr[0], minVal = arr[0];
        for (int j = 1; j < n; j++) {
            res = Math.max(res, arr[j] - minVal);
            minVal = Math.min(minVal, arr[j]);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 10, 6, 4, 8, 1};
        int n = arr.length;
        MaxDiff maxDiff = new MaxDiff();
        int result = maxDiff.maxDiff(arr, n);
        System.out.println("Maximum difference is " + result);
    }
}
