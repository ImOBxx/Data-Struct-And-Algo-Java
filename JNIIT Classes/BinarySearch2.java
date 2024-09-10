

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2 {

    public static void main(String[] args) {
        int[] arr = new int[20]; // Array to be searched
        int n;
        int i;
        Scanner scanner = new Scanner(System.in);

        // Get the number of elements to store in the array
        while (true) {
            System.out.println("Enter the Number of Elements in the array:");
            n = scanner.nextInt();
            if ((n > 1) && (n <= 20)) {
                break;
            } else {
                System.out.println("\nArray should have minimum 1 and maximum 20 elements.\n");
            }
        }

        // Accept Array Elements
        for (i = 0; i < n; i++) {
            System.out.print("\n" + (i + 1) + "> ");
            arr[i] = scanner.nextInt();
        }

        // Sort the array to ensure binary search can be performed
        Arrays.sort(arr, 0, n);

        char choice;
        do {
            System.out.println("Enter the element you want to search:");
            int item = scanner.nextInt();

            // Apply binary search
            int lowerbound = 0;
            int upperbound = n - 1;
            int mid;
            int ctr = 0;

            boolean found = false;
            while (lowerbound <= upperbound) {
                mid = (lowerbound + upperbound) / 2;
                ctr++;
                if (arr[mid] == item) {
                    System.out.println(item + " found at position " + (mid + 1));
                    found = true;
                    break;
                } else if (arr[mid] < item) {
                    lowerbound = mid + 1;
                } else {
                    upperbound = mid - 1;
                }
            }

            if (!found) {
                System.out.println(item + " not found in the array");
            }
            System.out.println("Number of Comparisons: " + ctr);

            System.out.println("Continue Searching? y/n");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');
    }
}
