package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите ниже число для определения 'Веса Числа'");
        int x;
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        System.out.println(x>10?(x/10+x%10):x);
        System.out.println("EnD");
    }
}
