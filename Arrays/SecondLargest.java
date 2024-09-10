public class SecondLargest {
    
    int getlargest(int arr[], int n) {
        int res = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[res]) {
                res = i;
            }
        }
        return res;
    }

    int secondlargest(int arr[], int n) {
        int largest = getlargest(arr, n);
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[largest]) {
                if (res == 0 || arr[i] > arr[res]) {
                    res = i;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 6};  // Corrected array initialization
        SecondLargest obj = new SecondLargest();  // Create an instance of the class
        int n = arr.length;  // Get the length of the array
        System.out.println("Second Largest Element Index: " + obj.secondlargest(arr, n));  // Call secondlargest on the instance
    }
}
