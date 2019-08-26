package tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void canInstantiateBT(){
      BinaryTree bt = new BinaryTree();

      assertNull(bt.root);
    }

    @Test
    public void canInstantiateBTWithASingleRootNode(){
        BinaryTree bt = new BinaryTree();

        Node root = new Node(1);

        assertNull(root.left);
        assertNull(root.right);
    }

    @Test
    public void canAddALeftAndRightToSingleNode(){
        BinaryTree bt = new BinaryTree();

        Node root = new Node(1);
        Node nodeA = new Node(2);
        Node nodeB = new Node(3);

        root.left = nodeA;
        root.right = nodeB;

        assertEquals(root.left.data, nodeA.data);
        assertEquals(root.right.data, nodeB.data);
    }

    @Test
    public void preOrderTraversal(){
        BinaryTree bt = new BinaryTree();

        Node root = new Node(1);

        Node nodeA = new Node(2);
        Node nodeB = new Node(3);
        Node nodeC = new Node(4);
        Node nodeD = new Node(5);
        Node nodeE = new Node(6);
        Node nodeF = new Node(7);

        //connect the nodes with each other:
        root.left = nodeA;
        root.right = nodeB;
        nodeA.left = nodeC;
        nodeA.right = nodeD;
        nodeB.left = nodeE;
        nodeB.right = nodeF;

        ArrayList result = bt.preOrder(root);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 3, 6, 7));

        assertEquals(expected, result);
    }

    @Test
    public void inOrderTraversal(){
        BinaryTree bt = new BinaryTree();

        Node root = new Node(1);

        Node nodeA = new Node(2);
        Node nodeB = new Node(3);
        Node nodeC = new Node(4);
        Node nodeD = new Node(5);
        Node nodeE = new Node(6);
        Node nodeF = new Node(7);

        //connect the nodes with each other:
        root.left = nodeA;
        root.right = nodeB;
        nodeA.left = nodeC;
        nodeA.right = nodeD;
        nodeB.left = nodeE;
        nodeB.right = nodeF;

        ArrayList result = bt.inOrder(root);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(4, 2, 5, 1, 6, 3, 7));

        assertEquals(expected, result);
    }

    @Test
    public void postOrderTraversal(){
        BinaryTree bt = new BinaryTree();

        Node root = new Node(1);

        Node nodeA = new Node(2);
        Node nodeB = new Node(3);
        Node nodeC = new Node(4);
        Node nodeD = new Node(5);
        Node nodeE = new Node(6);
        Node nodeF = new Node(7);

        //connect the nodes with each other:
        root.left = nodeA;
        root.right = nodeB;
        nodeA.left = nodeC;
        nodeA.right = nodeD;
        nodeB.left = nodeE;
        nodeB.right = nodeF;

        ArrayList result = bt.postOrder(root);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(4, 5, 2, 6, 7, 3, 1));

        assertEquals(expected, result);
    }
}