/*
     Largest Sub Array
     I : {2, 0, 2, 1, 4, 3, 1, 0}
     O : {0, 2, 1, 4, 3}
 */
 
 import java.util.HashSet;
 import java.util.Set;
 
 class FindLargestSubArray { 
     // Function to find the largest subarray formed by consecutive integers
     public static void findMaxSubarray(int[] A) {
         int maxLength = 0, start = 0, end = 0;
 
         for (int i = 0; i < A.length; i++) {
             int min = A[i], max = A[i];
             Set<Integer> visited = new HashSet<>();
 
             for (int j = i; j < A.length; j++) {
                 if (!visited.add(A[j])) break;
 
                 min = Math.min(min, A[j]);
                 max = Math.max(max, A[j]);
 
                 if (max - min == j - i && j - i + 1 > maxLength) {
                     maxLength = j - i + 1;
                     start = i;
                     end = j;
                 }
             }
         }
 
         System.out.println("The largest subarray is [" + start + ", " + end + "] with length " + maxLength);
     }
 
     public static void main(String[] args) {
         int[] A = {2, 0, 2, 1, 4, 3, 1, 0};
         findMaxSubarray(A);
     }
 }
 

