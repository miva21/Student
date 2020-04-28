package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Задача 4.2 Написать функцию, которая возвращает минимум из трёх чисел.
        System.out.print("Введите первое число для сравнения ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.print("Введите второе число для сравнения ");
        int b = scan.nextInt();
        System.out.print("Введите третье число для сравнения ");
        int c = scan.nextInt();
        System.out.println(a==b&&b==c?"Упс..введеные числа равны!":"Минимальное число "+minim(a,b,c));
        System.out.println("EnD");
    }
    static int minim(int a, int b, int c) {
        if (a<b) if (a<c) return a;
                 else return c;
        else if (b<c) return b;
        else if(a==b&&b==c) return a;
        else return c;
    }
}
