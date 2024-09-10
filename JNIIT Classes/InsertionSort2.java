import java.util.Scanner;

public class InsertionSort2 {
 private int [] arr=new int[10];
 private int n;

 
 public void read() {
  while (true) {
   
   System.out.println("Enter the number of elemenrs in the array:");
   String s=new Scanner(System.in).nextLine();
   n=Integer.parseInt(s);
   if(n>0 && n<=10) {
    break;
   }
   else if(n>10) {
    System.out.println("Array can have maximum 10 Elements");
    
   }
   else if(n<0) {
    System.out.println("Enter the Positive Number");
   }
  }
  //user input for the array
  System.out.println("-------------------------");
  System.out.println("--Enter-Array-Elements---");
  System.out.println("-------------------------");
  for (int i = 0; i < n; i++) {
   System.out.print("<"+(i+1)+"> ");
   String s1=new Scanner(System.in).nextLine();
   arr[i]=Integer.parseInt(s1);
  }
 }
 
 
 public void display() {
  System.out.println("-------------------------");
  System.out.println("--Sorted-Array-Elements--");
  System.out.println("-------------------------");
  for (int i = 0; i < n; i++) {
   System.out.print(arr[i]+" ");
   
  }
  
 }
 
 public void insertionSort() {
  for (int i = 1; i <=n-1; i++) {
   int temp=arr[i];
   int j=i-1;
   while((j>=0) && (arr[j]>temp)) {
    arr[j+1]=arr[j];
    j--;
   }
   arr[j+1]=temp;
  }
 }
 public static void main(String[] args) {
  InsertionSort2 sort=new InsertionSort2();
  
  sort.read();
  sort.insertionSort();
  sort.display();

 }

}