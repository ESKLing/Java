package com.eskl.todoapp.maths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MathsServiceTest {

    private MathsService mathsService;

    @BeforeEach
    void setUp() {
        mathsService = new MathsService();
    }

    @Test
    void addTwoNumbers() {
        // given
        int x = 1;
        int y = 3;
        // when
        int result = mathsService.addTwoNumbers(x, y);

        // then
        assertEquals(4, result);
    }

    @Test
    void addTwoNegativeNumbers() {
//         given
        int x = -1;
        int y = -3;
//         when
        int result = mathsService.addTwoNumbers(x, y);

//         then
        assertThat(result).isEqualTo(-4);
    }
}