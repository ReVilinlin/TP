package org.example;

public class Tushkanchik extends Mammal{
    public static int count =0;
    public Tushkanchik(String name,int age, int maxRunDist, int maxSwimDist, int day) {
        super(name,age,maxRunDist, maxSwimDist, 25);
        count++;


    }
}