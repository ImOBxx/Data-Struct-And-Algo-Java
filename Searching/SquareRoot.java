public class SquareRoot {

       static int sqRoot(int x)
       {
          int low = 1, high = x, ans = -1;
          while (low <= high)
          {
             int mid = (low + high) / 2;
             int msq = mid * mid;

             if (msq == x)
             {
                return mid;
             }
             else if(msq > x)
             {
                high = mid - 1;
             }
             else{
                low = mid + 1;
                ans = mid;
             }
          }
          return ans;
       }

       public static void main(String[] args) {
          int x = 10;

          int res = sqRoot(x);

          System.out.println("Square Root: " + res);
       }




















     
    /* 
    static int sq(int x)
    {
        int i = 1;
        while (i * i <= x)
        {
            i++;
        }
        return (i - 1);
    }
    
public static void main(String[] args) {
    int x = 9;

    int res = sq(x);

    System.out.println("Square Root Of "+ x + " : " + res);
   
    }
    */
}
