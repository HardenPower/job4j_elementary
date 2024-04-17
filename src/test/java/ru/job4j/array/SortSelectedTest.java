package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {10, 18, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 10, 18};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {17, 19, 5, 24, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 5, 17, 19, 24};
        assertThat(result).containsExactly(expected);
    }
}