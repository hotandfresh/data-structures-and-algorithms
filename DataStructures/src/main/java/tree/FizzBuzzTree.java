package tree;

import java.util.ArrayList;

public class FizzBuzzTree<Object> extends BinaryTree{

    public FizzBuzzTree(){
        super();
    }

    public ArrayList<Object> fizzBuzzTree(Node<Object> current){
        if(current == null){
            return new ArrayList<>();
        } else{
            ArrayList<Object> left = fizzBuzzTree(current.left);
            ArrayList<Object> right = fizzBuzzTree(current.right);

            ArrayList<Object> ans = new ArrayList<>();
            ans.addAll(left);
            if((Integer)current.data % 3 == 0 && (Integer)current.data % 5 == 0){
                current.data = (Object)"FizzBuzz";
            } else if((Integer) current.data % 3 == 0){
                current.data = (Object)"Fizz";
            } else if((Integer) current.data % 5 == 0){
                current.data = (Object)"Buzz";
            }

            ans.add((Object)current.data);

            ans.addAll(right);

            return ans;
        }
    }
}
