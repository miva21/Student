package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double x = 0;
        System.out.println("Введите ниже 10 чисел массива");
        int[] sc1 = new int[10];
        for (int j = 0; j < 10; j++) {
            Scanner scan = new Scanner(System.in);
            sc1[j] = scan.nextInt();
        }
        for (double chisla : sc1) {
            x = x + chisla;
        }
        System.out.println("Cреднее арифметическое значение чисел этого массива = " + x/10.0);
        System.out.println("EnD");
    }
}
