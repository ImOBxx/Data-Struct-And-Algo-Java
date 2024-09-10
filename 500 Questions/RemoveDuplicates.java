public class RemoveDuplicates {

    int removeDup(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int[] temp = new int[n];  // Correctly instantiate the temp array
        temp[0] = arr[0];
        int res = 1;

        for (int i = 0; i < n; i++) {
            if (temp[res - 1] != arr[i]) {
                temp[res] = arr[i];
                res++;
            }
        }

        // Copying the unique elements back to the original array
        for (int i = 0; i < res; i++) {
            arr[i] = temp[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 3, 4, 5};
        int n = arr.length;
        RemoveDuplicates x = new RemoveDuplicates();
        int newLength = x.removeDup(arr, n);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
