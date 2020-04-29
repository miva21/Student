package com.company;
/* task_5.2 Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).
 * Создайте объект класса Сat*/
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик",3,5,50);
        Cat cat1 = new Cat("Жужик",2,3,25);
        System.out.println("EnD");
    }
}
class Cat {
    public Cat(String name, int age, int weight, int strength) {
        System.out.println("Кот "+name+", "+age+" года, весит: "+weight+" кг. Бойцовский кот! силой "+strength+" ударов лапой!!");
    }
}
