public class MaxConsec1 {
    int maxcon(boolean arr[]) {
        int res = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int curr = 0;
            for (int j = i; j < n; j++) {
                if (arr[j]) {
                    curr++;
                } else {
                    break;
                }
                res = Math.max(curr, res);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        boolean arr[] = {false, true, true, true, false, true, true};
        MaxConsec1 obj = new MaxConsec1();
        int result = obj.maxcon(arr);
        System.out.println("Maximum number of consecutive 1s: " + result);
    }
}

