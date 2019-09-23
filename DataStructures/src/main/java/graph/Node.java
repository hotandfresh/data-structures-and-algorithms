package graph;

import java.util.ArrayList;

public class Node {
    public Boolean visited = false;
    public int value;
    public ArrayList<Edge> edges;

    public Boolean getVisited() {
        return visited;
    }

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Edge> edges) {
        this.edges = edges;
    }

    public Node(int value){
        this.value = value;
        this.edges = new ArrayList<>();;
    }
}
