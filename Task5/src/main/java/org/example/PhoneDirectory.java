package org.example;

import java.util.*;

public class PhoneDirectory {
    private final Map<String, List<String>> dir;

    public PhoneDirectory() {
        dir = new TreeMap<>(Comparator.reverseOrder());
    }
    
   public void add(String surname, String number) {
        for (String existingSurname : dir.keySet()) {
            List<String> numbers = dir.get(existingSurname);
            if (numbers.contains(number)) {
                numbers.remove(number);
                break;
            }
        }
        dir.computeIfAbsent(surname, k -> new ArrayList<>()).add(number);
    }



    public String get(String surname) {
        List<String> numbers = dir.get(surname);
        if (numbers != null) {
            return String.join(", ", numbers);

        } else {
            return "Номера не найдены";
        }
    }
    public void printAll() {
        System.out.println(dir.entrySet());
    }
}