package nl.ordina;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Assertions.assertThat(Calculator.add(2, 3)).isEqualTo(5);
    }

    public void testMultiply() {
        Assertions.assertThat(Calculator.multiply(2, 3)).isEqualTo(6);
    }
}