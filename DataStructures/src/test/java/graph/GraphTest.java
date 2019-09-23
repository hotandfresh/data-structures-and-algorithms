package graph;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void canAddNode(){
        Graph graph = new Graph();
        Node newNode = new Node(10);

        graph.addNode(newNode);

        assertEquals(10, graph.allNodes.get(0).value);
    }

    @Test
    public void canAddEdge(){
        Graph graph = new Graph();
        Node node1 = new Node(10);
        Node node2 = new Node(100);

        graph.addNode(node1);
        graph.addNode(node2);

        graph.addEdge(node1, node2, 1);
        Edge actual = (Edge)node1.edges.get(0);
        assertEquals(actual.getNode(), node2);
    }

    @Test
    public void canGetAllNodes(){
        Graph graph = new Graph();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        graph.addNode(node1);
        graph.addNode(node2);
        graph.addNode(node3);
        graph.addNode(node4);

        assertTrue(graph.allNodes.contains(node1));
        assertTrue(graph.allNodes.contains(node2));
        assertTrue(graph.allNodes.contains(node3));
        assertTrue(graph.allNodes.contains(node4));
    }

    @Test
    public void canGetAllNeighbors(){
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

        assertEquals(graph.getNeighbors(node1).get(0).node.value,2 );
        assertEquals(graph.getNeighbors(node1).get(1).node.value,3 );
        assertEquals(graph.getNeighbors(node1).get(2).node.value,4 );
    }

    @Test
    public void canReturnNeighborsWithWeight(){
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

        assertEquals(graph.getNeighbors(node1).get(0).node.value,2 );
        assertEquals(graph.getNeighbors(node1).get(0).weight,10 );

        assertEquals(graph.getNeighbors(node1).get(1).node.value,3 );
        assertEquals(graph.getNeighbors(node1).get(1).weight,100 );

        assertEquals(graph.getNeighbors(node1).get(2).node.value,4 );
        assertEquals(graph.getNeighbors(node1).get(2).weight,1000 );
    }

    @Test
    public void canGetSizeOfGraph(){
        Graph graph = new Graph();

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        graph.addNode(node1);
        graph.addNode(node2);
        graph.addNode(node3);
        graph.addNode(node4);

        assertEquals(graph.size(), 4);
    }

    @Test
    public void canReturnGraphWithOneNodeAndOneEdge(){
        Graph graph = new Graph();

        Node node1 = new Node(1);

        graph.addNode(node1);

        graph.addEdge(node1, node1, 1);

        assertEquals(graph.getNeighbors(node1).get(0).node.value,1 );
        assertEquals(graph.getNeighbors(node1).get(0).weight,1 );
    }

    @Test
    public void canReturnNullForEmptyGraph(){
        Graph graph = new Graph();
        assertTrue(graph.getNodes() == null);
    }
}