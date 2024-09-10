public class CountSorted {
    
    int countOcc(int arr[], int n, int x) {
        int first = firstOcc(arr, 0, n - 1, x);

        if (first == -1) {
            return 0;
        } else {
            return (lastOcc(arr, 0, n - 1, x) - first + 1);
        }
    }

    int firstOcc(int arr[], int low, int high, int x) {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            if ((mid == 0 || x > arr[mid - 1]) && arr[mid] == x)
                return mid;
            else if (x > arr[mid])
                return firstOcc(arr, (mid + 1), high, x);
            else
                return firstOcc(arr, low, (mid - 1), x);
        }
        return -1;
    }

    int lastOcc(int arr[], int low, int high, int x) {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            if ((mid == high || x < arr[mid + 1]) && arr[mid] == x)
                return mid;
            else if (x < arr[mid])
                return lastOcc(arr, low, (mid - 1), x);
            else
                return lastOcc(arr, (mid + 1), high, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 20, 40, 40};
        int n = arr.length;
        int x = 20;

        CountSorted cs = new CountSorted();
        int count = cs.countOcc(arr, n, x);

        System.out.println("Count of " + x + " in array is: " + count);
    }
}
