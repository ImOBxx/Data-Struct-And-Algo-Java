/*
 Input:  { 4, 2, -3, -1, 0, 4 }   
 Subarrays with zero-sum are   
 { -3, -1, 0, 4 } { 0 }    
 Input:  { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }   
 Subarrays with zero-sum are   { 3, 4, -7 } 
 { 4, -7, 3 } 
 { -7, 3, 1, 3 } 
 { 3, 1, -4 } 
 { 3, 1, 3, 1, -4, -2, -2 } 
 { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
 */

public class PrintZeroSubA {

    public static void printAllSubArrays(int[] nums)
    {
        for (int i = 0; i < nums.length; i++)
        {
            int sum = 0;

            for (int j = 0; j < nums.length; j++)
            {
                sum += nums[j];

                if (sum == 0)
                {
                    System.out.println("SubArray:[" + nums[i] + "..." + nums[j] + "]");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};

        printAllSubArrays(nums);
    }
    
}


