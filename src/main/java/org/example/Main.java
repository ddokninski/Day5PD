package org.example;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        var volvoTruck = new Truck(150);
        var scaniaTruck = new Truck(120);
        var superBoat = new Boat(100);
        var speedBoat = new Boat(200);
        var islander = new Human();
        var nolander = new Human();

        var superTruck = new Truck(150) {
            @Override
            public void move() {
                System.out.println("Im super truck I can drive with 350km/h");
            }
        };

        List<Mobile> testList = List.of(volvoTruck, scaniaTruck, speedBoat, superBoat, islander, nolander, superTruck);

        genericMethod(testList);
        Random random = new Random();
        testList.get(random.nextInt(testList.size())).move();

        print(() -> System.out.println("I cannot run at all"));

        introduce((name) -> System.out.println("hello " + name));

    }

    public static void print(Mobile mobile) {
        mobile.move();
    }

    public static void introduce(Talkable talkable) {
        talkable.sayHello("Jan");
    }

    public static <T extends Mobile> void genericMethod(List<T> genericList) {
        for (T t : genericList) {
            System.out.println(t instanceof Vehicle ? "To jest pojazd " + ((Vehicle) t).getMaxSpeed() : "To nie jest pojazd");
        }
    }
}