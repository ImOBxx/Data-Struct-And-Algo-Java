
import java.util.Arrays;

public class ReverseArrayG {
    
    public static void reverseInG(int[] arr, int groupSize) {
        int n = arr.length;
        for (int i = 0; i < n; i += groupSize) {
            int left = i;
            int right = Math.min(i + groupSize - 1, n - 1);

            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        } 
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int groupSize = 3;

        reverseInG(arr, groupSize);

        System.out.println(Arrays.toString(arr));
    }
}
