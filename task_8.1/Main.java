/* Задача 8.1: Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке. Каждое слово - с новой строки. */
package com.company;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите 20 слов для сравнения и сортировки их \nв алфавитном порядке, каждое с новой строки...");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }
        sort(array);
        for (String word : array) {
            System.out.println(word);
        }
        System.out.println("EnD");
    }
    public static void sort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (isGreaterThan(array[j], array[i])) {
                    String ws = array[i];
                    array[i] = array[j];
                    array[j] = ws;
                }
            }
        }
    }
    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
