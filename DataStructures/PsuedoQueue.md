# PseudoQueue

# Summary

Implement a queue using two stacks.

[See the Code](src/main/java/stacksandqueues/PseudoQueue.java)

[See the Tests](src/test/java/stacksandqueues/PseudoQueueTest.java)

## Description

This solution implements a 4 pointer strategy.  For each linked list, a current reference pointer is set to the head and a runner reference pointer is set to the next node after current.

The pointers are needed in order to move along the linked list.  They keep track of new bonds, and then reassigns the new current to the runners after the new bonds have been made.

The two lists have been mutated in order to make 1 zipped list.

## Approach & Efficiency

_Enqueue_
Time complexity is O(1) and space complexity is O(1).

_Dequeue_
Time complexity is O(N) and space complexity is O(1).


## Solution

![PsuedoQueue Whiteboard](/assets/psuedoQueue.png)

