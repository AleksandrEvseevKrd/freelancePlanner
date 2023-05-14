package ru.netology.services;

public class FreelanceService {
    public int calculate(int income, int expenses, int threshold) {
        int cash = 0;
        int result = 0;

        for (int i = 0; i < 12; i++) {
            if (cash >= threshold) {
                cash = cash - expenses;
                cash = cash / 3;
                result++;
            } else {
                cash = cash + income;
                cash = cash - expenses;
            }
        }

        return result;
    }
}
