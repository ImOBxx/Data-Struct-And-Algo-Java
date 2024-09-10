public class PrefixSum {
    
    int[] arr;

    // Constructor to initialize the array
    public PrefixSum(int[] arr) {
        this.arr = arr;
    }

    // Method to get the sum of elements between indices l and r
    int getSum(int l, int r) {
        int res = 0;
        for (int i = l; i <= r; i++) {
            res += arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {2, 8, 3, 9, 6, 5, 4};
        PrefixSum prefixSum = new PrefixSum(arr);

        int l = 1; // example left index
        int r = 4; // example right index

        System.out.println("Sum of elements from index " + l + " to " + r + " is: " + prefixSum.getSum(l, r));
    }
}
