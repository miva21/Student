package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите ниже число");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        System.out.println(a==10?"Верно":"НеВерно");
        System.out.println("EnD");
    }
}
