package com.company;
public class Main {
    public static void main(String[] args) {
        //Задание 3,1: Дан массив с числами. Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да', а если нет - выведите 'нет'.
        int[] cl={7, 4, 1, 10, 3, 6, 7, 3, 4, 2};
        int t=0;
        for (int i=0; i<cl.length; i++) {
            if (cl[i]==5) {
                System.out.println("Да");
                System.exit(0);
            } else t=1;
        }
        if(t==1) System.out.println("Нет");
    }
}
