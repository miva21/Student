package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Задача 4.6 (EPIC LVL)
        //Ввести с клавиатуры год, определить количество дней в году.
        // Результат вывести на экран в следующем виде:
        //количество дней в году: x, где х - 366 для високосного года,
        //х - 365 для обычного года.
        System.out.println("Введите год для определения високосности ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a%400==0) System.out.println("количество дней в году: 366 дней");
        else if (a%100==0) System.out.println("количество дней в году: 365 дней");
        else if (a%4==0) System.out.println("вколичество дней в году: 366 дней");
        else System.out.println("количество дней в году: 365 дней");
        System.out.println("EnD");
    }
}
