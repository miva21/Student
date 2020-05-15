package com.company;
/*  Задача 8.5
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.
Требования:
•	Программа должна считывать c консоли имя файла.
•	Создай и используй объект типа BufferedWriter.
•	Программа не должна ничего читать из файловой системы.
•	Программа должна считывать строки с консоли, пока пользователь не введет строку "exit".
•	Программа должна записать абсолютно все введенные строки (включая "exit") в файл, каждую строчку с новой строки.
•	Метод main должен закрывать объект типа BufferedWriter после использования.
•	Метод main не должен выводить данные на экран.
*/
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Укажите Имя файла здесь ==> ");
        String filename = bufferedReader.readLine();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));
        List<String> spisokstrok = new ArrayList<>();
        System.out.println("Введите ваши строки ниже. Для выхода введите exit");
        //System.out.println(filename);
        while (true) {
            String tixe = bufferedReader.readLine();
            spisokstrok.add(tixe);
            if (tixe.equals("exit")) {
                break;
            }
        }
        for (String stroka : spisokstrok) {
            bufferedWriter.write(stroka+"\n");
        }
        bufferedWriter.close();
        bufferedReader.close();
    }
}
