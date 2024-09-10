

public class MaxSecondMax {
    public static void main(String[] args) {
        
    
    int[] array = {5, 3, 9, 1, 6, 4, 8, 2};

    if (array.length < 2)
    {
        System.out.println("Array must have at least two elements.");
    }

    int max = Integer.MIN_VALUE;
    int secmax = Integer.MIN_VALUE;

    for (int number : array) {
        if (number > max) {
            secmax = max;
            max = number;
        } else if (number > secmax && number != max)
        {
            secmax = number;
        }
    }

    if (secmax == Integer.MIN_VALUE) {
        System.out.println("There is no Second Max");
    }
    else 
    {
        System.out.println("Max Value: " + max);
        System.out.println("Second Max Value: " + secmax);
    }
}
}
