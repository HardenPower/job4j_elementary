package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static ru.job4j.loop.Counter.*;

class CounterTest {

    @Test
    void whenStart1ToFinish10Then55() {
        int start = 0;
        int finish = 10;
        int result = sum(start, finish);
        int expected = 55;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart3ToFinish8Then33() {
        int start = 3;
        int finish = 8;
        int result = sum(start, finish);
        int expected = 33;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart1ToFinish1Then1() {
        int start = 1;
        int finish = 1;
        int result = sum(start, finish);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart10ToFinish7Then0() {
        int start = 10;
        int finish = 7;
        int result = sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart100ToFinish106Then615() {
        int start = 100;
        int finish = 105;
        int result = sum(start, finish);
        int expected = 615;
        assertThat(result).isEqualTo(expected);
    }
}