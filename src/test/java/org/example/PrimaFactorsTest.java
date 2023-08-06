package org.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimaFactorsTest {
    @Test
    public void getPrimesOf(){
        assertGivenNumberGetList(0, List.of());
        assertGivenNumberGetList(1, List.of());
        assertGivenNumberGetList(2, List.of(2));
        assertGivenNumberGetList(3, List.of(3));
        assertGivenNumberGetList(4, List.of(2, 2));
        assertGivenNumberGetList(5, List.of(5));
        assertGivenNumberGetList(6, List.of(2, 3));
        assertGivenNumberGetList(8, List.of(2, 2, 2));
        assertGivenNumberGetList(9, List.of(3, 3));
        assertGivenNumberGetList(10, List.of(2, 5));
        assertGivenNumberGetList(18, List.of(2, 3, 3));
        assertGivenNumberGetList(25, List.of(5, 5));
        assertGivenNumberGetList(64, List.of(2, 2, 2, 2, 2, 2));
        assertGivenNumberGetList(74, List.of(2, 37));
    }

    private void assertGivenNumberGetList(int number, List<Integer> expectedList) {
        List<Integer> resultList = PrimaFactors.getPrimesOf(number);
        assertEquals(expectedList, resultList);
    }
}
