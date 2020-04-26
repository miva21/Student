package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите ниже два числа для определения максимального из них") ;
        double x=scan.nextDouble();
        double y=scan.nextDouble();
        if (x>y) System.out.println(x+" Больше "+y);
        if (x==y) System.out.println(x+" Равно "+y+" и их сумма составляет = "+(x+y));
        if (x<y) System.out.println(y+" Больше "+x);
        System.out.println("EnD");
    }
}
