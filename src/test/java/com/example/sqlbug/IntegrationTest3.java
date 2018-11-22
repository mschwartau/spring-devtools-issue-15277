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
//@SqlGroup needed for the test to fail. If you remove it everything passes
@SqlGroup({
        @Sql(config = @SqlConfig(transactionMode = SqlConfig.TransactionMode.ISOLATED),
                executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD,
                scripts = {
                        "classpath:sql/Schema_clean.sql"})
})
public class IntegrationTest3 {


    // spring devtools only closes the database, when  this @MockBean
    // field is present
    @MockBean
    private SomeClassToBeMockedInTests someClassToBeMockedInTests;

    @Test
    public void someTest() {
    }
}