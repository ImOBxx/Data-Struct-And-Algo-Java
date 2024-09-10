import java.util.Arrays;
import java.util.HashSet;

public class RemoveDupli {
    
    public static int[] removeDupli(int[] nums) {

        HashSet <Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        int i = 0;
        for(int num : set) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 2, 4, 5};
        int[] uniqueNums = removeDupli(nums);

        System.out.println("Original array: " + Arrays.toString(nums));
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueNums));
    
    }
 }
