import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
        public static void findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found");
        } else {
            System.out.println("Duplicates: " + duplicates);
        }
    }

public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 5, 5, 6, 2};
    findDuplicates(arr);
    }
}
