package com.company;
public class Main {
    public static void main(String[] args) {
       /* Задание 3,2: Дан массив с числами.
       Проверьте, есть ли в нем два одинаковых числа подряд.
       Если есть - выведите 'да', а если нет - выведите 'нет'.
        */
        int ms[]={1,2,4,9,5,6,7,8,7,10};
                for (int i = 0; i < ms.length-1; i++) {
            if(ms[i]==ms[i+1]) {
                System.out.print("Да");
                System.exit(0);
            }
        }
        System.out.print("Нет");
    }
}
