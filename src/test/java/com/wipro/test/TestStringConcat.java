package com.wipro.test;

import com.wipro.task.DailyTasks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStringConcat {

    @Test
    public void testDoStringConcat() {
        DailyTasks tasks = new DailyTasks();
        assertEquals("Hello World", tasks.doStringConcat("Hello", "World"));
    }
}
