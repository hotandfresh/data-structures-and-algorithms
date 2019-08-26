package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void canAddToBST(){
        Node root = new Node(2);

        root.right = new Node(5);

        Node newNode = new Node(7);

        BinarySearchTree bst = new BinarySearchTree();

        bst.add(root, newNode);

        assertEquals(root.right.right.data, newNode.data);
    }

    @Test
    public void canSearchForValue(){
        Node nodeA = new Node(12);
        Node nodeB = new Node(30);
        Node nodeC = new Node(42);
        Node nodeD = new Node(15);
        Node nodeE = new Node(6);
        Node nodeF = new Node(87);

        BinarySearchTree bst = new BinarySearchTree();

        bst.add(nodeA, nodeB);
        bst.add(nodeA, nodeC);
        bst.add(nodeA, nodeD);
        bst.add(nodeA, nodeE);
        bst.add(nodeA, nodeF);

        assertTrue(bst.contains(nodeA, 15));
    }

    @Test
    public void canSearchForValueNotInBST(){
        Node nodeA = new Node(12);
        Node nodeB = new Node(30);
        Node nodeC = new Node(42);
        Node nodeD = new Node(15);
        Node nodeE = new Node(6);
        Node nodeF = new Node(87);

        BinarySearchTree bst = new BinarySearchTree();

        bst.add(nodeA, nodeB);
        bst.add(nodeA, nodeC);
        bst.add(nodeA, nodeD);
        bst.add(nodeA, nodeE);
        bst.add(nodeA, nodeF);

        assertFalse(bst.contains(nodeA, 151));
    }

}