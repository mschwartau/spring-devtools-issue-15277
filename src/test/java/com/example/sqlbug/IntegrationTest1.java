package com.example.sqlbug;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class IntegrationTest1 {


    // spring devtools only closes the database, when  this @MockBean
    // field is present
    @MockBean
    private SomeClassToBeMockedInTests someClassToBeMockedInTests;

    @Test
    public void someTest() {
    }
}