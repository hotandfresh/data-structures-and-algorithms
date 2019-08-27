package tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    @Test
    public void canChangeTreeToFizzBuzz(){
        FizzBuzzTree fbt = new FizzBuzzTree();

        Node root = new Node(15);

        Node nodeA = new Node(1);
        Node nodeB = new Node(3);
        Node nodeC = new Node(5);
        Node nodeD = new Node(11);

        //connect the nodes with each other:
        root.left = nodeA;
        root.right = nodeB;
        nodeA.left = nodeC;
        nodeA.right = nodeD;

        ArrayList<Object> actual = fbt.fizzBuzzTree(root);

        ArrayList<Object> expected = new ArrayList<>(Arrays.asList("Buzz", 1, 11, "FizzBuzz", "Fizz"));

        assertEquals(expected, actual);
    }

}