package tree;

import java.util.ArrayList;

public class BinaryTree {
    ArrayList<Integer> result = new ArrayList<>();

    //pre - left, right, root
    public ArrayList<Integer> preOrder(Node root){
        result.add(root.data);
        if(root.left != null){
            preOrder(root.left);
        }

        if(root.right != null){
            preOrder(root.right);
        }

        return result;
    }

    //in - left, root, right
    public ArrayList<Integer> inOrder(Node root){
        if(root.left != null){
            inOrder(root.left);
        }

        result.add(root.data);

        if(root.right != null){
            inOrder(root.right);
        }

        return result;
    }

    //post - left, right, root
    public ArrayList<Integer> postOrder(Node root){
        if(root.left != null){
            postOrder(root.left);
        }

        if(root.right != null){
            postOrder(root.right);
        }

        result.add(root.data);
        return result;
    }
}
