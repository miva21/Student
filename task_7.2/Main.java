/*Задача 7.2
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используйте коллекции.
(Придётся погуглить коллекции)
*/
package com.company;
import java.util.*;
import java.text.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя месяца на английском языке ==>  ");
        String monthName = scan.nextLine();
        try {
            Date date = new SimpleDateFormat("MMMM", Locale.UK).parse(monthName);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            int monthNumber = cal.get(Calendar.MONTH)+1;
            System.out.println(monthName+" is the "+monthNumber+" month ");
        } catch (Exception e) {
          e.printStackTrace();
        }
    }
}
