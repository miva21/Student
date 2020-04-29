package com.company;
// task_5.1 * Помогите коту обрести имя с помощью метода setName. */
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Жужик");
        System.out.println("Теперь котика зовут "+cat.name);
        System.out.println("EnD");
    }
}
class Cat {
    String name = "безымянный кот";
    public void setName(String name) {
        this.name=name;
        }
}
