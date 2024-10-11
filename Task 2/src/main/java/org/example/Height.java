package org.example;

public enum Height {
    LOW("Низкое",15), HIGH("Высокое",10), VERYHIGH("Очень высокое",20000);
    private String rus;
    private int altitude;
    Height(String rus, int height){
        this.rus = rus;
        this.altitude = height;

    }
    public String getRus(){
        return rus;
    }
    public int getAltitude(){
        return altitude;
    }

}
