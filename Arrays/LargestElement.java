
// index of the largest element



public class LargestElement {

static int getlargest(int arr[])
{
    int n = arr.length;
    for (int i = 0; i < n; i++)
    {
        boolean flag = true;
        for (int j = 0; j < n; j++)
        {
            if (arr[j] > arr[i]) {
                flag = false;
                break;
            }
        }
        if (flag == true)
        return i;
    }
    return -1;
}

public static void main(String[] args) {
    int[] arr = {5, 8, 20, 10};
    System.out.println(getlargest(arr));
        
    }
}
