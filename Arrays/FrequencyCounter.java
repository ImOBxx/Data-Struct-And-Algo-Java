public class FrequencyCounter {
    
    public static void main(String[] args) {
        int arr[] = {2, 3, 3, 2, 5};
        int n = arr.length;

        countFreq(arr, n);
           
        System.out.println("Frequencies of elements:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " -> " + arr[i]);
        }

    }

    public static void countFreq(int[] arr, int n) 
    {
        for (int i = 0; i < n; i++)
        {
            arr[i] -= 1;
        } 

        for(int i = 0; i < n; i++)
        {
            arr[arr[i] % n] += n;
        }

        for(int i = 0; i < n; i++) 
        {
            arr[i] = arr[i] / n;
        }
    }
}
