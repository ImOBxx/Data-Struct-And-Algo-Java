
import java.util.HashSet;

public class CountDistinct {
    
    int countDistinct(int arr[]) {
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);
        }
        return s.size();
    }

    public static void main(String[] args) {
        CountDistinct cd = new CountDistinct();
        int arr[] = new int[] {15, 16, 27, 27, 28, 29};
        int n = arr.length;

        System.out.println(cd.countDistinct(arr));
    }
}
