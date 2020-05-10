/* Задача 7,7
Добавить одну операцию по преобразованию типа, чтобы получался ответ: b = 0
float f = (float)128.50;
int i = (int)f;
int b = (int)(i + f);
public class Main {
    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (int) f;
        int b = (int) (i + f);
        System.out.println(b);
    }
} */
package com.company;
public class Main {
    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (int) f;
        int b1 = (int) (i + f);
        byte b = (byte) b1;
        System.out.println("float f = "+f+", \nint i = "+i+", \nint b1 = "+b1+", \nbyte b = "+b+"\nВеличина b == 0 !!");
        System.out.println("EnD");
    }
}
