package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class ExampleTest {

    @Test
    void exampleTest() {
        Assertions.assertFalse(new Random().nextInt() > 6);
    }
    @Test
    void exampleTest4() {
        Assertions.assertFalse(new Random().nextInt() > 6);
    }
}
