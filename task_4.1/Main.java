package com.company;
import java.util.Scanner;

import static java.lang.Integer.min;

public class Main {
    public static void main(String[] args) {
       // Задача 4.1 Написать функцию, которая возвращает минимум из двух чисел.
        System.out.print("Введите первое число для сравнения ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.print("Введите второе число для сравнения ");
        int b = scan.nextInt();
        System.out.println(min(a,b));
        if (a>b) System.out.println("Минимальное число "+b);
        else if (a<b) System.out.println("Минимальное число "+a);
             else System.out.println("Упс..введеные числа равны!");
        System.out.println("EnD");
        }
}
