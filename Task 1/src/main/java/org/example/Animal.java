package org.example;

public abstract class Animal {
    protected String name;
    private int age;

    private int maxRunDist;
    private int maxSwimDist;


    static int count =0;


    public Animal(String name, int age, int maxRunDist, int maxSwimDist ){
        this.name = name;
        this.age = age;
        this.maxRunDist = maxRunDist;
        this.maxSwimDist = maxSwimDist;
        count++;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void run(int dist){
        if (dist<= this.maxRunDist){
            System.out.println(this.name + " пробежал "+ dist+ " метров");
        }
        else{
            System.out.println(this.name +" упал");

        }
    }

    public void swim(int swimDist){
        if (swimDist<= this.maxSwimDist){
        System.out.println(this.name + " проплыл "+ swimDist+ " метров");
    }
        else{
            System.out.println(this.name +" утонул");
        }

    }

}

