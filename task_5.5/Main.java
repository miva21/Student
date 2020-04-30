package com.company;
/* Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
*Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
* Вывести объекты на экран.
* Примечание:
* Если написать свой метод String toString() в классе Human, то именно он будет использоваться при
* выводе объекта на экран.
* Пример вывода:
* Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
* Имя: Катя, пол: женский, возраст: 55
* Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...*/
public class Main {
    public static void main(String[] args) {
        Human katy = new Human("Катя",false,55,null,null);              //бабушка 1
        Human luda = new Human("Люда",false,75,null,null);              //бабушка 2
        Human pavel = new Human("Павел",true,65,null,null);             //дедушка 1
        Human kosty = new Human("Костя",true,68,null,null);             //дедушка 2
        Human misha = new Human("Михаил",true,27,kosty,luda);                      //Папа
        Human any = new Human("Аня",false,27,pavel,katy);                           //Мама
        Human igor = new Human("Игорь",true,2,misha,any);                           //ребенок 1
        Human gosh = new Human("Гоша",true,5,misha,any);                            //ребенок 2
        Human alla = new Human("Алла",false,7,misha,any);                           //ребенок 3
        System.out.println(any.toString());
        System.out.println(katy.toString());
        System.out.println(luda.toString());
        System.out.println(pavel.toString());
        System.out.println(kosty.toString());
        System.out.println(igor.toString());
        System.out.println(gosh.toString());
        System.out.println(alla.toString());
        System.out.println(misha.toString());
        }
    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;
        public Human(String name, boolean sex,int age,Human father,Human mother) {
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.father=father;
            this.mother=mother;
            
        }
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }
            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }
            return text;
        }
    }
}
