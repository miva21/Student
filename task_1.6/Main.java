package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите ниже число которое нужно возвести в квадрат") ;
        int x=scan.nextInt();
        System.out.println("Квадрат введенного числа равен: "+(x*x));
    }
}
