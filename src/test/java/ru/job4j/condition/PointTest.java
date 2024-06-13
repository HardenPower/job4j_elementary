package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when01to22then2dot24() {
        Point a = new Point(0, 1);
        Point b = new Point(2, 2);
        double expected = 2.23;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus1Minus1ToMinus1Minus1then0() {
        Point a = new Point(-1, -1);
        Point b = new Point(-1, -1);
        double expected = 0;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus1Minus5to15then10dot19() {
        Point a = new Point(-1, -5);
        Point b = new Point(1, 5);
        double expected = 10.19;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}