/*
    Max Length Given Sum

    nums[] = { 5, 6, -5, 5, 3, 5, 3, -2, 0 } 
    target = 8     
    
    Subarrays with sum 8 are   
    { -5, 5, 3, 5 } 
    { 3, 5 } 
    { 5, 3 }   
    The longest subarray is { -5, 5, 3, 5 } having length 4
 */


 public class MaxLengthSubAGivenSum {

    public static void findMaxLenSubArray(int[] nums, int S) {
        int maxLength = 0;
        int endIndex = -1;

        for (int start = 0; start < nums.length; start++)
        {
            int sum = 0;

            for (int end = start; end < nums.length; end++)
            {
                sum += nums[end];

                if (sum == S) {
                    int currentLength = end - start + 1;

                    if (currentLength > maxLength) {
                         maxLength = currentLength;
                         endIndex = end;
                    }
                }
            }
        }

        int startIndex = endIndex - maxLength + 1;
        System.out.println("[" + startIndex + ", " + endIndex + "]" );
        }

        public static void main(String[] args) {
            int[] nums = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
            int target = 8;
    
            findMaxLenSubArray(nums, target);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
