package ru.job4j.array;

import java.util.Arrays;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Владимир Золотухин";
        names[1] = "Ryabkov Sergey";
        names[2] = "Anatoliy Alexandrov";
        names[3] = "Сергей";
        Arrays.stream(names).forEach(System.out::println);
    }
}
