# Merge 2 Linked Lists

# Summary

Given 2 linked lists, merge them so that the nodes alternate between the two lists and return the reference to the head of the zipped list.

[See the Code](src/main/java/linkedList/LinkedList.java)

[See the Tests](src/test/java/linkedList/LinkedListTest.java)

## Description

This solution implements a 4 pointer strategy.  For each linked list, a current reference pointer is set to the head and a runner reference pointer is set to the next node after current.

The pointers are needed in order to move along the linked list.  They keep track of new bonds, and then reassigns the new current to the runners after the new bonds have been made.

The two lists have been mutated in order to make 1 zipped list.

## Approach & Efficiency

Time complexity is O(N) and space complexity is O(1).

## Solution

![Merge Two Linked List Problem Domain](/assets/merge1.png)

![Merge Two Linked List Code](/assets/merge2.png)

## Resources

My October 2018 self who worked though this with a [friend](https://github.com/tara-johnson).

![Our solution](/assets/merge3.png)