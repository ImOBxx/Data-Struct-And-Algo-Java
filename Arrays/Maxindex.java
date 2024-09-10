public class Maxindex {
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;

        System.out.println("Max Index: " + MaxI(arr, n));

    }

        public static int MaxI(int[] arr, int n)
        {
            int maxindex = 0;
            for (int i = 0; i < n; i++)
            {
                if (arr[i] > arr[maxindex])
                {
                    maxindex = i;
                    
                }
            }
            return maxindex;
        }
}
