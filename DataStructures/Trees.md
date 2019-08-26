# Trees

## Binary Tree (BT)
[See the code](src/main/java/tree/BinaryTree.java)

[See the tests](src/test/java/tree/BinaryTreeTest.java)

A binary tree is a data structure where each node can have up to 2 children nodes.  There is no specific sorting order.


---
## Binary Search Tree (BST)
[See the code](src/main/java/tree/BinarySearchTree.java)

[See the tests](src/main/java/tree/BinarySearchTreeTest.java)

A binary search tree is a type of binary tree, where values to the left of the root are smaller and values to the right of the root are larger.

## Approach & Efficiency

### Binary Tree
_preOrder_: This is a recursive traversal method where the root is visited first, then the left and then the right node.

_inOrder_: This is a recursive traversal method here the left node is visited first, then the root and then the right node.

_postOrder_: This is a recursive traversal method here the left node is visited first, then the right and then the root node.

The space and time complexity of all of these traversals is O(N) because every node is visited. Since recursion is used, all nodes will be added to the call stack.

### Binary Search Tree
_add_: This recursive method adds a node to the bst according to the rule where if it's less, then it will go somewhere on the left side of the node and if it's larger, it will go somewhere on the right side.

_contains_: This recursive method determines if a value is in a binary search tree.  It compares the value against the root's value.  If it's less, then call the method again with the node to the left of root to travel further down the left side of the tree.  If it's greater, then call the method again with the node to the right of the root to travel further down the right side of the tree.


## Resources
Many thanks to the Hacker Rank [tutorial](https://www.youtube.com/watch?v=oSWTXtMglKE&t=313s)
