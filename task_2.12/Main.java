package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите ниже числа для определения остатка от деления");
        int a,b;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println(a%b==0?"Делится. Частное = "+a/b:"Делится с остатком. Остаток от деления = "+a%b);
        System.out.println("EnD");
    }
}
