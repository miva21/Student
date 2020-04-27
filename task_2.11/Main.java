package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите ниже число для определения 'Четверти Часа'");
        int minut;
        Scanner scan = new Scanner(System.in);
        minut = scan.nextInt();
        if (minut<=15) System.out.println("Первая четверь часа");
            if (minut>15 && minut<=30) System.out.println("Вторая четверь часа");
                if (minut>30 && minut<=45) System.out.println("Третья четверь часа");
                    if (minut>45) System.out.println("Последняя четверь часа");
        else
        System.out.println("EnD");
    }
}
