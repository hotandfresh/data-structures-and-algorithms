# Breadth First Traversal of a Binary Tree

# Summary
Traverse a tree using a breadth first search (bfs) traversal. A bfs traversal horizontally travels a tree, layer by layer.

[See the Code](src/main/java/tree/BinaryTree.java)

- scroll down to the method breadthFirstSearch

[See the Tests](src/test/java/tree/BinaryTreeTest.java)

- scroll down to the test canTravelBreadthFirst

## Description
breadthFirstSearch is a method that takes in a root of a tree and returns an arrayList of all the values of each node.

This is an iterative strategy that horizontally traverses a tree, layer by layer. A queue is used to hold each node.  As long as there's something in the queue, dequeue the front node and check if it has any children.  If there are child nodes, enqueue its left and then enqueue its right child nodes.

## Approach & Efficiency
Time complexity is O(N) because every node is visited, and space complexity is O(N) because a recursive call stack is used.

## Tree used in the test:
        1
       / \
      2   3
     / \ / \
    4  5 6  7

## Solution
![Fizz Buzz Tree](/assets/bfsTree.png)

