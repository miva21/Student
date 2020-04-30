package com.company;
public class Main {
    public static void main(String[] args) {
        /*Задача 5.3
        /* /* Реализовать метод boolean fight(Cat anotherCat):
* реализовать механизм драки котов в зависимости от их веса, возраста и силы.
* Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
* Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
* Если ничья и никто не выиграл, возвращаем либо true либо false, но должно выполняться условие:
* если cat1.fight(cat2) возвращает true,
* то cat2.fight(cat1) должен возвращать false. */
        Cat cat1 =new Cat( 5, 4, 70);
        Cat cat2 =new Cat(4, 3, 80);
        System.out.println((cat1.fight(cat2))?"В БОЮ ПОБЕДИЛ КОШАРА_1 ":"В БОЮ ПОБЕДИЛ КОШАРА_2");
        System.out.println("EnD");
            }
}
class Cat {
    public int age;
    public int weight;
    public int strength;
    public Cat(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }
    public boolean fight(Cat anotherCat) {
        int fcat1 = this.age+this.weight+this.weight; //Мощь cat1
        int fcat2 = anotherCat.age+anotherCat.weight+anotherCat.strength; //Мощь cat2
        if (fcat1>=fcat2) return true;
        else return false;
    }
}
