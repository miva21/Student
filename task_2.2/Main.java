package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите ниже 10 чисел массива");
        int[] sc1 = new int[10];
        for (int j = 0; j < 10; j++) {
            Scanner scan = new Scanner(System.in);
            sc1[j] = scan.nextInt();
            }
            int x=sc1[0];
            for (int j = 0; j < 10; j++) {
                if (sc1[j] > sc1[j++]) x=sc1[j];
                else x=sc1[j++];
                }
        System.out.println("Максимальное значение чисел этого массива = "+x);
        System.out.println("EnD");
    }
}
