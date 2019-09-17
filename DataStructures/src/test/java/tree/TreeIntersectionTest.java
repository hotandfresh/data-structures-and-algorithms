package tree;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

    @Test
    public void canFindSetOfValuesFoundInBothTrees(){
        BinaryTree bt1 = new BinaryTree();

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

        BinaryTree bt2 = new BinaryTree();

        Node root2 = new Node(1);

        Node nodeG = new Node(7);
        Node nodeH = new Node(111);
        Node nodeI = new Node(1111);
        Node nodeJ = new Node(11111);
        Node nodeK = new Node(111111);
        Node nodeL = new Node(1111111);

        //connect the nodes with each other:
        root2.left = nodeG;
        root2.right = nodeH;
        nodeG.left = nodeI;
        nodeG.right = nodeJ;
        nodeH.left = nodeK;
        nodeH.right = nodeL;

        TreeIntersection ti = new TreeIntersection();

        ArrayList<Integer> result = ti.treeIntersection(bt1, root, bt2, root2);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 7));

        assertEquals(expected, result);
    }

    @Test
    public void canFindSetOfValuesFoundInBothTrees2(){
        BinaryTree bt1 = new BinaryTree();

        Node root = new Node(1);

        BinaryTree bt2 = new BinaryTree();

        Node root2 = new Node(1);

        TreeIntersection ti = new TreeIntersection();

        ArrayList<Integer> result = ti.treeIntersection(bt1, root, bt2, root2);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1));

        assertEquals(expected, result);
    }

    @Test
    public void canFindSetOfValuesFoundInBothTrees3(){
        BinaryTree bt1 = new BinaryTree();

        Node root = new Node(1);

        BinaryTree bt2 = new BinaryTree();

        Node root2 = new Node(0);

        TreeIntersection ti = new TreeIntersection();

        ArrayList<Integer> result = ti.treeIntersection(bt1, root, bt2, root2);

        assertTrue(result.size() == 0);
    }
}