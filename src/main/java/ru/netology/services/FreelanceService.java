package ru.netology.services;

public class FreelanceService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int month = 0;
        for (int i = 1; i <= 12; i++) {
            if (money >= threshold) {
                money -= expenses;
                money /= 3;
                month++;
            } else {
                money = money + income - expenses;
            }

        }
        return month;
    }
}
