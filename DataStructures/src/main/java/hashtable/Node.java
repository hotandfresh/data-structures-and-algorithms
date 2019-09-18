package hashtable;

public class Node<T> {
    public Node<T> next;
    public T key;
    public T value;

    public Node(T key, T value){
        this.key = key;
        this.value = value;
    }
}
