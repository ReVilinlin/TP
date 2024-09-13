package org.example;


public class Cat extends Animal {
    public static int count;
    private static final int catMaxSwimDist = 0;
    public Cat(String name, int age, int maxRunDist) {
        super (name,age,maxRunDist, catMaxSwimDist);
        count++;

   }

}
