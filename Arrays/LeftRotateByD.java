public class LeftRotateByD {

    static void leftrotate(int arr[], int n, int d) {
        int temp[] = new int[d];  // Declare the temporary array properly
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int d = 2;  // Number of positions to rotate
        LeftRotateByD x = new LeftRotateByD();

        System.out.println("Before Rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Rotate the array elements to the left by d positions
        x.leftrotate(arr, n, d);

        System.out.println("After Rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
