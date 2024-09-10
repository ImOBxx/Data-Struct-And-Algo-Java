import java.util.HashSet;
import java.util.Set;

public class ReplaceZero {

    public static void replaceDuplicatesWithZero(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (!seen.add(arr[i])) {
                arr[i] = 0; // Replace duplicate with zero
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 5, 5, 6, 2};
        System.out.println("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        replaceDuplicatesWithZero(arr);

        System.out.println("Array after replacing duplicates with zero: ");
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }
}


