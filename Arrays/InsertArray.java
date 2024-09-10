public class InsertArray {

    static int insert(int arr[], int n, int x, int cap, int pos) {
        if (n == cap) {
            return n;
        }

        int idx = pos - 1;
        for (int i = n - 1; i >= idx; i--) {
            arr[i + 1] = arr[i];
        }
        arr[idx] = x;
        return (n + 1);
    }

    public static void main(String[] args) {
        int arr[] = new int[10];  // Increased size to accommodate the new element
        arr[0] = 5;
        arr[1] = 7;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 20;
        int n = 5;  // Current number of elements
        int x = 8;
        int pos = 2;
        int cap = 10;  // Capacity of the array

        System.out.println("Before Insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        n = insert(arr, n, x, cap, pos);

        System.out.println("After Insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
