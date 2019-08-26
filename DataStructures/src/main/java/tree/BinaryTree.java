package tree;

import java.util.ArrayList;

public class BinaryTree<T> {
    Node<T> root;

    public BinaryTree(){
        this.root = null;
    }

    public BinaryTree(Node<T> root){
        this.root = root;
    }

    ArrayList<T> result = new ArrayList<>();

    //pre - root, left, right
    public ArrayList<T> preOrder(Node<T> root){
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
    public ArrayList<T> inOrder(Node<T> root){
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
    public ArrayList<T> postOrder(Node<T> root){
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
