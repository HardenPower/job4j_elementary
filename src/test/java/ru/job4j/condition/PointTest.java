package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static ru.job4j.condition.Point.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when01to22then2dot24() {
        double expected = 2.23;
        int x1 = 0;
        int y1 = 1;
        int x2 = 2;
        int y2 = 2;
        double output = distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus1Minus1ToMinus1Minus1then0() {
        double expected = 0;
        int x1 = -1;
        int y1 = -1;
        int x2 = -1;
        int y2 = -1;
        double output = distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus1Minus5to15then10dot19() {
        double expected = 10.19;
        int x1 = -1;
        int y1 = -5;
        int x2 = 1;
        int y2 = 5;
        double output = distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}