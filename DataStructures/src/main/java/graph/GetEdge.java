package graph;

import java.util.ArrayList;

public class GetEdge {

    public String getEdge(Graph graph, ArrayList<String> cities){
        //flight trip cost
        int total = 0;

        //iterate over the list of cities
        for(int i = 0; i < cities.size(); i++){

            //as long as we're not at the end of the list, do this:
            if(i != cities.size()-1){

                //if the city is in the graph and the next city is also in the graph, do this:
                if(graph.allNodes.get(i).value == cities.get(i) && graph.allNodes.get(i+1).value == cities.get(i+1)){

                    //get all the neighbors for the city we're at to see if there's a direct flight
                    ArrayList<Edge> allNeighbors = graph.getNeighbors(graph.allNodes.get(i));

                    //that city could have a lot of neighbors, so check if the next city is a neighbor
                    for(Edge e : allNeighbors){

                        //if it is, add it's weight (the cost) to the cost of the flight
                        if(e.node.value  == cities.get(i+1)){
                            total += e.weight;
                        }
                    }
                } else {
                    //otherwise, there is no direct flight and the trip cannot be done all with direct flights
                    return "False, $0";
                }
            }
        }
        return "True, $" + total;
    }
}
