package tree;

public class BinarySearchTree extends BinaryTree<Integer>{
    public BinarySearchTree(){
        super();
    }

    public void add(Node<Integer> root, Node<Integer> newNode){
        if(root == null){
            root = newNode;
        }

        if(newNode.data <= root.data){
            if(root.left == null){
                root.left = newNode;
            } else {
                add(root.left, newNode);
            }
        } else {
            if(root.right == null){
                root.right = newNode;
            } else {
                add(root.right, newNode);
            }
        }
    }

    public boolean contains(Node<Integer> root, int value){
        if(root == null){
            return false;
        }

        if(value == root.data){
            return true;
        }

        if(value <= root.data){
            return contains(root.left, value);
        }

        return contains(root.right, value);
    }
}
