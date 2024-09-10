public class IndexOfLastOcc {
    
    static int locc(int arr[], int low, int high, int x, int n)
    {
        if (low > high) 
        {
            return -1;
        }
        
        int mid = (low + high) / 2;

        if (arr[mid] > x)
        {
            return locc(arr, low, mid - 1, x, n);
        }
        else if (arr[mid] < x){
            return locc(arr, mid + 1, high, x, n);
        }
        else
        {
            if (mid == n - 1 || arr[mid] != arr[mid + 1])
            {
                return mid;
            }
            else{
                return locc(arr, mid + 1, high, x, n);
            }
        }
     }

     public static void main(String[] args) {
        int arr[] = {5, 10, 10, 10, 10, 20, 20};
        int n = arr.length;
        int x = 10;
        int low = 0;
        int high = n - 1;
        int res;

        res = locc(arr, low, high, x, n);

        System.out.println("Last Occurrence Of The Index: " + res);
     }
}
