package stacksandqueues;

public class Queue<T> {
    public Node<T> front;

    public void enqueue(T data){
        if(front == null){
            front = new Node(data);
        } else {
            Node<T> newNode = new Node(data);
            newNode.next = front;
            front = newNode;
        }
    }

    public T dequeue(){
        if(front == null){
            throw new NullPointerException();
        }

        T data = front.data;
        front = front.next;
        return data;
    }

    public T peek(){
        return front.data;
    }
}
