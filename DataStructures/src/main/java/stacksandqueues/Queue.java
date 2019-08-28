package stacksandqueues;

public class Queue<T> {
    public Node<T> front;
    public Node<T> tail;

    //adds a new node to the end of the queue
    //returns nothing
    public void enqueue(T data){
        Node<T> newNode = new Node(data);
        //If there is a tail, point tail.next to the new node
        if(tail != null){
            tail.next = newNode;
        }
        //whether or not the tail is null, assign the tail as the new node
        tail = newNode;

        //if there's nothing at the front of the queue, assign the front as the new node
        if(front == null){
            front = newNode;
        }
    }

    //removes a node from the front of the queue
    //returns the value that was removed
    public T dequeue(){
        if(front == null){
            throw new NullPointerException();
        }

        //assign the value of the front, so it's not lost
        T data = front.data;
        //move the front pointer to the next node in line
        front = front.next;

        //if there's nothing, make sure to assign the tail to null as well
        if(front == null){
            tail = null;
        }

        return data;
    }

    public T peek(){
        if(front.data == null){
            return null;
        }
        return front.data;
    }

    public boolean isEmpty(){
        if(front == null && tail == null){
            return true;
        }
        return false;
    }
}
