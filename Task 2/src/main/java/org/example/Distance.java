package org.example;

public enum Distance {
    SHORT("Короткая",10), AVERAGE("Средняя",50),LONG("Длинная",100);
    private String rus;
    private int dist;

    public String getRus(){
        return rus;
    }
    public int getDist(){
        return dist;
    }
    Distance(String rus, int dist){
        this.rus = rus;
        this.dist = dist;
    }

}
