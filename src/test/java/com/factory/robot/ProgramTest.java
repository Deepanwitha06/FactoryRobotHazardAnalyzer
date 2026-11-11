package com.factory.robot;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ProgramTest {

    @Test
    void shouldAcceptAndDisplayUserInputs() {
        String input = "0.5\n10\nCritical\n";

        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(output));

            Program.main(new String[]{});

            String result = output.toString();

            assertTrue(result.contains("Arm Precision: 0.5"));
            assertTrue(result.contains("Worker Density: 10"));
            assertTrue(result.contains("Machinery State: Critical"));

        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }
}