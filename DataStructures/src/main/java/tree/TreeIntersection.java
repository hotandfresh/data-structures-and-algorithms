package tree;

import java.util.ArrayList;

public class TreeIntersection {

    public ArrayList<Integer> treeIntersection(BinaryTree<Integer> bt1, Node root1, BinaryTree<Integer> bt2, Node root2){
        ArrayList<Integer> result = new ArrayList<>();

        ArrayList<Integer> bt1Result = bt1.inOrder(root1);
        ArrayList<Integer> bt2Result = bt2.inOrder(root2);

        for(int n : bt1Result){
            if(bt2Result.contains(n)){
                result.add(n);
            }
        }
        return result;
    }
}
