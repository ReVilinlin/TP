package org.example;

public class Cat implements Contestant {
    int maxHeight;
    int maxLenght;
    String name;

    public Cat(int maxHeight, int maxLenght, String name) {
        this.maxHeight = maxHeight;
        this.maxLenght = maxLenght;
        this.name = name;
    }
    @Override
    public boolean run(int dist) {
        if (dist <= maxLenght) {
            System.out.println("Кот " +this.name + " пробежал " + dist + " метров");
            return true;
        }
        else {System.out.println("Кот " +this.name + " упал и выбывает");
            return false;}

    }
    @Override
    public boolean jump(int altitude) {
        if (altitude<= maxHeight) {
            System.out.println("Кот "+this.name+ " перепрыгнул " + altitude  +" метров");
            return  true;
        }
        else {
            System.out.println("Кот "+this.name+ " не перепрыгнул и выбывает");
            return false;
        }
    }
}
