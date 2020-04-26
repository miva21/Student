package com.company;
import java.util.Scanner;
public class Main {
         public static void main(String[] args) {
             System.out.println("         Введите 10 чисел для определения");
             System.out.println("cамой длинной последовательности повторяющихся чисел");
             int scms=1, longS=1;
             int[] sc1 = new int[10];
                 for (int j=0; j<10; j++) {
                     Scanner scan = new Scanner(System.in);
                     sc1[j] = scan.nextInt();
                 }
             for (int j=0; j<10; j++) {
                 System.out.print(sc1[j]+" ");
             }
             System.out.println("<< Это введенные вами числа");
                 for (int j=0; j<9; j++) {
                     if (sc1[j] == sc1[j+1]) {
                         scms++;
                         if (longS < scms) longS = scms;
                     }
                     else scms =1;
                 }
             System.out.print("Cамая длинная последовательность повторяющихся чисел в списке ");
             System.out.println(longS);
             System.out.println("EnD");
         }
}
