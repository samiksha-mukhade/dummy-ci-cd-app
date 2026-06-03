package com.practicedummy_ci_cd_app;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Equals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class HelloTest {

    @Test
    void testHelloMessage() {

        String actual = "Hello CI/CD";

        String expected = "Hello CI/CD";

        assertEquals(expected, actual);
    }
}
