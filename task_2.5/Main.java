package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите ниже сумму вклада");
        double vkl, prc;
        Scanner scan = new Scanner(System.in);
        vkl = scan.nextDouble();
        System.out.println("Введите ниже %% который будет начисляться ежегодно");
        System.out.println("В течение 5 лет");
        prc = scan.nextDouble();
        for (int i=0; i<5; i++) {
            double itog =vkl+(vkl*prc/100.0);
            int god=i+1;
            System.out.println("Cумма вашего вклада с %% на "+god+" год составит "+itog);
            vkl = itog;
        }
        System.out.println("EnD");
    }
}
