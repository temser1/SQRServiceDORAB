package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void calculateTest(){
        SQRService service = new SQRService();
        int actual = service.calculate(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculate1Test(){
        SQRService service = new SQRService();
        int actual = service.calculate(81, 121);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculate2Test(){
        SQRService service = new SQRService();
        int actual = service.calculate(1000, 2000);
        int expected = 13;

        Assertions.assertEquals(expected, actual);
    }
}