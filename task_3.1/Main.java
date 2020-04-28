package com.company;
public class Main {
    public static void main(String[] args) {
        //Задание 3,1: Дан массив с числами. Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да', а если нет - выведите 'нет'.
        int[] cl={7, 4, 1, 10, 3, 6, 7, 3, 4, 2};
        int l=0,t=0;
        for (int i=0; i<cl.length; i++) {
            if (cl[i]==5) {
                System.out.println("Да");
                l=1;
            } else if (l==0) t=1;
                else t=0;
        } if(t==1 ) System.out.println("Нет");
          else System.out.println("EnD");
    }
}
