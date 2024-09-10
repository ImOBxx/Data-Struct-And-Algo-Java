/*
 * 
 * Find the duplicate element in a limited range array
 * Input {1,2,3,4,4}
 * Output:Duplicate element is 4
 */

public class DSA3 {
    public static int findDuplicate(int arr[]){
        int duplicate = 0;

        for(int i:arr){
            int val=(i<0)?-i:i;

            if(arr[val]>=0){
                arr[val]=-arr[val];
            }
            else{
                duplicate=val;
                break;
            }
        }
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] < 0){
                    arr[j] =- arr[j];
                }
            }

            return duplicate;
        }

    public static void main(String[] args) {
        int arr[]={2,3,5,5,6,8};

        System.out.println("The Duplicate Element is: " + findDuplicate(arr));
    }
    
}