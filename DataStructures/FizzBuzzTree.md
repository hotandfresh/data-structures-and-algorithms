# FizzBuzz Tree

# Summary
Given a tree as an argument, change the values of each node depending on whether or not that value is divisible by 3, 5 or by 3 and 5.  If it doesn't meet any of those requirements, leave it alone.s

[See the Code](src/main/java/tree/FizzBuzzTree.java)

[See the Tests](src/test/java/tree/FizzBuzzTreeTest.java)

## Description
This is a recursive solution that uses the in-order traversal method to check every node.  At each node, check if the value is divisible by 3 and 5, change it's value to "FizzBuzz". Change the value to "Buzz" if it's divisible by 5.  Change the value to "Fizz" if it's divisible by 3.  Finally, leave it alone if it doesn't meet any of those criteria.  Return an array list of all the values.

## Approach & Efficiency
Time complexity is O(N) because every node is visited, and space complexity is O(N) because a recursive call stack is used.

## Solution
![Fizz Buzz Tree](/assets/fizzBuzzTree.png)

