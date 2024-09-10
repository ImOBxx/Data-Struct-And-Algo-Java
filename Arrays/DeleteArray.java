public class DeleteArray {
    
    int delete(int arr[], int n, int x) {
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == x)
                break;
        }

        if (i == n) {
            return n;
        }

        for (int j = i; j < n - 1; j++) {
            arr[j] = arr[j + 1];
        }

        return (n - 1);
    }
    
    public static void main(String[] args) {
        int arr[] = {3, 8, 12, 5, 6};
        int x = 12;
        int n = arr.length;
        
        DeleteArray da = new DeleteArray();
        
        System.out.print("Original Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        n = da.delete(arr, n, x);
        
        System.out.print("\nArray After Deletion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
