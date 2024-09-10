public class SearchRotatedArray {

    static int search(int arr[], int n, int x) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[low] <= arr[mid]) { // Left half is sorted
                if (x >= arr[low] && x < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else { // Right half is sorted
                if (x > arr[mid] && x <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 40, 60, 5, 8};
        int n = arr.length;
        int x = 5;

        int res = search(arr, n, x);

        System.out.println("Element found at index: " + res);
    }
}





















    
}
