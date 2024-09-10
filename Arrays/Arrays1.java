public class Arrays1 {

    public static int search(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {20, 5, 7, 25};
        int x = 23;
        int n = arr.length;  // Get the length of the array
        System.out.println("Element At: " + search(arr, n, x));
        
    }
}
