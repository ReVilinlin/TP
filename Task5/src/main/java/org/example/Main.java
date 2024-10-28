package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] arrayWord = {"Алебастр", "Гильотина", "Суета", "Просекко", "Алебастр", "Бульвар", "Реквием", "Дербент", "Сублимация", "Гильотина"};
        HashMap<String, Integer> listWord = new HashMap<>();
        for (String s : arrayWord) {
            listWord.put(s, listWord.getOrDefault(s, 0) + 1);
        }
        System.out.println(listWord.keySet());
        System.out.println(listWord.entrySet());

        System.out.println(" ");
        PhoneDirectory d = new PhoneDirectory();
        d.add("Волков", "+79356751129");
        d.add("Замятин", "+88005553535");
        d.add("Замятин", "+79359476633");
        d.add("Чайкина", "+7935569900");
        d.add("Чайкина", "+79998887766");
        d.add("Чеботарев", "+79119892444");
        d.add("Макова", "+79195078840");
        d.add("Лебедева", "+79186669900");
        d.add("Фадеев", "+79016074056");
        d.add("Понеева", "+79990001723");
        d.add("Лейтмотивов", "+88005553535");
        d.printAll();
        d.add("Шорохов", "+79119892444");


        System.out.println(d.get("Фадеев"));
        System.out.println(" ");

        d.printAll();

    }
}