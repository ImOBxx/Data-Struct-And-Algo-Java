import java.util.Scanner;

public class LinearSearch {
    private int[] arr = new int[10];
    private int n;

    public void read() {
        Scanner scanner = new Scanner(System.in);
        
        // Getting the number of elements in the array
        System.out.println("Enter The Number of Elements in The Array (maximum limit is 10):");
        n = scanner.nextInt();

        // Validate n
        if (n > 10) {
            System.out.println("The maximum limit is 10. Setting n to 10.");
            n = 10;
        }

        // User input for the array
        System.out.println("-------------------------");
        System.out.println("--Enter-Array-Elements---");
        System.out.println("-------------------------");

        for (int i = 0; i < n; i++) {
            System.out.print("<" + (i + 1) + "> ");
            arr[i] = scanner.nextInt();
        }
    }

    // Linear search method
    public void search(int search_num) {
        int match_count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == search_num) {
                match_count++;
            }
        }
        System.out.printf("%d - Number of matches found: %d\n", search_num, match_count);
    }

    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        linearSearch.read();
        Scanner scanner = new Scanner(System.in);
        
        // Getting the search number
        System.out.println("Enter the number to search:");
        int search_num = scanner.nextInt();
        
        linearSearch.search(search_num);
    }
}
