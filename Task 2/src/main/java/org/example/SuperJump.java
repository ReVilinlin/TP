package org.example;

public interface SuperJump {
    default boolean superJumpCount(int altitude, String name, boolean conter_superjump) {
        if (conter_superjump) {
            System.out.println("Робот " + name +" перепрыгнул препятствие в "+altitude +" метров используя SuperJump");
            return true;
        }
        else {
            return false;
        }
    }
}
