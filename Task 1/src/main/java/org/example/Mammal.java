package org.example;

 abstract class Mammal extends Animal {
    public int day;


    public Mammal (String name, int age,int maxRunDist,int maxSwimDist, int day){
        super(name,age, maxRunDist,maxSwimDist);
       this.day = day;

   }

    public void pregnancy(){
        System.out.println(this.name + " вынашивает "+ this.day+ " дней");
    }


}
