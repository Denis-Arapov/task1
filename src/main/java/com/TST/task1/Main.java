package com.TST.task1;

import com.TST.task1.entities.enums.Gender;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.*;


public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

       /* MyList<String> list = new MyList<String>();
        list.add("fffff");
        list.add("aaaaa");
        list.add("bbbbb");
        list.bubbleSort(new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }*/
        MyList<Person> list = new MyList<Person>();
        Person person;
        int index;
        try {
            while (true) {
                System.out.println("Что сделать с массивом \n 1 добавить элемент \n 2 вернуль элемент по индексу \n 3 удалить элемент по индексу " +
                        "\n 4 вставить элемент по индексу \n 5 изменить элемент по индексу \n 6 сортировка по Фио \n 7 сортировка по возрасту \n 8 Вывести массив");
                int n = Integer.parseInt(reader.readLine());
                switch (n) {
                    case (1):
                        person = inputPerson();
                        list.add(person);
                        break;
                    case (2):
                        System.out.println("Введите индекс");
                        index = Integer.parseInt(reader.readLine());
                        if (list.getSize() > index)
                            System.out.println(list.get(index).toString());
                        else
                            break;
                        break;
                    case (3):
                        System.out.println("Введите индекс");
                        index = Integer.parseInt(reader.readLine());
                        if (list.getSize() > index)
                            System.out.println(list.remove(index).toString());
                        else
                            break;
                        break;
                    case (4):
                        System.out.println("Введите индекс");
                        index = Integer.parseInt(reader.readLine());
                        person = inputPerson();
                        if (list.getSize() > index)
                            list.insert(index, person);
                        else
                            break;
                        break;
                    case (5):
                        System.out.println("Введите индекс");
                        index = Integer.parseInt(reader.readLine());
                        person = inputPerson();
                        if (list.getSize() > index)
                            list.set(index, person);
                        else
                            break;
                        break;
                    case 6:
                        list.bubbleSort(Person.compareByFio);
                        break;
                    case 7:
                        list.bubbleSort(Person.compareByAge);
                        break;
                    case 8:
                        for (int i = 0; i < list.getSize(); i++) {
                            System.out.println(list.get(i).toString());
                        }
                        break;
                    default:
                        System.out.println("Введённое значение некорректно");
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод для ввода данных о еловеке
     *
     * @return Объект класса Person
     */
    static public Person inputPerson() {
        try {
            int month;
            int day;
            LocalDate date;
            System.out.println("Введите имя");
            String firstName = reader.readLine();
            System.out.println("Введите фамилию");
            String lastName = reader.readLine();
            System.out.println("Введите год рождения");
            int year = Integer.parseInt(reader.readLine());
            do {
                System.out.println("Введите месяц");
                month = Integer.parseInt(reader.readLine());
            } while (month > 12 || month < 0);
            do {
                System.out.println("Введите день");
                day = Integer.parseInt(reader.readLine());
            } while (day > 31 || day < 0);
            date = LocalDate.of(year, month, day);
            System.out.println("Введите пол true = муж, false = жен");
            boolean b = Boolean.parseBoolean(reader.readLine());
            Gender gender;
            if (b)
                gender = Gender.MALE;
            else
                gender = Gender.FEMALE;
            return new Person(firstName, lastName, date, gender);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}


