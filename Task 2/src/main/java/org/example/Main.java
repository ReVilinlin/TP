package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Contestant[] contestants = {
                new Human(20, 150, "Borya"),
                new Cat(15, 140, "Salem"),
                new Robot(70, 90, "R2-D2"),
                new Robot(100,10,"Wall-E"),
                new Robot(9, 50, "Eve")
        };
        Challenge[] challenges = {

                new Wall(Height.LOW),
                new Wall(Height.LOW),
                new Wall(Height.VERYHIGH),
                new Wall(Height.HIGH),


                new Road(Distance.AVERAGE),
                new Road(Distance.LONG),
                new Road(Distance.SHORT)
        };

        for(Contestant p: contestants) {
            for (Challenge c: challenges) {
                if (!c.canCan(p)) break;
            }
        }
    }
}