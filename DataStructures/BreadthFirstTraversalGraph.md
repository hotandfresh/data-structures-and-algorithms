# Breadth First Traversal of a Graph

## Challenge
Implement a breadth first traversal of a graph.

[See the Code](src/main/java/graph/BreadthFirst.java)

[See the Tests](src/test/java/graph/BreadthFirstTest.java)

## Approach & Efficiency
Time complexity is O(N) because every node is visited. 

Space complexity is O(N) because a queue is used to store each nodes and its neighbors.

## Solution
![breadth first traversal of a graph](/assets/bfsGraph.png)

## Methods
```BFS```: breadth first traversal of a graph. takes in a node and returns all the nodes found in the graph. Time and space complexity is O(N) because each node is added.

## Acknowledgements
[HackerRank Tutorial](https://www.youtube.com/watch?v=zaBhtODEL0w&t=263s)

Implementing a queue as an interface was taken from [here](https://stackoverflow.com/questions/4626812/how-do-i-instantiate-a-queue-object-in-java).

