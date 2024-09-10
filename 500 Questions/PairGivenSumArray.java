/*
Input:   nums = [8, 7, 2, 5, 3, 1] 
target = 10  
Output:   Pair found (8, 2) or Pair found (7, 3)    

Input:   nums = [5, 2, 6, 8, 1, 9] 
target = 12  
Output: Pair not found
 */

 public class PairGivenSumArray {

    public static void findPair(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) { // i < nums.length - 1
            for (int j = i + 1; j < nums.length; j++) { // j = i + 1
                if (nums[i] + nums[j] == target) {
                    System.out.printf("Pair Found (%d, %d)\n", nums[i], nums[j]);
                    return;
                }
            }
        }
        System.out.println("Pair Not Found");
    }

    public static void main(String[] args) {
        int[] nums = {8, 7, 2, 5, 3, 1};
        int target = 11;

        findPair(nums, target);
    }
}
