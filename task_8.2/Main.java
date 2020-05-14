/* Задача 8,2
1. Расставь правильно наследование между Building(здание) и School(здание школы).
2. Подумай, объект какого класса должен возвращать методы getSchool и getBuilding.
3. Измени null на объект класса Building или School.*/
package com.company;
public class Main {
    public static void main(String[] args) {
        Building school = getSchool();
        Building shop = getBuilding();
        System.out.println(school+"\n"+shop+"\nEnD");
    }
    public static Building getSchool() {        //измените null на объект класса Building или School
        return new School();
    }
    public static Building getBuilding() {        //измените null на объект класса Building или School
        return new Building();
    }
    static class School /*Добавьте сюда ваш код*/ extends  Building {
        @Override
        public String toString() {
            return "School";
        }
    }
    static class Building /*Добавьте сюда ваш код*/ {
        @Override
        public String toString() {
            return "Building";
        }
    }
}
