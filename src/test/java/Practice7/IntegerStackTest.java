package Practice7;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerStackTest {
    @Test
    public void test1(){
        IntegerStack stack = new IntegerStack();
        for (int i=0;i<5;i++)
            stack.push(i);
        System.out.println("After pushing 5 elements: " + stack);

        int element = stack.pop();
        System.out.println("Popped element = " + element);
        System.out.println("After popping 1 element: " + stack);

        int top = stack.peek();
        System.out.println("Peeked element = " + top);
        System.out.println("After peeking 1 element: " + stack);
    }

}