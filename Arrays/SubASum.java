public class SubASum {

    boolean isSubSum(int arr[], int n, int sum) {
        for (int i = 0; i < arr.length; i++) {
            int curr = 0;
            for (int j = i; j < arr.length; j++) {
                curr += arr[j];
                if (curr == sum) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 20, 3, 10, 5};
        int n = arr.length;
        int sum = 33; // Example target sum
        SubASum obj = new SubASum();
        boolean result = obj.isSubSum(arr, n, sum);
        System.out.println("Subarray with the given sum exists: " + result);
    }
}

