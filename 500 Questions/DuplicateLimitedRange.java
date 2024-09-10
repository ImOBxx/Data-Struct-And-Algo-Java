/* 
   I : {1, 2, 3, 4, 4}
   O : Dup is 4

   I : {1, 2, 3, 4, 2}
   O : Dup is 2
 */


 class DuplicateLimitedRange {
    // Function to find a duplicate element in a limited range array
    public static int findDuplicate(int[] nums) {
        // Iterate through each element in the array
        for (int i: nums) {
            // Get the absolute value of the current element
            int val = Math.abs(i);
            
            // If the element at index `val` is negative, we have seen this value before
            if (nums[val] < 0) {
                return val; // Return the duplicate value
            }
            
            // Otherwise, negate the element at index `val` to mark it as seen
            nums[val] = -nums[val];
        }
        
        return -1; // Return -1 if no duplicate is found (this should never be reached)
    }
 
    public static void main (String[] args) {
        // Input array contains `n` numbers between 1 and `n-1`
        // with one duplicate, where `n` is the array's length
        int[] nums = { 1, 2, 3, 4, 2 };
        
        // Call the findDuplicate function and print the result
        System.out.println("The duplicate element is " + findDuplicate(nums));
    }
}
