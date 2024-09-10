class TwoStack {
    
    int arr[];
    int cap;
    int top1, top2;

    TwoStack(int n) {
        cap = n;
        top1 = -1;
        top2 = n;
        arr = new int[n];
    }

    boolean push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
            return true;
        }
        return false;
    }

    boolean push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
            return true;
        }
        return false;
    }

    Integer pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        }
        return null;
    }

    Integer pop2() {
        if (top2 < cap) {
            int x = arr[top2];
            top2++;
            return x;
        }
        return null;
    }

    int size1() {
        return (top1 + 1);
    }

    int size2() {
        return (cap - top2);
    }
}

public class TwoStackOneArray {
    public static void main(String[] args) {
        TwoStack ts = new TwoStack(5);
        
        // Pushing elements to stack 1
        ts.push1(5);
        ts.push1(10);
        ts.push1(15);

        // Pushing elements to stack 2
        ts.push2(20);
        ts.push2(25);
        ts.push2(30);

        // Popping elements from stack 1
        System.out.println("Popped from stack 1: " + ts.pop1()); // Should print 15
        System.out.println("Popped from stack 1: " + ts.pop1()); // Should print 10

        // Popping elements from stack 2
        System.out.println("Popped from stack 2: " + ts.pop2()); // Should print 25
        System.out.println("Popped from stack 2: " + ts.pop2()); // Should print 20

        // Print sizes of both stacks
        System.out.println("Size of stack 1: " + ts.size1()); // Should print 1
        System.out.println("Size of stack 2: " + ts.size2()); // Should print 0
    }
}
