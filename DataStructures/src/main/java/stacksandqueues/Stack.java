package stacksandqueues;

public class Stack<T> {
    public Node<T> top;

    public void push(T data){
        if(top == null){
           top = new Node(data);
        } else {
            Node<T> newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }
    }

    public T pop(){
        if(top == null){
            throw new NullPointerException();
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    public T peek(){
        return top.data;
    }
}
