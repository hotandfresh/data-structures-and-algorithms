# Validate Brackets

---
## Challenge

Given a string, check if its brackets are balanced.

[See the code](/Challenges/src/main/java/Challenges/MultiBracketValidation.java)

[See the tests](/Challenges/src/main/java/Challenges/MultiBracketValidationTest.java)

## Approach & Efficiency
After code review, it was determined that using a stack was the best data structure.

The idea is to iterate through the string and push all open braces into a stack.  If it's a closing brace, pop the top of the stack and check if it's the matching pair.  If it isn't, return false.  Otherwise, carry on and check the rest of the string.

Return true if the end of the string is reached and the matching pairs have been found.

### Original Solution Attempt:
This solution originally implemented a hashmap that stored the opening brackets and its count.  Only one traversal was needed.  If the character is an opening brace, add it to the hashmap if it doesn't exist, or increment its count if it exists.  If the character is a closing brace, decrement the count of its pair by one.

At the end, iterate through the hashmap and if any value is not 0, meaning a bracket didn't find a pair, return false.

Otherwise return true at the end because all braces have been matched.

This strategy was not able to account for this edge case: ```{(})```.  Simply counting the brackets did not work.

## Efficiency

The time efficiency for this solution is O(n) because the entire string is traversed.

The space efficiency for this solution is O(n) because the entire string could be all open braces, and each brace would be pushed into the stack.

## Solution

![bracket validation picture](/assets/bracketValidation.png)

## Resources

[This](https://www.thepolyglotdeveloper.com/2015/02/validate-bracket-parenthesis-combos-using-stacks/) walk through tutorial helped tremendously.
