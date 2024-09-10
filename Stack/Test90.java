public class Test90 {
    public static void main(String[] args) {
        class MyStack {
            int arr[];
            int cap;
            int top;

            MyStack(int c) {
                top = -1;
                cap = c;
                arr = new int[cap];
            }

            void push(int x) {
                if (top == cap - 1) {
                    System.out.println("Stack overflow");
                    return;
                }
                top++;
                arr[top] = x;
            }

            int pop() {
                if (top == -1) {
                    System.out.println("Stack underflow");
                    return -1;
                }
                int res = arr[top];
                top--;
                return res;
            }

            int peek() {
                if (top == -1) {
                    System.out.println("Stack is empty");
                    return -1;
                }
                return arr[top];
            }

            int size() {
                return top + 1;
            }

            boolean isEmpty() {
                return (top == -1);
            }
        }

        MyStack s = new MyStack(5);
        s.push(10);
        s.push(20);
        System.out.println();
        System.out.println("Popped element: " + s.pop()); // Output: 20
        s.push(30);
        System.out.println("Top element: " + s.peek()); // Output: 30
        System.out.println("Is stack empty? " + s.isEmpty()); // Output: false
        System.out.println("Stack size: " + s.size()); // Output: 2
        System.out.println(s.cap);
        System.out.println(s.top);
        System.out.println(s.arr);
        System.out.println(s.toString());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.push(30);
        s.push(30);
        s.push(30);
        s.push(30);
        s.push(30);
        s.push(30);
        s.push(30);
        s.push(30);

        s.push(30);
        s.push(30);

        
    }
}
