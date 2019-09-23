package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirst {

    //Breadth first traversal
    public ArrayList<Node> BFS(Node node){
        ArrayList<Node> result = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(node);

        while(!q.isEmpty()){
            Node front = q.poll();
            front.visited = true;
            result.add(front);

            for(Edge edge : (ArrayList<Edge>)front.edges){
                if(!edge.node.visited){
                    edge.node.visited = true;
                    q.add(edge.node);
                }
            }
        }

        return result;
    }
}
