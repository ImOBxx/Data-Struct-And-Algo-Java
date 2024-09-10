import java.util.Arrays;

public class MeanMedian {
    
     public static void main(String[] args) {
        int[] array = {5, 3, 9, 1, 6, 4, 8, 2};

        // Calculate Mean
        double mean = calculateMean(array);
        System.out.println("Mean: " + mean);

        // Calculate Median
        double median = calculateMedian(array);
        System.out.println("Median: " + median);
    }

    public static double calculateMean(int[] array) {
        double sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum / array.length;
    }

    public static double calculateMedian(int[] array) {
        Arrays.sort(array);
        int length = array.length;

        if (length % 2 == 0) {
            return (array[length / 2 - 1] + array[length / 2]) / 2.0;
        } else {
            return array[length / 2];
        }
    }
}
