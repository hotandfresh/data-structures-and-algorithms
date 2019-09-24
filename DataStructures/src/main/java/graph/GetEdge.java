package graph;

import java.util.ArrayList;

public class GetEdge {

    public String getEdge(Graph graph, ArrayList<String> cities){
        int total = 0;
        for(int i = 0; i < cities.size(); i++){
            if(i != cities.size()-1){
                if(graph.allNodes.get(i).value == cities.get(i) && graph.allNodes.contains()){
                    ArrayList<Edge> allNeighbors = graph.getNeighbors(graph.allNodes.get(i));
                    total += allNeighbors.get(i).weight;
                } else {
                    return "False, $0";
                }

//                for(Edge e : (ArrayList<Edge>)allNeighbors){
//                    if(e.node.equals(nextCity)){
//                        total += e.weight;
//                    } else {
//                        return "False, $0";
//                    }
//                }
            }
        }
        return "True, $" + total;
    }
}
