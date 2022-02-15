package com.teachmeskills.lesson14.task2;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.teachmeskills.lesson14.task2.Student.studentArray;

/**
 * 2. Создать коллекцию класса ArrayList со значениями имен всех студентов в группе
 * С помощью Stream'ов:
 * - Вернуть количество количество людей с вашим именем (вне зависимости от верхнего/нижнего регистра букв)
 * - Выбрать все имена, начинающиеся на "а" (вне зависимости от верхнего/нижнего регистра букв)
 * - Отсортировать и вернуть первый элемент коллекции или "Empty@, если коллекция пуста
 */

public class Main {
    public static void main(String[] args) {

        List<String> studentList = studentArray();

        System.out.println(studentList);

        Integer countName = Math.toIntExact(studentList.stream()
                .filter(n -> n.equalsIgnoreCase("andrian"))
                .count());
        System.out.println(countName);

        List <String> studentName = studentList.stream()
                .filter(n -> n.toUpperCase().startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(studentName);

        Optional<String> studentName1 = studentList.stream()
                .map(String::toUpperCase)
                .sorted()
                .findFirst();

        System.out.println(studentName1);
    }
}