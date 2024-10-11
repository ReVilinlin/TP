package org.example;

public class Human implements Contestant{
    private int maxHeight;
    private int maxLenght;
    String name;

    public Human(int maxHeight, int maxLenght, String name) {
        this.maxHeight = maxHeight;
        this.maxLenght = maxLenght;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMaxLenght() {
        return maxLenght;
    }

    @Override
    public boolean run(int dist) {
        if (dist <= maxLenght) {
            System.out.println(this.name + " пробежал " + dist + " метров");
            return true;
        }
        else {
            System.out.println(this.name + " упал и выбывает");
            return false;
        }
    }
    @Override
    public boolean jump(int altitude) {
        if (altitude<= maxHeight) {
            System.out.println(this.name+ " перепрыгнул " + altitude  +" метров");
            return  true;
        }
        else {
            System.out.println(this.name+ " не перепрыгнул и выбывает");
            return false;
        }
    }
}