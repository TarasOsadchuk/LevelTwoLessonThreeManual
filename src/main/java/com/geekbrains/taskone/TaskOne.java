package com.geekbrains.taskone;

import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TaskOne {

    /**
     * Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
     * Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
     * Посчитать, сколько раз встречается каждое слово.
     */

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Taras", "Andriy", "Anna", "Taras", "Oleg",
                "Inna", "Anna", "Vitaliy", "Taras", "Oleg");

        Set<String> unique = new HashSet<>(names);

        System.out.print("Unique names: ");
        System.out.println(unique);
        System.out.println("Frequency of occurrence names:");
        for (String key : unique) {
            System.out.println(key + " - " + Collections.frequency(names, key));
        }
    }
}