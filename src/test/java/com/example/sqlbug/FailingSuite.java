package com.example.sqlbug;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        IntegrationTest1.class,
        IntegrationTest2.class,
        IntegrationTest3.class
})
public class FailingSuite {
}
