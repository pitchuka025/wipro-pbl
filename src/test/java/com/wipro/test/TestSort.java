package com.wipro.test;

import com.wipro.task.DailyTasks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestSort {

    @Test
    public void testSortValues() {
        DailyTasks dt = new DailyTasks();
        int[] input = {5, 2, 9, 1, 3};
        int[] expected = {1, 2, 3, 5, 9};
        int[] result = dt.sortValues(input.clone());
        assertArrayEquals(expected, result);
    }
}
