# Tree Intersection

## Challenge
Return the first word that is repeated in a lengthy string.

[See the Code](src/main/java/tree/TreeIntersection.java)

[See the Tests](src/test/java/tree/TreeIntersectionTest.java)

## Approach & Efficiency
Time Complexity is O(n) because every node needs to be visited and compared.

Space Complexity is O(n) because an additional list was used to store nodes found in both trees. Every node from one tree could have been found in the other tree. 

## Solution
![tree intersection](/assets/treeIntersection.png)

## Methods
```treeIntersection```: takes in two binary trees and its respective root nodes. It utilizes the the inOrder traversal to check all the nodes of both trees. Then both array lists are checked against one another. If there are common values, put them in the third array list, which is the result that is returned from the method.

## Acknowledgements
Regex was taken from [here](https://stackoverflow.com/questions/7384791/splitting-strings-through-regular-expressions-by-punctuation-and-whitespace-etc)
