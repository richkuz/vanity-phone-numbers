package com.example.vanity;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.fail;


/**
 * Unit test for Vanity.
 * <p/>
 * A unit test aims to test all code and code paths of a specific class.
 */
@ExtendWith(MockitoExtension.class)
public class VanityTest {

    @BeforeAll
    public static void setup() {
    }

    @AfterAll
    public static void tearDown() {
    }

    @Test
    public void testMain() {
        String[] args = {"1"};
        Vanity.main(args);
    }
}
