public class NextGreater {
    
    public void printGreater(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int j;
            for (j = i + 1; j >= 0; j--) {
                if (arr[j] > arr[i]) {
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
            if (j == n) {
                System.out.print(-1 + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 15, 10, 8, 6, 12, 9, 18};
        Prev x = new Prev();
        System.out.print("Previous Greater Element: ");
        x.printGreater(arr, arr.length);
    }
}
