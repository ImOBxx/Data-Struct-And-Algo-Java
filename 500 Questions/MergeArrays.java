import java.util.Arrays;

public class MergeArrays {

    // Function to in-place merge two sorted arrays X[] and Y[]
    public static void merge(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        for (int i = 0; i < m; i++) {
            if (X[i] > Y[0]) {
                // Swap X[i] and Y[0]
                int temp = X[i];
                X[i] = Y[0];
                Y[0] = temp;

                // Move Y[0] to its correct position to maintain the sorted order
                int first = Y[0];
                int k = 1;

                // Shift elements of Y[1...n-1] to the left until the correct position is found
                while (k < n && Y[k] < first) {
                    Y[k - 1] = Y[k];
                    k++;
                }

                // Place the first element at its correct position
                Y[k - 1] = first;
            }
        }
    }

    public static void main(String[] args) {
        int[] X = {1, 4, 7, 8, 10};
        int[] Y = {2, 3, 9};

        merge(X, Y);

        System.out.println("X: " + Arrays.toString(X));
        System.out.println("Y: " + Arrays.toString(Y));
    }
}
