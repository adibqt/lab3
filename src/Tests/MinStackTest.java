package Tests;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
import tasks.MinStack;

public class MinStackTest {

    private MinStack stack;

    @Before
    public void setUp() {
        // Initialize a new MinStack before each test
        stack = new MinStack();
    }

    @Test
    public void testMinAfterPush() {
        // Test case 1: After pushing 3, 2, 5, 1, assert min = 1
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        assertEquals(1, stack.min());
    }

    @Test
    public void testMinAfterPop() {
        // Test case 2: After pushing 3, 2, 5, 1, and popping one element, assert min = 2
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        stack.pop(); // Pop the 1, now the minimum should be 2
        assertEquals(2, stack.min());
    }

    @Test
    public void testMinWithMultiplePushes() {
        // Test case 3: After pushing 1, 2, 3, 4, assert min = 1
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        assertEquals(1, stack.min());
    }

    @Test
    public void testMinWithDuplicateMinValues() {
        // Push duplicate minimum values to ensure correct behavior
        stack.push(2);
        stack.push(2);
        stack.push(3);
        assertEquals(2, stack.min());

        // Pop one 2, minimum should still be 2
        stack.pop();
        assertEquals(2, stack.min());

        // Pop the other 2, now the minimum should be 3
        stack.pop();
        assertEquals(3, stack.min());
    }

    @Test
    public void testMinOnEmptyStack() {
        // Test case when stack is empty, should throw exception or handle it safely
        try {
            stack.min(); // This should throw an exception
            fail("Should have thrown an exception");
        } catch (Exception e) {
            assertTrue(e instanceof java.util.EmptyStackException);
        }
    }
}
