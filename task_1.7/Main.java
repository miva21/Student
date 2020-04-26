package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите ниже радиус круга") ;
        double radius=scan.nextDouble();
        double Pi=3.14;
        double L=2.0*Pi*radius;
        System.out.println("Длина окружности введенного радиуса равна: "+L);
    }
}
