package graph;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DepthFirstTest {

    @Test
    public void canSearchDepthFirstSearch(){
        Graph graph = new Graph();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        graph.addNode(node1);
        graph.addNode(node2);
        graph.addNode(node3);
        graph.addNode(node4);

        graph.addEdge(node1, node2, 10);
        graph.addEdge(node1, node3, 100);
        graph.addEdge(node1, node4, 1000);

        DepthFirst dfs = new DepthFirst();
        ArrayList<Node> actual = dfs.DFS(node1);
        assertTrue(actual.contains(node1));
        assertTrue(actual.contains(node2));
        assertTrue(actual.contains(node3));
        assertTrue(actual.contains(node4));
    }

}