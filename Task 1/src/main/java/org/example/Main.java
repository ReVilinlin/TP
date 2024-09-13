package org.example;


public class Main {
    public static void main(String[] args) {


        Animal[] animals = {
                new Cat("Mursic", 5, 200),
                new Tigar("Klementin", 4, 1000, 20),
                new Cat("Maxic", 2, 200),
                new Dog("bobic ", 1, 500, 10),
                new Rabbit("Krolik", 3, 300, 1, 38),
                new Tushkanchik("Tuskanchic", 2, 200, 1, 25),
                new Fox("Fox", 4, 200, 10, 65)
                };

        for (Animal a : animals) {
            a.run(300);
            a.swim(10);

            System.out.println();
        }

        ((Mammal) animals[4]).pregnancy();
        ((Mammal)animals[5]).pregnancy();
        ((Mammal)animals[6]).pregnancy();
        System.out.println();
         
//        Mammal[] mammals = {new Rabbit("Krolik", 3, 300, 1, 38),
//                new Tushkanchik("Tuskanchic", 2, 200, 1, 25),
//                new Fox("Fox", 4, 200, 10, 65)};
//        for (Mammal a : mammals) {
//            a.pregnancy();
//            System.out.println();
//        }

        new Rabbit("Krolik", 3, 300, 1, 38);
        System.out.println("Котов " + Cat.count);
        System.out.println("Собак " + Dog.count);
        System.out.println("Тигров " + Tigar.count);
        System.out.println("Тушканчиков " + Tushkanchik.count);
        System.out.println("Лис " + Fox.count);
        System.out.println("Кроликов " + Rabbit.count);
        System.out.println("Млекопитающих " + Animal.count);
        System.out.println("Всего " + Animal.count);


    }


}

