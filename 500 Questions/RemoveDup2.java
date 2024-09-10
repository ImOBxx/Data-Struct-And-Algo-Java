public class RemoveDup2 {
    
    int removeDup2(int arr[], int n)
    {
        int res = 1;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] != arr[res - 1])
            {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }

public static void main(String[] args) {
        int arr[] = {40, 40, 10, 20, 20, 30, 30, 30};
        int n = arr.length;
        RemoveDup2 x = new RemoveDup2();
        int newl = x.removeDup2(arr, n);
        System.out.println("After Removing Duplicates: ");
        for (int i = 0; i < newl; i++)
        {
            System.out.print(arr[i] + " ");
        }
    
    }
}