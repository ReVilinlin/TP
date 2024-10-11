package org.example;

public class Wall implements Challenge{
    private int height;
    public Wall(Height height) {
        this.altitude = height.getAltitude();
        this.title = height.getRus();

    }
    int altitude;
    String title;
    @Override
    public boolean canCan(Contestant contestant) {
        if (contestant.jump(altitude)) {
            return true;
        }
        else return false;
    }
}
