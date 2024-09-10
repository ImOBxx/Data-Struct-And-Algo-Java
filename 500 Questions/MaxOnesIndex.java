public class MaxOnesIndex {
    // Function to find the index of zero to be replaced with one to get the longest sequence of ones
    public static int findIndexOfZero(int[] arr) {
        int maxCount = 0;  // Stores the maximum length of continuous ones
        int maxIndex = -1;  // Stores the index of zero to be replaced
        int prevZero = -1;  // Stores the index of the previous zero
        int prevPrevZero = -1;  // Stores the index of the zero before the previous zero

        // Traverse the input array
        for (int i = 0; i < arr.length; i++) {
            // If the current element is zero, update the previous and previous previous zero indices
            if (arr[i] == 0) {
                prevPrevZero = prevZero;
                prevZero = i;
            }

            // Update the maximum count and index if necessary
            if (i - prevPrevZero > maxCount) {
                maxCount = i - prevPrevZero;
                maxIndex = prevZero;
            }
        }

        return maxIndex;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 0, 1, 1, 1};
        System.out.println("Index of 0 to be replaced is: " + findIndexOfZero(arr));
    }
}

