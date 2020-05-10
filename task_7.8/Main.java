/* Задача 7,8
Добавить одну операцию по преобразованию типа, чтобы на экран вывелось 9
short number = 9;
char zero = '0';
int nine = (zero + number);
public class Main {
    public static void main(String[] args) {
        short number = 9;
        char zero = '0';
        int nine = (zero + number);
        System.out.println(nine);
    }
}
*/
package com.company;
public class Main {
    public static void main(String[] args) {
        short number = 9;
        char zero = '0';
        char nine = (char) (zero + number);
        System.out.println(nine);
        System.out.println("short number = "+number+", \nchar zero = "+zero+", \nchar nine = "+nine+"\nВеличина nine == 9 !!");
        System.out.println("EnD");
    }
}
