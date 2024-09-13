package org.example;

public class Tigar extends Animal {
    public static int count;
    public Tigar (String name, int age, int maxRunDist, int maxSwimDist ){
        super(name, age, maxRunDist, maxSwimDist);
        count++;
    }
}
