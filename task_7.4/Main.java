/*Задача 7.4
Ввести с клавиатуры дату в формате "2013-08-18"
Вывести на экран введенную дату в виде "AUG 18, 2013".
Воспользоваться объектом Date и SimpleDateFormat. */
package com.company;
import java.text.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите дату в формате: ГГГГ-ММ-ДД ==> ");
        String date = scan.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date d = format.parse(date);
        SimpleDateFormat a = new SimpleDateFormat("MMM dd, yyyy",Locale.US);
        System.out.println(a.format(d).toUpperCase());
        System.out.println("EnD");
    }
}
