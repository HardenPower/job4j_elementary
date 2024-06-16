package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2Then1() {
        int left = 4;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when1EqualTo2ThenAny() {
        int left = 10;
        int right = 10;
        int result = Max.max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To3Then3() {
        int left = 1;
        int right = 3;
        int middle = 2;
        int result = Max.max(left, middle, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To3To100Then100() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 100;
        int result = Max.max(a, b, c, d);
        int expected = 100;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when10To12Then12() {
        short left = 10;
        int right = 12;
        int result = Max.max(left, right);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when100To120Then120() {
        short left = 100;
        short right = 120;
        int result = Max.max(left, right);
        int expected = 120;
        assertThat(result).isEqualTo(expected);
    }
}