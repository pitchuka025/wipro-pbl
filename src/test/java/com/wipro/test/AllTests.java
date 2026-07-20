package com.wipro.test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({TestSort.class, TestCheckPresence.class, TestStringConcat.class})
public class AllTests {

}
