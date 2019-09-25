package graph;

import java.util.ArrayList;
import java.util.Stack;

public class DepthFirst {

    public ArrayList<Node> DFS(Node node){
        ArrayList<Node> result = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(node);

        while(!stack.isEmpty()){
            if(!stack.peek().visited){
                stack.peek().visited = true;
                Node poppedNode = stack.pop();
                result.add(poppedNode);
                for(Edge edge : (ArrayList<Edge>)poppedNode.edges) {
                    //push unvisited children into the stack
                    if(!edge.node.visited){
                        stack.push(edge.node);
                    }
                }
            } else {
                result.add(stack.pop());
            }
        }

        return result;
    }
}
