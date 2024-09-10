
    import java.util.Arrays;
    public class RearrangeArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Original Array: " + Arrays.toString(arr));

        int n = arr.length;

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Create a new array to hold the result
        int[] temp = new int[n];

        // Pointers to the beginning and end of the sorted array
        int small = 0;
        int large = n - 1;

        // Flag to choose between the largest and smallest element
        boolean flag = true;

        // Fill the temp array in alternate fashion
        for (int i = 0; i < n; i++) {
            if (flag) {
                temp[i] = arr[large--];
                System.out.println(arr[large]);
            } else {
                temp[i] = arr[small++];
                System.out.println(arr[small]);
            }
            flag = !flag; // Switch between true and false
        }

        // Copy the temp array back to the original array
        System.arraycopy(temp, 0, arr, 0, n);

        System.out.println("Rearranged Array: " + Arrays.toString(arr));

        System.out.println(arr[large]);
        System.out.println(arr[small]);

    }
}


