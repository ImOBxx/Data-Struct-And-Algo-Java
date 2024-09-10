public class Prev {

    public void printGreater(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[i]) {
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
            if (j == -1) {
                System.out.print(-1 + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {20, 30, 40, 5, 15};
        Prev x = new Prev();
        System.out.print("Previous Greater Element: ");
        x.printGreater(arr, arr.length);
    }
}

















