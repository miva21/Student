package com.company;
/*  Задача 8,6
/*
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
*/
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //ВНИМАНИЕ!! ФАЙЛ К КОТОРОМУ ВЫ ОБРАЩАЕТЕСЬ ДОЛЖЕН БЫЛ БЫТЬ УЖЕ(!) СОЗДАН И НАХОДИТСЯ В БУФЕРЕ
        System.out.print("Укажите Имя файла здесь ==> ");
        String filename = bufferedReader.readLine();
        bufferedReader = new BufferedReader(new FileReader(filename));
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while (bufferedReader.ready()) {
            int number = Integer.parseInt(bufferedReader.readLine().trim());
            if (number % 2 == 0) {
                numbers.add(number);
            }
        }
        bufferedReader.close();
        Collections.sort(numbers);
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
