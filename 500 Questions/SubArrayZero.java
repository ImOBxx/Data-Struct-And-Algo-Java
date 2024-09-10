/* 
{ 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }  
Output: Subarray with zero-sum exists   
The subarrays with a sum of 0 are:   
{ 3, 4, -7 }
{ 4, -7, 3 }
{ -7, 3, 1, 3 } 
{ 3, 1, -4 } 
{ 3, 1, 3, 1, -4, -2, -2 } 
{ 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
*/

public class SubArrayZero {
     public static Boolean hasZerBoolean(int[] nums)
     {
        for (int i = 0; i < nums.length; i++)
        {
            int sum = 0;

            for (int j = i; j < nums.length; j++)
            {
                //System.out.println("i: " + i + ", j: " + j);
                //System.out.println("Sum: " + sum);
                sum += nums[j];
                //System.out.println("Num J: " + nums[j]);

                if (sum == 0)
                {
                  return false;
                }
            }

        }
        return true;
     }

     public static void main(String[] args)
     {
        int[] nums = {4, -6, 3, -1, 4, 2, 7};

        if (hasZerBoolean(nums))
        {
           System.out.println("SubArray Exits");
        }
        else
        {
           System.out.println("SubArray Does Not Exits");
        }
     }
}
