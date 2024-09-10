
// Sort Array Binary 0 first and 1 After

import java.util.Arrays;


public class SortLinearTIme {

    public static void sort(int[] A)
    {
        int zeros = 0;

        for (int value : A)
        {
            if (value == 0)
            {
                zeros++;
            }
        }

        for (int i = 0; i < zeros; i++)
        {
            A[i] = 0;
        }

        for (int i = zeros; i < A.length; i++)
        {
            A[i] = 1;
        }
    }

    public static void main(String[] args) {
        int[] A = {0, 0, 1, 0, 1, 1, 0, 1, 0, 0};

        sort(A);

        System.out.println("Sorted Array: " + Arrays.toString(A));
    }

}