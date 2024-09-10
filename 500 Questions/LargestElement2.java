public class LargestElement2 {

    int getlargest(int arr[]) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[res]) {
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {5, 8, 20, 10};  // Corrected array initialization
        LargestElement2 obj = new LargestElement2();  // Create an instance of the class
        System.out.println("Largest Element Index: " + obj.getlargest(arr));  // Call getlargest on the instance
    }
}
