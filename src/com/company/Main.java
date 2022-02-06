package com.company;

public class Main {

    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        i--;
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        //Задача 2
        System.out.println("Задача 2");
        int firstFridayNumber = 7;
        for (int i2 = firstFridayNumber; i2 <= 31; i2 += 7) {
            System.out.println("Сегодня пятница, " + i2 + "-е число. Необходимо подготовить отчёт.");
        }
        System.out.println();

        //Задача 3
        System.out.println("Задача 3");
        int presentYear = 2022;
        int firstYear = presentYear - 200;
        int lastYear = presentYear + 100;
        for (int i3 = firstYear; i3 < lastYear; i3 += 79) {
            if (i3 > firstYear) {
                System.out.println(i3);
            }
        }
        System.out.println();
        //Задания повышенной сложности

        System.out.println("Задания повышенной сложности");
        //Задача 4
        System.out.println("Задача 4");
        String p = "";
        for (int i4 = 1; i4 <= 30; i4++) {
            if (i4 % 3 == 0) {
                p = " ping";
            }
            if (i4 % 5 == 0) {
                p = " pong";
            }
            if (i4 % 3 == 0 && i4 % 5 == 0) {
                p = " ping pong";
            }

            System.out.println(i4 + p);
            p = "";
        }
        //Задача 5
        System.out.println("Задача 5");
        int f1 = 0;
        int f2 = 1;
        int k = 0;
        for (int i5 = 0; i5 <= 10; i5++) {
            System.out.print(f1 + " ");
            System.out.print(f2 + " ");
            f1 = f1 + f2;
            f2 = f1 + f2;
            k += 2;
            if (k == 10) {
                break;
            }
        }
        System.out.println();

        //Задача 6
        System.out.println("Задача 6");
        int age = 19;
        int salary = 58_000;
        float limit;
        float mult = 0f;
        if (age >= 23) {
            if (salary >= 50_000 && salary < 80_000) {
                mult = 1.2f;
            }
            if (salary >= 80_000) {
                mult = 1.5f;
            }
            limit = 3 * salary * mult;
        } else {
            if (salary >= 50_000 && salary < 80_000) {
                mult = 1.2f;
            }
            if (salary >= 80_000) {
                mult = 1.5f;
            }
            limit = 2 * salary * mult;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
        System.out.println();

        // Задача 7
        System.out.println("Задача 7");
        float stavka = 0.10f;
        int age2 = 25;
        int salary2 = 60_000;
        int wantedSum = 330_000;
        String decision;
        double maxPlat = 0.5 * salary2;
        float creditPlat = 0f;
        if (age2 < 30) {
            stavka += 0.005;
            if (age < 23) {
                stavka += 0.01;
            }
        }
        if (salary2 > 80_000) {
            stavka -= 0.007;
        }
        creditPlat = (wantedSum + stavka * wantedSum) / 12;
        if (maxPlat > creditPlat) {
            decision = "Одобрено.";
        } else {
            decision = "Отказано.";
        }
        System.out.println("Максимальный платёж при ЗП " + salary2 + " равен " + maxPlat + " рублей.");
        System.out.println("Платёж по кредиту " + creditPlat + " рублей. Решение банка: " + decision);
    }
}
