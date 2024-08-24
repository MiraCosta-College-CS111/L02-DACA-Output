import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

public class TestMain {
    @Test
    @DisplayName("No Tests")
    void noTests(TestReporter testReporter) {
        testReporter.publishEntry("There are no tests for this lab. Please submit your work before attempting the hacker challenge.");
    }

}