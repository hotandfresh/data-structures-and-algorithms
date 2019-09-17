package tree;

import stacksandqueues.Queue;

import java.util.ArrayList;

public class BinaryTree<T> {
    public Node<T> root;

    public BinaryTree(){
        this.root = null;
    }

    public BinaryTree(Node<T> root){
        this.root = root;
    }

    ArrayList<T> result = new ArrayList<>();

    //finds the max value stored in a BT
    public int findMax(Node<Integer> root){
        if(root == null){
            return 0;
        }

        int currentVal = root.data;

        int left = findMax(root.left);

        int right = findMax(root.right);

        if(left > currentVal){
            currentVal = left;
        }

        if(right > currentVal){
            currentVal = right;
        }

        return currentVal;
    }

    //breadth first search
    public ArrayList<T> breadthFirstSearch(Node<T> root){
        Queue<Node> Q = new Queue<>();

        Q.enqueue(root);
        while(!Q.isEmpty()){
            Node<Integer> temp = Q.dequeue();
            result.add((T)temp.data);
            System.out.println(temp.data);
            if(temp.left != null){
                Q.enqueue(temp.left);
            }
            if(temp.right != null){
                Q.enqueue(temp.right);
            }
        }

        return result;
    }

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
