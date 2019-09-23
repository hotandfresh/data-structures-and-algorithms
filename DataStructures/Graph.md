# Graph
A graph is a non-linear data structure of nodes connected by edges.

## Challenge
Implement a graph.

[See the Code](src/main/java/graph/Graph.java)

[See the Tests](src/test/java/graph/GraphTest.java)

## Approach & Efficiency
This implementation utilizes a number of array lists to store information such as all the edges connected to a node and all the nodes in a graph.  Therefore, space complexity is O(N)

Time complexity is O(N) because a check is done to see if two nodes exist in a graph before an edge is added.
 

## Classes
- Node: the graph implemented consists of nodes. nodes have a value, a flag indicating if it has been visited and a list of edges connected to it.

- Edge: an edge will have a node attach to it and a weight

- Graph: each graph will come with a list of all the nodes in it.

## Methods
```addNode```: add a new node to the graph. takes in the value of that node and returns the added node.

```addEdge```: adds a new edge between two nodes in the graph. includes the ability to have a weight.  takes in two nodes to be connected by the edge; both nodes are already in the graph.

```getNodes```: returns all the nodes in the graph as a collection.

```getNeighbors```: takes in a node and returns a collection of nodes connected to the given node. includes the weight of the connection in the returned collection.

```size```: returns the total number of nodes in the graph.

## Acknowledgements
[HackerRank Tutorial](https://www.youtube.com/watch?v=zaBhtODEL0w&t=263s)

Implementing a queue as an interface was taken from [here](https://stackoverflow.com/questions/4626812/how-do-i-instantiate-a-queue-object-in-java).

