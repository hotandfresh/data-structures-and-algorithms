# PseudoQueue

# Summary

Implement a queue using two stacks.

[See the Code](src/main/java/stacksandqueues/PseudoQueue.java)

[See the Tests](src/test/java/stacksandqueues/PseudoQueueTest.java)

## Description
The 2 stacks acts as buckets, where stack1 is the main bucket and stack2 is like a temporary bucket where nodes from stack1 will be placed during the dequeue process.

_Enqueue_
This method will add a node by pushing into stack1, the main bucket.  This method will only push items into stack1.

_Dequeue_
stack2 is used as a temporary bucket to hold the nodes, so that the node at the bottom of stack1 can be reached.  That node is the node that was placed in first. Since this is a representation of a queue, that node at the bottom of stack1 needs to be removed first if it were to be dequeued. At the end of this process, everything will be popped and pushed back into stack1 from stack2 so that the order of the nodes stay the same.


## Approach & Efficiency

_Enqueue_
Time complexity is O(1) and space complexity is O(1).

_Dequeue_
Time complexity is O(N) and space complexity is O(1).


## Solution

![PsuedoQueue Whiteboard](/assets/psuedoQueue.png)

