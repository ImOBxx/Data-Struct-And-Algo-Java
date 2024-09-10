import java.util.Arrays;

class ProductTwoArray
{
    // Function to find the maximum product of two integers in an array
    public static void findMaximumProduct(int[] A)
    {
        // Base case
        if (A.length < 2) {
            System.out.println("No pairs exist");
            return;
        }
        
        // Sort the array
        Arrays.sort(A);
        
        // Consider the product of the two largest and two smallest numbers
        int product1 = A[0] * A[1];
        int product2 = A[A.length - 1] * A[A.length - 2];
        
        // Print the pair with the maximum product
        if (product1 > product2) {
            System.out.println("Pair is (" + A[0] + ", " + A[1] + ")");
        } else {
            System.out.println("Pair is (" + A[A.length - 2] + ", " + A[A.length - 1] + ")");
        }
    }
    
    public static void main (String[] args)
    {
        int[] A = { -10, -3, 5, 6, -2 };
        findMaximumProduct(A);
    }
}

