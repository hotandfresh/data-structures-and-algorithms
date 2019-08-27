package tree;

public class Node<Object> {
    Node<Object> left;
    Node<Object> right;
    Object data;

    public Node(Object data){
        this.data = data;
    }

}
