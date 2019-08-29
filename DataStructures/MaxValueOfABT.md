# Max Value of a Binary Tree

# Summary
Given a tree as an argument, find the maximum value stored in the tree.

[See the Code](src/main/java/tree/BinaryTree.java)

- scroll down to the method findMax

[See the Tests](src/test/java/tree/BinaryTreeTest.java)

- scroll down to the test canFindMax

## Description
This is a recursive solution that uses the post order traversal to check each node.  The base case is to return 0 if the node is null. At every node, keep track of the current value of that node and then traverse left and right.  As we move back up to the parent node, check if the value of the left or right side is greater than the parent node. Return whichever is greater.

## Approach & Efficiency
Time complexity is O(N) because the max value could be on the side of the tree that is checked last.  Space complexity is also O(N) since a recursive call stack is used.

## Tree used in the test:
        2   
       / \
      1   3
     / \ 
    5  11

## Solution
![Find Max in Binary Tree](/assets/maxBinaryTree.png)

## Resources
[Geeks for Geeks](https://www.geeksforgeeks.org/find-maximum-or-minimum-in-binary-tree/)

