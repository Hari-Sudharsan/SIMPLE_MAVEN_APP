package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Apptest {

    @Test
    public void testAdd() {
        // Test case: 10 + 20 should be 30
        int result = App.add(10, 20);
        assertEquals(30, result, "10 + 20 should equal 30");
    }

    @Test
    public void testAddNegative() {
        // Additional test case: -5 + 5 should be 0
        int result = App.add(-5, 5);
        assertEquals(0, result, "-5 + 5 should equal 0");
    }
}
