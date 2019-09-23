package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    public ArrayList<Node> allNodes;

    //gets all the nodes in the graph
    public ArrayList<Node> getNodes() {
        if(allNodes.size() == 0){
            return null;
        }
        return allNodes;
    }

    public void setAllNodes(ArrayList<Node> allNodes) {
        this.allNodes = allNodes;
    }

    //constructor
    public Graph(){
        this.allNodes = new ArrayList<>();
    }

    //adds a node to a graph
    public Node addNode(Node node){
        allNodes.add(node);
        return node;
    }

    //adds a new edge between two nodes. and their edge weight, in the graph. both nodes should already be in the graph
    public void addEdge(Node source, Node destination, int weight){
        //ensure that both nodes exist in the graph
        //before adding an edge
        if(allNodes.contains(source) && allNodes.contains(destination)){
            source.edges.add(new Edge(destination, weight));
            destination.edges.add(new Edge(source, weight));
        }
    }

    //finds all the nodes connected to the given node
    public ArrayList<Edge> getNeighbors(Node node){
        return node.edges;
    }

    //returns the total number of nodes in the graph
    public int size(){
        return this.allNodes.size();
    }
}
