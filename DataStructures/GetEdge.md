# Get Edge

## Challenge
Given a graph and a list of cities, determine if a direct flight is possible for the entire trip

[See the Code](src/main/java/graph/getEdge.java)

[See the Tests](src/test/java/graph/getEdgeTest.java)

## Approach & Efficiency
Time complexity is O(N) because every city is visited and each of it's direct neighbors are checked. 

Space complexity is O(1) because no extra space is used in addition to the graph implementation itself.

## Solution
![find direct paths](/assets/getEdge.png)

## Methods
```getEdge```: takes in a graph and a list of cities.  It determines if there is a direct flight between each of the cities.  If there is, it will return true and the price for the entire itinerary.  Otherwise, it will return false.

## Acknowledgements
[HackerRank Tutorial](https://www.youtube.com/watch?v=zaBhtODEL0w&t=263s)
