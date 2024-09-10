public class MoveZeroes {
    
    void moveZeros(int arr[], int n) {
        int count = 0; 
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                swap(arr, i, count);
                count++; 
            }
        }
    }
 
    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {8, 5, 0, 10, 0, 20};
        int n = arr.length;
        MoveZeroes x = new MoveZeroes();

        x.moveZeros(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

