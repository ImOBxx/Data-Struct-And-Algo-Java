public class ArraySortedRotated {
    
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 1, 2};

        if (isSorted(array)) {
            System.out.println("The Array Is Sorted");
        }
        else if (isRotated(array)) {
            System.out.println("The Array is Rotated.");
        } else {
            System.out.println("The Array is neither sorted nor rotated");
        }
    }
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++)
        {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isRotated(int[] array)  {
        int count = 0;
        int n = array.length;

        for (int i = 0; i < n; i++)
        {
            if (array[i] > array[(i + 1) % n])
            {
                count++;
            }
        } 
        return count == 1;
    }
}
