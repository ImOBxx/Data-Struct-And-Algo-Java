public class MinFlips {

    void printg(boolean arr[], int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                if (arr[i] != arr[0]) {
                    System.out.print("From " + i + " To ");
                } else {
                    System.out.println(i - 1);
                }
            }
        }
        if (arr[n - 1] != arr[0]) {
            System.out.println(n - 1);
        }
    }

    public static void main(String[] args) {
        boolean arr[] = {false, false, true, true, false, false, true, true, false};
        int n = arr.length;
        MinFlips obj = new MinFlips();
        obj.printg(arr, n);
    }
}
