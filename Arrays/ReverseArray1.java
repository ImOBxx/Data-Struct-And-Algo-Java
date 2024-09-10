public class ReverseArray1 {
    
    void reverse(int arr[], int n) {
        int low = 0, high = n - 1;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        ReverseArray1 x = new ReverseArray1();
        x.reverse(arr, n);  // Call the reverse method to reverse the array
        System.out.print("Reversed Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
