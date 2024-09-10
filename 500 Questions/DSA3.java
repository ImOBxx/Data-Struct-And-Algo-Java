import java.util.HashSet;

public class DSA3 {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 6, 6, 8};
        int duplicate = 0;
        HashSet<Integer> seen = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (seen.contains(arr[i])) {
                arr[i] = 0; 
                /* 
                duplicate = arr[i];
                break;
                */
            } else {
                seen.add(arr[i]);
                
            }
        }

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("The Duplicate Element is: " + duplicate);
    }
}
