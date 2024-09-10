public class RecursiveBinarySearch {

    static int firstOcc(int arr[], int n, int x)
    {
        int low = 0, high = n - 1;
        while (low <= high)
        {
            int mid = (low + high) / 2;

            if (arr[mid] > x)
            {
                high = mid - 1;
            }
            else if (arr[mid] < x)
            {
                low = mid + 1;
            }
            else{
                if (mid == 0 || arr[mid - 1] != arr[mid])
                {
                    return mid;
                }
                else{
                    high = mid  - 1;
                }
            }
        }
        return - 1;
    }
    
    public static void main(String[] args) {
        int arr[] = {5, 10, 10, 20, 20};
        int n = arr.length;
        int x = 10; // The value to search for

        int result = firstOcc(arr, n, x);

        System.out.println("Index Of First Occurrence: " + result);
    }
}
