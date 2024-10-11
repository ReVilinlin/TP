package org.example;

public class Robot implements Contestant, SuperJump {
    int maxHeight;
    int maxLenght;
    String name;

    private boolean superJumpCount = true;

    public Robot(int maxHeight, int maxLenght, String name) {
        this.maxHeight = maxHeight;
        this.maxLenght = maxLenght;
        this.name = name;


    }


    @Override
    public boolean run(int dist) {
        if (dist <= maxLenght) {
            System.out.println("Робот " + this.name + " пробежал " + dist + " метров");
            return true;
        } else {
            System.out.println("Робот " + this.name + " упал и выбывает");
            return false;
        }

    }

    @Override
    public boolean jump(int altitude) {
        if (altitude <= maxHeight) {
            System.out.println("Робот " + this.name + " перепрыгнул " + altitude + " метров");
            return true;
        }
        else if (superJumpCount(altitude, name, superJumpCount)) {
            this.superJumpCount = false;
            return true;
        }

        else {
            System.out.println("Робот " + this.name + " не перепрыгнул " + altitude + " и выбывает");
            return false;
        }

    }
}



