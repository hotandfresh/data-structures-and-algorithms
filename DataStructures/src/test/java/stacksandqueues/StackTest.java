package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void canInstantiateEmptyStack(){
        Stack<Integer> newStack = new Stack<>();

        //an empty stack will have a top that is null
        assertTrue(newStack.top == null);
    }

    @Test
    public void canPushOntoAStack(){
        Stack<Integer> newStack = new Stack<>();

        newStack.push(10);
        assertTrue(newStack.top.data == 10);
    }

    @Test
    public void canPushMultipleValuesOntoAStack(){
        Stack<Integer> newStack = new Stack<>();
        newStack.push(10);
        //this will be the top:
        newStack.push(666);

        assertTrue(newStack.top.data == 666);
    }

    @Test
    public void canPopOffTheStack(){
        Stack<Integer> newStack = new Stack<>();
        newStack.push(10);
        newStack.push(20);
        newStack.push(30);
        //this is the top and will be popped off:
        newStack.push(40);
        newStack.pop();
        //so the new top, after 40 is popped, will be 30
        assertTrue(newStack.top.data == 30);
    }

    @Test(expected = NullPointerException.class)
    public void canEmptyAStackAferMultiplePops(){
        Stack<Integer> newStack = new Stack<>();
        newStack.push(10);
        newStack.push(20);
        newStack.push(30);
        newStack.push(40);

        newStack.pop();
        newStack.pop();
        newStack.pop();
        newStack.pop();
        //if everything is popped off, there will be a null pointer exception
        System.out.println("last pop " + newStack.top.data);
    }

    @Test
    public void canReturnTopValueOfStack(){
        Stack<Integer> newStack = new Stack<>();
        newStack.push(10);
        newStack.push(20);
        newStack.push(30);
        //this is the top value:
        newStack.push(40);

        assertTrue(newStack.peek() == 40);
    }
}