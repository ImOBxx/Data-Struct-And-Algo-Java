public class ArrayLeaders {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};

        findLeaders(arr);
    }

    public static void findLeaders(int[] arr) {

        int n = arr.length;
        int maxFromRIght = arr[n - 1];

        System.out.println("Leaders: " + maxFromRIght);

        for(int i = n - 2; i >= 0; i--)
        {
            if(arr[i] >= maxFromRIght) {
                maxFromRIght = arr[i];
                System.out.print(" " + maxFromRIght);
            }
        }
    }
}
