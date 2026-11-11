package com.factory.robot;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProgramTest {
    @Test
    void shouldDisplayHazardAnalyzerMessage() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        try {
            System.setOut(new PrintStream(output));
            Program.main(new String[]{});
            assertEquals("Factory Robot Hazard Analyzer" + System.lineSeparator(), output.toString());
        } finally {
            System.setOut(originalOut);
        }
    }
}