package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static ru.job4j.condition.RectangleArea.*;

class RectangleAreaTest {

    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double output = square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP10K4Square4() {
        int expected = 4;
        int p = 10;
        double k = 4;
        double output = square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP25K7dot55Square16dot14() {
        double expected = 16.14;
        int p = 25;
        double k = 7.55;
        double output = square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}