import java.util.TreeSet;

public class CeilingArray {
    
    public static void main(String[] args) {
        
        int[] arr = {2, 8, 30, 15, 25, 12};  // Corrected array initialization
        int n = arr.length;

        printCeil(arr, n);
    }

    public static void printCeil(int[] arr, int n) {
        System.out.print("-1 ");  // Print initial -1 without a newline
        TreeSet<Integer> s = new TreeSet<>();
        s.add(arr[0]);
        for (int i = 1; i < n; i++) {
            Integer ceil = s.ceiling(arr[i]);
            if (ceil != null) {
                System.out.print(ceil + " ");
            } else {
                System.out.print("-1 ");
            }
            s.add(arr[i]);
        }
        System.out.println();  // Move to the next line after the loop completes
    }
}
