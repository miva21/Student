Задача 7,3
/* Задача: Разработать метод который возвращает дату пасхи.
Передаём в качестве параметра год. Метод возвращает дату пасхи в этом году.
Подсказка: воспользуйтесь алгоритмом Гаусса вычисления даты Пасхи.
*/
public class Main {
    public static void main(String[] args) {
        
    }
    static /* определите тип данных самостоятельно */ getEaster(){
      // Пишите код!
    }
}
************************
/* Задача 7.3: Разработать метод который возвращает дату пасхи.
Передаём в качестве параметра год. Метод возвращает дату пасхи в этом году.
Подсказка: воспользуйтесь алгоритмом Гаусса вычисления даты Пасхи.
*/
package com.company;
import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите год для определия дня Пасхи ==> ");
        int god = scan.nextInt();
        System.out.println("В указанном году Пасха ==> "+getEaster(god));
        System.out.println("EnD");
    }
    static LocalDate getEaster(int god) {
        int a = god % 19;
        int b = god % 4;
        int c = god % 7;
        int d = (19 * a + 15) % 30;
        int e = (2 * b + 4 * c + 6 * d + 6) % 7;
        int f = d + e;
        if (f <= 26) {
            int den = f + 4;
            int mes=04;
            return LocalDate.of(god,mes,den);
        }   else {
            return LocalDate.of(god,12,31);
        }
    }
}
