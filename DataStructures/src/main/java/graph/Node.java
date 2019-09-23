package graph;

import java.util.ArrayList;

public class Node<T> {
    public Boolean visited = false;
    public T value;
    public ArrayList<Edge<T>> edges;

    public Boolean getVisited() {
        return visited;
    }

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public ArrayList<Edge<T>> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Edge<T>> edges) {
        this.edges = edges;
    }

    public Node(T value){
        this.value = value;
        this.edges = new ArrayList<>();
    }
}
