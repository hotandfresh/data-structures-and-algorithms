package stacksandqueues;

public class PseudoQueue<T> {
    public Stack<T> stack1;
    public Stack<T> stack2;

    public PseudoQueue(Stack<T> stack1, Stack<T> stack2){
        this.stack1 = stack1;
        this.stack2 = stack2;
    }

    //inserts a value into the PseudoQueue using a FIFO approach
    //put everything into stack1 first
    public void enqueue(T data){
        this.stack1.push(data);
    }

    //removes a value from the front of the queue
    public T dequeue(){

        //since the first node in is at the bottom of stack1,
        //and that is the node to be removed, we need to pop
        //everything into stack2 until stack1 is empty.
        while(stack1.top != null){
            stack2.push(stack1.pop());
        }

        //then the top of stack2 is that element to be dequeue
        //and that can be popped off
        T answer = stack2.pop();

        //push everything from stack2 back into stack1
        while(stack2.top != null){
            stack1.push(stack2.pop());
        }
        return answer;
    }
}
