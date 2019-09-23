package graph;

public class Edge<T> {
    public Node<T> node;
    public int weight;

    public Node<T> getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Edge(Node<T> node, int weight){
        this.node = node;
        this.weight = weight;
    }
}
