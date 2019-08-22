package Challenges;

import java.util.HashMap;
import java.util.Map;

public class MultiBracketValidation {
    public boolean multiBracketValidation(String input) {
        HashMap<Character, Integer> HM = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ']' || input.charAt(i) == '}' || input.charAt(i) == ')') {
                if (HM.containsKey('[') && input.charAt(i) == ']') {
                    HM.put('[', HM.get('[') - 1);
                } else if (HM.containsKey('{') && input.charAt(i) == '}') {
                    HM.put('{', HM.get('{') - 1);
                } else if (HM.containsKey('(') && input.charAt(i) == ')') {
                    HM.put('(', HM.get('(') - 1);
                } else {
                    return false;
                }
            } else {

                if (HM.containsKey('[') && input.charAt(i) == '[') {
                    HM.put(input.charAt(i), HM.get(input.charAt(i)) + 1);
                } else if (HM.containsKey('{') && input.charAt(i) == '{') {
                    HM.put(input.charAt(i), HM.get(input.charAt(i)) + 1);
                } else if (HM.containsKey('(') && input.charAt(i) == '(') {
                    HM.put(input.charAt(i), HM.get(input.charAt(i)) + 1);
                } else if (input.charAt(i) == '[' || input.charAt(i) == '{' || input.charAt(i) == '(') {
                    HM.put(input.charAt(i), 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : HM.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }

}