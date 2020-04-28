package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Задача 4.1 Написать функцию, которая возвращает минимум из двух чисел.
        System.out.print("Введите первое число для сравнения ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.print("Введите второе число для сравнения ");
        scan = new Scanner(System.in);
        int b = scan.nextInt();
        System.out.println(a==b?"Упс..введеные числа равны!":"Минимальное число "+minim(a, b));
        System.out.println("EnD");
    }
    static int minim(int a, int b) {
        if (a>b) return b;
        else return a;
    }
}
