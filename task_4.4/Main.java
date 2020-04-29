package com.company;
public class Main {
    public static void main(String[] args) {
        // Задача 4.4
        // Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
        String mmr[] = new String[3]; mmr[0]="Мама"; mmr[1]="Мыла"; mmr[2]="Раму";
        for(int i=0; i<mmr.length; i++) for(int j=0; j<mmr.length; j++) for(int g=0; g<mmr.length; g++) if(i!=j&&i!=g&&j!=g)
            System.out.println(mmr[i] + mmr[j] + mmr[g]);
        System.out.println("EnD");
    }
}
