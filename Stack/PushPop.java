
class PushPop
{
    private int[] arr;
    private int top;

    public PushPop(int size) {
        arr = new int[size];
        top = -1;
    }

    public void push(int num)
    {
        if (top == arr.length - 1) {
            System.out.println("Stack is Full");
        }
        else {
            top++;
            arr[top] = num;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.print("Stack Underflow");
            return -1;
        }
        else {
            int popele = arr[top];
            top--;
            return popele;
        }
    }

    public int peek() {
        if (top == -1) {
          System.out.println("Stack is empty");
          return -1;
        } else {
          return arr[top];
        }
      }
    
      // Method to check if the stack is empty
      public boolean isEmpty() {
        return top == -1;
      }
    
      public void display() {
        if (top == -1) {
          System.out.println("Stack is empty");
        } else {
          System.out.print("Stack elements: ");
          for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
          }
          System.out.println();
        }
      }
    
      public static void main(String[] args) {
        System.out.println("Initialize a stack:");
        PushPop stack = new PushPop(5);
        System.out.println("Is the stack empty? " + stack.isEmpty());
        System.out.println("\nInput some elements on the stack:");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();
        System.out.println("\nTop element of the stack: " + stack.peek());
        System.out.println("\nRemove two element from the stack:");
        stack.pop();
        stack.pop();
        stack.display();
        System.out.println("\nTop element of the stack after popping: " + stack.peek());
        System.out.println("\nIs the stack empty? " + stack.isEmpty());
      }
    }























