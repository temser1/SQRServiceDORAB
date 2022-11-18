package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void testCalculator() {
        SQRService service = new SQRService();
        int actual = service.calculator(200, 300);
        int expected = 3;
        Assertions.assertEquals(actual, expected);
    }
}