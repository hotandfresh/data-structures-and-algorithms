package Challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void canValidateStringsThatAreBalanced1(){
        String testString = "{}";
        MultiBracketValidation mbv = new MultiBracketValidation();
        boolean result = mbv.multiBracketValidation(testString);
        assertTrue(result);
    }

    @Test
    public void canValidateStringsThatAreBalanced2(){
        String testString = "(){}[[]]";
        MultiBracketValidation mbv = new MultiBracketValidation();
        boolean result = mbv.multiBracketValidation(testString);
        assertTrue(result);
    }

    @Test
    public void canValidateStringsThatAreBalanced3(){
        String testString = "()[[Extra Characters]]";
        MultiBracketValidation mbv = new MultiBracketValidation();
        boolean result = mbv.multiBracketValidation(testString);
        assertTrue(result);
    }

    @Test
    public void canValidateStringsThatAreBalanced4(){
        String testString = "{}{Code}[Fellows](())";
        MultiBracketValidation mbv = new MultiBracketValidation();
        boolean result = mbv.multiBracketValidation(testString);
        assertTrue(result);
    }

    @Test
    public void canValidateStringsThatAreBalanced5(){
        String testString = "{}(){}";
        MultiBracketValidation mbv = new MultiBracketValidation();
        boolean result = mbv.multiBracketValidation(testString);
        assertTrue(result);
    }

    @Test
    public void canValidateStringsThatAreNotBalanced1(){
        String testString = "[({}]";
        MultiBracketValidation mbv = new MultiBracketValidation();
        boolean result = mbv.multiBracketValidation(testString);
        assertFalse(result);
    }

    @Test
    public void canValidateStringsThatAreNotBalanced2(){
        String testString = "(](";
        MultiBracketValidation mbv = new MultiBracketValidation();
        boolean result = mbv.multiBracketValidation(testString);
        assertFalse(result);
    }

    @Test
    public void canValidateStringsThatAreNotBalanced3(){
        String testString = "{(})";
        MultiBracketValidation mbv = new MultiBracketValidation();
        boolean result = mbv.multiBracketValidation(testString);
        assertFalse(result);
    }

}