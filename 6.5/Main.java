/*Задача 6.5
 Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace. */
package com.company;
public class Main {
    public static void main(String[] args) {metod0();
    }
    public static String metod0() {metod1();
        return Thread.currentThread().getStackTrace()[0].getMethodName();
    }
    public static String metod1() {metod2();
        return Thread.currentThread().getStackTrace()[1].getMethodName();
    }
    public static String metod2() {metod3();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
    public static String metod3() {metod4();
        return Thread.currentThread().getStackTrace()[3].getMethodName();
    }
    public static String metod4() {
        return Thread.currentThread().getStackTrace()[4].getMethodName();
    }
}
