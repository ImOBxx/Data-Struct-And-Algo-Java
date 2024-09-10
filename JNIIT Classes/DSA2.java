/* 
 * Check if a sub-array  with 0 sum exists or not
 * Input : {3,4,-7,3,1,3,1,-4,-2,-1}
 * Output: {3,4,-7},{3,1,-4}
 */

import java.util.HashSet;
import java.util.Set;

public class DSA2 {

    public static Boolean hasZeroSumSubarray(int arr[]){
        Set<Integer> myset=new HashSet<Integer>();
        myset.add(0);
        int sum=0;

        for(int value:arr){
           sum+=value;
           if(myset.contains(sum)) {
            return true;
           }
           myset.add(sum);
        }
        return false;

    }
    public static void main(String[] args) {
        int arr[]={4,-6,3,-1,4,2,7};
        if(hasZeroSumSubarray(arr)){
            System.out.println("Subarray Exist With Zero Sum");
        }
        else{
            System.out.println("Subarray with zero sum not found");
        }

    }
}
