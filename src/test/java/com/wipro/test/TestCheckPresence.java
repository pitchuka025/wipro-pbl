package com.wipro.test;

import com.wipro.task.DailyTasks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCheckPresence {

    @Test
    public void testCheckPresenceTrue() {
        DailyTasks dt = new DailyTasks();
        assertTrue(dt.checkPresence("hello world", "world"));
    }

    @Test
    public void testCheckPresenceFalse() {
        DailyTasks dt = new DailyTasks();
        assertFalse(dt.checkPresence("hello world", "planet"));
    }
}
