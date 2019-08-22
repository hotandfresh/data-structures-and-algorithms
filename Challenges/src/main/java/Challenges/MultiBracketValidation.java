package Challenges;

import java.util.Stack;

public class MultiBracketValidation {
    public boolean multiBracketValidation(String input) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < input.length(); i++){
            //put all open braces into the stack
            if(input.charAt(i) == '(' || input.charAt(i) == '[' || input.charAt(i) == '{'){
                stack.push(input.charAt(i));
            } else if(input.charAt(i) == ')' || input.charAt(i) == ']' || input.charAt(i) == '}'){
                //if it's a closing brace, pop the top of the stack and see if it's the matching open brace
                char poppedBrace = stack.pop();
                //carry on if it's the right pair
                if(poppedBrace == '(' && input.charAt(i) == ')' ){
                    continue;
                } else if(poppedBrace == '[' && input.charAt(i) == ']'){
                    continue;
                } else if(poppedBrace == '{' && input.charAt(i) == '}'){
                    continue;
                } else {
                    //if it isn't, then the string is not balanced
                    return false;
                }
            }
        }
        return true;
    }
}
