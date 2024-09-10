/**
 * DSA1
 * Find a pair with the given sum in an array
 * Input: [8,7,2,5,3,1]
 * Target Sum=10
 * Output {8,2}
 * or
 * Output {7,3}
 */
public class DSA1 {
    public static void main(String[] args) {
    
        int [] nums = {8,2,5,8,9,1};
        int target_sum = 7;

        //consider each element except the last
        for (int i = 0; i < nums.length-1; i++) {
    
            //start from the i'th element until the last element
            for (int j = i+1; j < nums.length; j++) {
                System.out.println("NUM I: " + nums[i]);
                System.out.println("NUM J: " + nums[j]);

                if(nums[i]+nums[j]==target_sum){
                    System.out.printf("{%d, %d},",nums[i],nums[j]);
                    break;
                }
            }
    
            //System.out.println("Pair  Not Found");
        }
    }
}