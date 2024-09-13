package org.example;

    public class Rabbit extends Mammal{
        public static int count =0;
        public Rabbit(String name,int age, int maxRunDist, int maxSwimDist, int day) {
            super(name,age,maxRunDist, maxSwimDist, 38);
            count++;


        }
    }

