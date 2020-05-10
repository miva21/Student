/* Задача 7,5
Расставьте правильно операторы приведения типа, чтобы получился ответ: d > 0
int a = 0;
int b = (byte) a + 46;
byte c = (byte) (a*b);
double f = (char) 1234.15;
long d = (short) (a + f / c + b); */
package com.company;
public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = (byte) a + 46;
        byte c = (byte) (a * b);
        double f = (char) 1234.15;
        long d = (int) (a + f / c + b);
        System.out.println("int a = "+a+", \nint b = "+b+", \nbyte c = "+c+", \ndouble f = "+f+", \nlong d = "+d+"\nВеличина d больше ноля!!");
        System.out.println("EnD");
    }
}
