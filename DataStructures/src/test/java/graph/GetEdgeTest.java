package graph;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GetEdgeTest {

    @Test
    public void canGetDirectFlight(){
        Graph graph = new Graph();
        Node node1 = new Node("CHI");
        Node node2 = new Node("SEA");
        Node node3 = new Node("PDX");
        Node node4 = new Node("CLE");
        Node node5 = new Node("SFO");

        graph.addNode(node1);
        graph.addNode(node2);
        graph.addNode(node3);
        graph.addNode(node4);
        graph.addNode(node5);

        graph.addEdge(node1, node2, 82);
        graph.addEdge(node2, node3, 50);
        graph.addEdge(node4, node5, 100);

        GetEdge ge = new GetEdge();
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("CHI", "SEA", "PDX", "CLE", "SFO"));
        String actual = ge.getEdge(graph, cities);
        System.out.println(actual);
    }

    @Test
    public void canDetermineIfDirectIsntPossible(){
        Graph graph = new Graph();
        Node node1 = new Node("CHI");
        Node node2 = new Node("SEA");
        Node node3 = new Node("PDX");
        Node node4 = new Node("CLE");
        Node node5 = new Node("SFO");

        graph.addNode(node1);
        graph.addNode(node2);
        graph.addNode(node3);
        graph.addNode(node4);
        graph.addNode(node5);

        graph.addEdge(node1, node2, 82);
        graph.addEdge(node1, node3, 50);
        graph.addEdge(node1, node4, 100);
        graph.addEdge(node1, node4, 20);
        graph.addEdge(node1, node5, 200);

        GetEdge ge = new GetEdge();
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("CHI", "BKK", "SEA", "PDX", "CLE", "SFO"));
        String actual = ge.getEdge(graph, cities);
        System.out.println(actual);
    }

}