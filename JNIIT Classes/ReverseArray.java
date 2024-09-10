public class ReverseArray {
    
    public static void reverse(int[] arr, int n)
    {
        int start = 0;
        int end = n - 1;

        while (start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;

        System.out.println("Original Array: ");
        for (int i = 0; i < n; i++)
        {
            System.out.println(arr[i] + " ");
        }

        reverse(arr, n);

        System.out.println("Reversed Array: ");
        for (int i = 0; i < n; i++)
        {
            System.out.println(arr[i] + " ");
        }

    }
}
