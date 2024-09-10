public class SortedArray1 {

    boolean isSorted(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {7, 20, 30, 40};  // Correct array initialization
        SortedArray1 x = new SortedArray1();  // Create an instance of the class
        System.out.println("Array Sorted: " + x.isSorted(arr));  // Call isSorted on the instance
    }
}
