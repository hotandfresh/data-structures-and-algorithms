# Kth From The End

# Summary
Given a value k, find the element at the kth index in a linked list.

[See the Code](src/main/java/linkedList/LinkedList.java)

[See the Tests](src/test/java/linkedList/LinkedListTest.java)

## Description
This solution uses a loop to find the length of the given linked list.  It then uses another loop to traverse up to that point and returns the element at the Kth index from the end.

## Approach & Efficiency
Time complexity is O(N) and space complexity is O(1).

## Solution
![Kth Element From End](/assets/kthFromEnd.png)

## Resources
Help for figuring out how to test exceptions was from [here](https://stackoverflow.com/questions/156503/how-do-you-assert-that-a-certain-exception-is-thrown-in-junit-4-tests)
