# Get Edge

## Challenge
Given a graph and a list of cities, determine if a direct flight is possible for the entire trip

[See the Code](src/main/java/graph/GetEdge.java)

[See the Tests](src/test/java/graph/GetEdgeTest.java)

## Approach & Efficiency
Time complexity is O(N) because every city is visited and each of it's direct neighbors are checked. 

Space complexity is O(1) because no extra space is used in addition to the graph implementation itself.

## Solution
The idea is to iterate over the list of cities. If the city and the next city is on the flight itinerary, then get all the neighbors of the current city.  Look through all those neighbors and see if the next city on the flight itinerary is any of them.  If it is a neighbor, then there is a direct flight, so add it's weight to the total cost of the flight.

If the next city is not on the list of neighbors, then there is no direct flight.  Therefore a direct flight between all cities is not possible, in which case, return False and $0.

![find direct paths](/assets/getEdge.png)

## Methods
```getEdge```: takes in a graph and a list of cities.  It determines if there is a direct flight between each of the cities.  If there is, it will return true and the price for the entire itinerary.  Otherwise, it will return false.

## Acknowledgements
[HackerRank Tutorial](https://www.youtube.com/watch?v=zaBhtODEL0w&t=263s)
