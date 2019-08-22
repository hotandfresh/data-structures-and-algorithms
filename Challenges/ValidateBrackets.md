# Validate Brackets

## Challenge

Given a string, check if its brackets are balanced.

[See the code](/Challenges/src/main/java/Challenges/MultiBracketValidation.java)

[See the tests](/Challenges/src/main/java/Challenges/MultiBracketValidationTest.java)

## Approach & Efficiency

This solution implements a hashmap that will store the opening brackets and its count.  Only one traversal is needed.  If the character is an opening brace, add it to the hashmap if it doesn't exist or increment its count if it exists.  If the character is a closing brace, decrement the count of its pair by one.

At the end, iterate through the hashmap and if any value is not 0, meaning a bracket didn't find a pair, return false.

Otherwise return true at the end because all braces have been matched.

The time efficiency for this solution is O(n) because the entire string is traversed

The space efficiency for this solution is O(n) because the entire string could be just opening brackets.

## Solution

![reverse array picture](/assets/bracketValidation.png)
