package ru.netology.sqr;

public class SQRService {

    public int calculate(int min, int max) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int ii = i * i;
            if (ii >= min) {
                if (ii <= max) {
                    counter++;

                }

            }

        }
        return counter;
    }
    public int calculate1(int min, int max) {
        int counter = 0;
        for (int i = 1; i <= 10; i++) {
            int ii = i * i;
            if (ii >= min) {
                if (ii <= max) {
                    counter++;

                }

            }

        }
        return counter;
    }
    public int calculate2(int min, int max) {
        int counter = 0;
        for (int i = 0; i <= 50; i++) {
            int ii = i * i;
            if (ii >= min) {
                if (ii <= max) {
                    counter++;

                }

            }

        }
        return counter;
    }
}