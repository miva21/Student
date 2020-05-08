/* Задача 6,8 Перехватить исключение (и вывести его на экран), указав его тип,
возникающее при выполнении кода:
int[] m = new int[2];
m[8] = 5; */
package com.company;
public class Main {
    public static void main(String[] args) {
        try {
            int[] m = new int[2];
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException sd) {
            sd.printStackTrace();
            System.out.println(sd.getMessage()+" -- Указано число вне размерности массива!!");
        }
    }
}
