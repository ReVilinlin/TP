package org.example;

public class Road implements Challenge{

    String name;

    public Road(Distance distance) {
        this.name=distance.getRus();
        this.distance = distance.getDist();
    }
    int distance;
    @Override
    public boolean canCan(Contestant contestant) {
        if(contestant.run(distance)) return true;
        else return false;
    }

}
