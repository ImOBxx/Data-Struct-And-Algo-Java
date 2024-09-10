public class SecondLargest2 {

    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 4};  // Corrected array initialization
        int res = -1, largest = 0;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[largest]) {
                res = largest;
                largest = i;
                System.out.println(largest);
            } else if (arr[i] != arr[largest]) {
                if (res == -1 || arr[i] > arr[res]) {
                    System.out.println(arr[res]);
                    res = i;
                }
            }
        }
       System.out.println(res);
       System.out.println(largest);
       
        
   
        System.out.println("Second Largest Element Index: " + res);
    }
}
