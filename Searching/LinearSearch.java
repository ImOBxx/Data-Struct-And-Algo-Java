public class LinearSearch {
    
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 199;
        int ans = lsearch(nums, target);
        if (ans > 0)
        {
        System.out.println("Index Of Target Value: " + ans);
        }
        else{
        System.out.println("Index Of Target Value Not Found");
        }
    }

    static int lsearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        return -1; // Return -1 if the target is not found
    }
}

