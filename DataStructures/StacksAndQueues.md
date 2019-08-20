# Stacks and Queues

## Stacks
[See the code](src/main/java/stacksandqueues/Stack.java)

[See the tests](src/main/java/stacksandqueues/StackTest.java)

A stack is a Last In, First Out (LIFO) data structure that can be visualized as a stack of plates. The last plate added, is the first one taken off.

This last plate is referred to as the _top_.  When the top is taken off, the one underneath it becomes the new top.

This stack implementation uses Nodes to represent each plate.  The values can be anything, as long as they are the same throughout, because generics are used.

## Approach & Efficiency
_push_: This process adds a node to the top of the stack.  Top then is assigned this new node. Time and space complexity are both the same at O(1);

_pop_: This process removes a node from the top of the stack and returns the value.  Top is then assigned the node underneath.  Time and space complexity are both the same at O(1).

_peek_: This process returns the value of the top node and does not remove anything.  Therefore, time and space complexity are both the same at O(1);

---
## Queues
[See the code](src/main/java/stacksandqueues/Queue.java)

[See the tests](src/main/java/stacksandqueues/QueueTest.java)

A queue is a First In, First Out (FIFO) data structure that can be visualized as a line of people waiting to get in somewhere. The first person in line, is the first person out.

This queue implementation uses Nodes to represent each person in line.  The values can be anything, as long as they are the same throughout, because generics are used.

The first thing in line is referred to as the _front_ and the last thing in line is the _tail_.

## Approach & Efficiency
_enqueue_: This process adds a node to the back of the queue.  Tail then is assigned this new node. If the queue is empty, the front is assigned this new node.  Time and space complexity are both the same at O(1);

_dequeue_: This process removes a node from the front of the queue and returns the value.  Front is then assigned the node behind it.  Time and space complexity are both the same at O(1).

_peek_: This process returns the value of the front node and does not remove anything.  Therefore, time and space complexity are both the same at O(1);

## Resources
Many thanks to the Hacker Rank [tutorial](https://www.youtube.com/watch?v=wjI1WNcIntg)
