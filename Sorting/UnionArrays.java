import java.util.Arrays;

public class UnionArrays {
    
    void printUnion(int a[], int b[], int m, int n) {
        int c[] = new int[m + n];
        for (int i = 0; i < m; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < n; i++) {
            c[m + i] = b[i];
        }
        Arrays.sort(c);

        System.out.println("Union of the two arrays is:");
        for (int i = 0; i < m + n; i++) {
            if (i == 0 || c[i] != c[i - 1]) {
                System.out.println(c[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {10, 20, 20};
        int b[] = {5, 20, 40, 40};

        UnionArrays ua = new UnionArrays();
        ua.printUnion(a, b, a.length, b.length);
    }
}
