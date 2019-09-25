# Depth First Search of a Graph

## Challenge
Implement a breadth first traversal of a graph.

[See the Code](src/main/java/graph/DepthFirst.java)

[See the Tests](src/test/java/graph/DepthFirstTest.java)

## Approach & Efficiency
Time complexity is O(N) because every node is visited. 

Space complexity is O(N) because a stack is used to store each node and its children.

## Solution
![depth first traversal of a graph](assets/dfsGraph.png)

## Methods
```DFS```: depth first traversal of a graph. takes in a node and returns all the nodes found in the graph. A stack is used to store nodes and its children.  First push the root into the stack.  As long as the stack is not empty, do the following:

- look at the top node
- if the top has unvisited children, mark that top node as visited and push all its unvisited children into the stack
- if the top doesn't have unvisited children, pop it off the stack
- repeat until the stack is empty

## Acknowledgements
[HackerRank Tutorial](https://www.youtube.com/watch?v=zaBhtODEL0w&t=263s)


