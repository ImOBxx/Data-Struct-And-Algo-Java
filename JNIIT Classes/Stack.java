

class Node {
  int info;
  Node next;
  
  Node(int info, Node next) {
      this.info = info;
      this.next = next;
  }
}

public class Stack {
  private Node TOP;
  
  public Stack() {
      TOP = null;
  }
  
  public boolean empty() {
      return TOP == null;
  }
  
  public void push(int data) {
      Node freshNode = new Node(data, null);
      freshNode.next = TOP;
      TOP = freshNode;
      
      System.out.println("New Node Successfully added with value :" + data);
  }
  
  public void pop() {
      if (empty()) {
          System.out.println("Stack is empty, cannot pop.");
          return;
      }
      TOP = TOP.next;
  }
  
  public void display() {
      if (empty()) {
          System.out.println("Empty Stack");
      } else {
          System.out.println("Stack Elements Are:");
          for (Node temp = TOP; temp != null; temp = temp.next) {
              System.out.println(temp.info);
          }
      }
  }

  public static void main(String[] args) {
      Stack myStack = new Stack();
      
      myStack.push(20);
      myStack.push(30);
      myStack.push(70);
      myStack.push(50);
      
      //myStack.pop();
      //myStack.pop();
      myStack.display();
  }
}
