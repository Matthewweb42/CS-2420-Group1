import java.util.Stack;
public class stackBasedQueue{
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public void stackBasedQueue() {
    // Enter code Here
    // This is a stack initialization Stack<Integer> s = new Stack<Integer>();
    }
    public boolean isEmpty() {
    // Enter code Here
    return true;
    }
    public void enqueue(int newItem){
    // Enter code Here
    }
    public int dequeue() throws QueueException{
    // In case of problem:
    // throw new QueueException("You can not DEQUEUE on an EMPTY queue :(( ");
    // Enter code Here
    return 0;
    }
    public void dequeueAll(){
    //Enter code Here
    }
    public int peek() throws QueueException{
    // In case of problem:
    // throw new QueueException("You can not PEEK on an EMPTY queue :(( ");
    // Enter code Here
    return 1;
    }
    // Tester code
    public static void main(String[] args){
    stackBasedQueue q = new stackBasedQueue();
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    System.out.println("Ans#1: "+q.peek()); // Should be 1
    q.dequeue();
    q.dequeue();
    System.out.println("Ans#2: "+q.peek()); // Should be 3
    System.out.println("Ans#3: "+q.isEmpty()); // Should be false
    q.dequeueAll();
    System.out.println("Ans#4: "+q.isEmpty()); // Should be true
    System.out.println("Ans#5: "+q.peek());
    //Should throw exception with message: "You can not PEEK on an EMPTY queue :(( “
    }
    public class QueueException extends java.lang.RuntimeException{
    public QueueException(String s){
    super(s); }
    }
}