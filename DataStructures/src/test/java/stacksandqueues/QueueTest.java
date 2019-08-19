package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void canInstantiateEmptyQueue(){
        Queue<Integer> newQ = new Queue<>();

        assertTrue(newQ.front == null);
    }

    @Test
    public void canEnqueue(){
        Queue<Integer> newQ = new Queue<>();

        newQ.enqueue(10);

        assertTrue(newQ.front.data == 10);
    }

    @Test
    public void canEnqueueMultipleValues(){
        Queue<Integer> newQ = new Queue<>();

        newQ.enqueue(10);
        newQ.enqueue(20);
        newQ.enqueue(30);
        newQ.enqueue(40);

        assertTrue(newQ.front.data == 40);
    }

    @Test
    public void canDequeue(){
        Queue<Integer> newQ = new Queue<>();

        newQ.enqueue(10);
        newQ.enqueue(20);
        //this is the front that will be dequeued:
        newQ.enqueue(30);
        //the node with the 20 will now be the front:
        int result = newQ.dequeue();

        assertTrue(result == 30);
    }

    @Test(expected = NullPointerException.class)
    public void canEmptyAQueueAfterMultipleDequeue(){
        Queue<Integer> newQ = new Queue<>();

        newQ.enqueue(10);
        newQ.enqueue(20);
        newQ.enqueue(30);
        newQ.enqueue(40);

        newQ.dequeue();
        newQ.dequeue();
        newQ.dequeue();
        newQ.dequeue();

        //if everything is dequeued, there will be a null pointer exception
        //there will be nothing left to dequeue
        newQ.dequeue();
    }

    @Test
    public void canReturnFrontValueOfQueue(){
        Queue<Integer> newQ = new Queue<>();

        newQ.enqueue(10);
        newQ.enqueue(20);
        newQ.enqueue(30);
        newQ.enqueue(40);

        assertTrue(newQ.peek() == 40);
    }

}