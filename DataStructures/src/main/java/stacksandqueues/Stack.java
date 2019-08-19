package stacksandqueues;

public class Stack<T> {
    public Node<T> top;

    //adds a node to the top of the stack
    //returns nothing
    public void push(T data){
        Node<T> newNode = new Node(data);
        if(top == null){
           top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    //removes a node from the top of the stack
    //returns the value of the node that was removed
    public T pop(){
        if(top == null){
            throw new NullPointerException();
        }
        //assign the value of the top node, so that it's not lost
        T data = top.data;
        //move the pointer to the next node underneath
        top = top.next;
        return data;
    }

    public T peek(){
        return top.data;
    }
}
