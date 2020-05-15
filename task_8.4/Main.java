package com.company;
/* Задача 8.4
Исправь 4 ошибки в программе, чтобы она компилировалась.
Требования:
•	Переменные объявленные в интерфейсе могут иметь только самый широкий уровень доступа(public).
•	Унаследоваться(extends) можно только от класса, для реализации интерфейсов используется ключевое слово implements.
•	Класс Hobby должен быть объявлен с модификатором доступа static.
•	Для доступа к переменной HOBBY нет необходимости создавать объект Dream.
•	Объявления интерфейсов не изменять.
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(Hobby.HOBBY.toString()); //Для доступа к переменной HOBBY нет необходимости 
                                                    //создавать объект Dream.
        System.out.println(new Hobby().toString());
    }
    interface Desire {                              //Объявления интерфейсов не изменять.
    }
    interface Dream {                               //Объявления интерфейсов не изменять.
        public static Hobby HOBBY = new Hobby();    //Переменные объявленные в интерфейсе могут иметь только самый широкий 
                                                    // уровень доступа(public).
    }
    static class Hobby implements Desire, Dream {   //Унаследоваться(extends) можно только от класса, 
                                                    //для реализации интерфейсов используется ключевое слово implements. 
                                                    //Класс Hobby должен быть объявлен с модификатором доступа static.
        static int INDEX = 1;
        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}
