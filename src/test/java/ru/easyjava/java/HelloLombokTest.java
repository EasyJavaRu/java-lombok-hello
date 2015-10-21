package ru.easyjava.java;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class HelloLombokTest {

    @Test
    public void testHelloLombok() {
        assertThat(HelloLombok.greet(), is("10 greetings from Lombok"));
    }
}