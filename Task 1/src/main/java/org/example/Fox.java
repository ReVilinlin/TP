package org.example;

public class Fox extends Mammal{
    public static int count=0;
    public Fox(String name,int age, int maxRunDist, int maxSwimDist, int day) {
        super(name,age,maxRunDist, maxSwimDist, 65);
        count++;


    }
}