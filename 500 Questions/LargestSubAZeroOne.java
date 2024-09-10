/*
    I : {0, 0, 1, 0, 1, 0, 0}

    O : Largest SubArray: {0, 1, 0, 1}
    or {1, 0, 1, 0}
 */

 class LargestSubAZeroOne{
    public static void findLargestSubarray(int[] nums) {
        int n = nums.length;
        int[] sumArray = new int[2 * n + 1]; // Array to store the first occurrence of each sum
        int sum = 0;
        int maxLength = 0;
        int startIndex = -1;

        // Initialize sumArray with -1 to indicate that a sum hasn't been seen yet
        for (int i = 0; i < sumArray.length; i++) {
            sumArray[i] = -1;
        }

        // Traverse through the given array
        for (int i = 0; i < n; i++) {
            sum += (nums[i] == 0) ? -1 : 1;

            // To handle subarrays starting from index 0
            if (sum == 0) {
                maxLength = i + 1;
                startIndex = 0;
            }

            // If this sum has been seen before, calculate the length of the subarray
            if (sumArray[sum + n] != -1) {
                int length = i - sumArray[sum + n];
                if (length > maxLength) {
                    maxLength = length;
                    startIndex = sumArray[sum + n] + 1;
                }
            } else {
                // Mark the first occurrence of this sum
                sumArray[sum + n] = i;
            }
        }

        // Print the subarray if present
        if (maxLength > 0) {
            System.out.println("[" + startIndex + ", " + (startIndex + maxLength - 1) + "]");
        } else {
            System.out.println("No subarray exists");
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 0, 1, 0, 0};
        findLargestSubarray(nums);
    }
}
