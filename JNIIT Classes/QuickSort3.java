import java.util.Scanner;

public class QuickSort3 {
    private int[] arr = new int[10];
    private int cmp_count; // number of comparisons
    private int mov_count; // number of data movements
    private int n;

    public QuickSort3() {
        cmp_count = 0;
        mov_count = 0;
    }

    public void read() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number of elements in the array:");
            n = Integer.parseInt(scanner.nextLine());
            if (n > 0 && n <= 10) {
                break;
            } else if (n > 10) {
                System.out.println("Array can have maximum 10 elements.");
            } else if (n < 0) {
                System.out.println("Enter a positive number.");
            }
        }
        // user input for the array
        System.out.println("-------------------------");
        System.out.println("--Enter-Array-Elements---");
        System.out.println("-------------------------");
        for (int i = 0; i < n; i++) {
            System.out.print("<" + (i + 1) + "> ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
    }

    private void swap(int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public void quickSort(int low, int high) {
        if (low > high) {
            return;
        }
        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while ((arr[i] <= pivot) && (i <= high)) {
                i++;
                cmp_count++;
            }
            cmp_count++;
            while ((arr[j] > pivot) && (j >= low)) {
                j--;
                cmp_count++;
            }
            cmp_count++;

            if (i < j) {
                swap(i, j);
                mov_count++;
            }
        }

        if (low < j) {
            swap(low, j);
            mov_count++;
        }
        quickSort(low, j - 1);
        quickSort(j + 1, high);
    }

    public static void main(String[] args) {
        QuickSort3 qs = new QuickSort3();
        qs.read();
        qs.quickSort(0, qs.n - 1);

        System.out.println("-------------------------");
        System.out.println("Sorted array:");
        for (int i = 0; i < qs.n; i++) {
            System.out.print(qs.arr[i] + " ");
        }
        System.out.println();
        System.out.println("Number of comparisons: " + qs.cmp_count);
        System.out.println("Number of data movements: " + qs.mov_count);
    }
}
