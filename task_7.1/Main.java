/* Задача 7.1
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false*/
package com.company;
import java.text.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws ParseException {
        String den = "MAY 1 2013";
        System.out.println(isDateOdd(den)==true?den+" = "+isDateOdd(den)+" -- Количество дней с начала года четное":den+" = "+isDateOdd(den)+" -- Количество дней с начала года нечетное");
    }
    public static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("MMM d yyyy", Locale.US);
        Date datem = format.parse(date);
        SimpleDateFormat format1 = new SimpleDateFormat("D"); // где D - день в году
        String dateN = format1.format(datem);
        int nom_dnja_v_godu = Integer.parseInt(dateN);
        if (nom_dnja_v_godu%2 == 0) {return true;}
        else {return false;}
    }
}
