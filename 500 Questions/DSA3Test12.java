public class DSA3Test12 {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 5, 6, 8};
        int duplicate = -1;

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if (val < 0) {
                val = -val;
            }

            if (arr[val] >= 0) {
                arr[val] = -arr[val];
            } else {
                duplicate = val;
                break;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < 0) {
                arr[j] = -arr[j];
            }
        }

        System.out.println("The Duplicate Element is: " + duplicate);
    }
}


