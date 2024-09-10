

public class Print1ToN {
    
    public static void printn(int n)
    {
         if (n == 0)
         {
            return;
         }
         else 
         {
            printn(n - 1);
            if (n > 0)
            {
                System.out.println(n);
            }
         }
    }



    public static void main(String[] args) {
        int n = 5;

        printn(n);

    }
}
