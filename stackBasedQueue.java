import java.util.Stack;

public class stackBasedQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public stackBasedQueue() {// Austin
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    public boolean isEmpty() {// Austin
        return this.stack1.isEmpty() && this.stack2.isEmpty();
    }

    public void enqueue(int newItem) {// Matthew
        stack1.push(newItem);
    }

    public int dequeue() throws QueueException {// Matthew
        // In case of problem:
        // throw new QueueException("You can not DEQUEUE on an EMPTY queue :(( ");
        // Enter code Here
        if (this.isEmpty()) {
            throw new QueueException("You can not DEQUEUE on an EMPTY queue :(( ");
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public void dequeueAll() {// Adam
        // Enter code Here
        while (!stack2.isEmpty()) {
            dequeue();
        }
    }

    public int peek() throws QueueException {// Adam
        // In case of problem:
        // throw new QueueException("You can not PEEK on an EMPTY queue :(( ");
        // Enter code Here
        if (this.isEmpty()) {
            throw new QueueException("You can not PEEK on an EMPTY queue :(( ");
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    // Tester code
    public static void main(String[] args) {
        stackBasedQueue q = new stackBasedQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("Ans#1: " + q.peek()); // Should be 1
        q.dequeue();
        q.dequeue();
        System.out.println("Ans#2: " + q.peek()); // Should be 3
        System.out.println("Ans#3: " + q.isEmpty()); // Should be false
        q.dequeueAll();
        System.out.println("Ans#4: " + q.isEmpty()); // Should be true
        System.out.println("Ans#5: " + q.peek());
        // Should throw exception with message: "You can not PEEK on an EMPTY queue :((
        // “
    }

    public class QueueException extends java.lang.RuntimeException {
        public QueueException(String s) {
            super(s);
        }
    }
}
