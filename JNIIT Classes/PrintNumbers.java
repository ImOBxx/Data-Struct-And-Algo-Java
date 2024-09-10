import java.util.Scanner;

public class PrintNumbers {
    
    public static void main(String[] args) {
        
        int a, b, c;
        Scanner in = new Scanner (System.in);
        System.out.print("");
        a = in.nextInt();
        System.out.print("");
        b = in.nextInt();
        System.out.print("");
        c = in.nextInt();

        int sum = a + b + c;

        System.out.println(sum);

        
    }
}
