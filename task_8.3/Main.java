package com.company;
/*  Задача 8,3
Перед решением прочтите https://www.codeflow.site/ru/article/java-buffered-reader
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,String> map=new HashMap<String, String>();
        while (true) {
            System.out.print("Введите город, или по окончании ввода наберите exit ==> ");
            String city=reader.readLine();
            if (city.equals("exit")) break;
            System.out.print("Введите фамилию ==> ");
            String family = reader.readLine();
            map.put(city,family);
        }
        System.out.println("Введите город для определения человека живущего в этом городе");
        String s = reader.readLine();
        System.out.println(map.get(s));
    }
}
