package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите ниже число для сравнения");
        int x;
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        System.out.println(x%2==0?x+10:x*10);
        System.out.println("если число четное то программа вывела на экран число,");
        System.out.println("которое больше введенного с клавиатуры на 10");
        System.out.println("в противном случае вывелось на экран число в 10 раз больше введенного");
        System.out.println("EnD");
    }
}
