package tree;

public class Node<Object> {
    public Node<Object> left;
    public Node<Object> right;
    public Object data;

    public Node(Object data){
        this.data = data;
    }

}
