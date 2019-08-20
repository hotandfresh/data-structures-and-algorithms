package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void canEnqueueIntoPseudoQueue(){
        //fill up stack1
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(100);
        stack1.push(200);

        //keep stack2 empty
        Stack<Integer> stack2 = new Stack<>();

        PseudoQueue<Integer> newPQ = new PseudoQueue<>(stack1, stack2);

        //there should be something in stack1 after enqueue-ing
        newPQ.enqueue(666);
        assertTrue(newPQ.stack1.top.data == 666);
    }

    @Test
    public void canDequeueOutOfPseudoQueue(){
        //fill up stack1
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(666);
        stack1.push(100);
        stack1.push(200);

        //keep stack2 empty
        Stack<Integer> stack2 = new Stack<>();

        PseudoQueue<Integer> newPQ = new PseudoQueue<>(stack1, stack2);
        int result = newPQ.dequeue();

        assertTrue(result == 666);
    }
}