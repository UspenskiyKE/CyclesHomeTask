package com.company;

public class Main {

    public static void main(String[] args) {

	// Задача 1
        System.out.println("Задача 1");
        int i=1;
        while (i<=10) {
            System.out.print(i+" ");
            i++;
        }
        i--;
        System.out.println();
        for(;i>0;i--) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println();

        //Задача 2
        System.out.println("Задача 2");
        int firstFridayNumber=7;
        for(int i2=firstFridayNumber;i2<=31;i2+=7) {
            System.out.println("Сегодня пятница, "+i2+"-е число. Необходимо подготовить отчёт.");
        }
        System.out.println();

        //Задача 3
        System.out.println("Задача 3");
        int presentYear=2022;
        int firstYear=presentYear-200;
        int lastYear=presentYear+100;
        for(int i3=firstYear;i3<lastYear;i3+=79) {
            if (i3>firstYear) {
            System.out.println(i3); }
        }
    }
}
