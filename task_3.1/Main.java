package com.company;
public class Main {
    public static void main(String[] args) {
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
