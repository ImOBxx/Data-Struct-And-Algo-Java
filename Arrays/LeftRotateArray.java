public class LeftRotateArray {

    // Method to left rotate the array by one position
    void lRotateOne(int arr[], int n) {
        int temp = arr[0]; // Store the first element in a temporary variable
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i]; // Shift elements to the left
        }
        arr[n - 1] = temp; // Place the first element at the end
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5}; // Initialize the array
        int n = arr.length; // Get the length of the array

        LeftRotateArray x = new LeftRotateArray();

        x.lRotateOne(arr, n); // Call the method to rotate the array

        // Print the rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }    
}
