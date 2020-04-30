package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Задача 4.3
        //Написать функцию, которая возвращает минимум из четырёх чисел. Функция min(a,b,c,d)
        // должна использовать (вызывать) функцию min(a,b) (которую вы разработали в задаче 4.1).
        System.out.print("Введите первое число для сравнения ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.print("Введите второе число для сравнения ");
        int b = scan.nextInt();
        System.out.print("Введите nретье число для сравнения ");
        int c = scan.nextInt();
        System.out.print("Введите четвертое число для сравнения ");
        int d = scan.nextInt();
        System.out.println(a==b&&d==c&&c==a?"Упс..введеные числа равны!":"Минимальное число "+minima(a,b,c,d));
        System.out.println("EnD");
    }
    static int minima(int a, int b, int c, int d) {
        a=minim(a,b);
        b=c;
        a=minim(a,b);
        b=d;
        a=minim(a,b);
        return a;
    }
    static int minim(int a, int b) {
        if (a>b) return b;
        else return a;
    }
}
