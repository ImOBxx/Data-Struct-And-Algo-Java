public class MaxValue {

    public static int findMaxValue(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int max = arr[0]; // Assume the first element is the maximum initially
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if current element is greater
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 5, 5, 6, 2};
        System.out.println("The maximum value in the array is: " + findMaxValue(arr));
    }
}
