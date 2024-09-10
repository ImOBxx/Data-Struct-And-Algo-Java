public class FindMaxMin {
    
    public static int findmax(int arr[], int n) {
        int fmax = Integer.MIN_VALUE; // Initialize to the smallest possible integer value
        for (int i = 0; i < n; i++) {
            if (arr[i] > fmax) {
                fmax = arr[i];
            }
        }
        return fmax;
    }

    public static int findmin(int arr[], int n) {
        int fmin = Integer.MAX_VALUE; // Initialize to the largest possible integer value
        for (int i = 0; i < n; i++) {
            if (arr[i] < fmin) {
                fmin = arr[i];
            }
        }
        return fmin;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;

        System.out.println("Max Element: " + findmax(arr, n));
        System.out.println("Min Element: " + findmin(arr, n));
    }
}
