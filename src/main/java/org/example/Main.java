package org.example;
import org.example.company.*;
import org.example.arge.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Car car = new Car(8, "Base car");

        System.out.println(car.startEngine());

        car.accelerate();

       car.brake();

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        System.out.println(mitsubishi.startEngine());

       mitsubishi.accelerate();

        mitsubishi.brake();

        Car ford = new Ford(6, "Ford Falcon");

        System.out.println(ford.startEngine());

         ford.accelerate();

        ford.brake();

        Car holden = new Holden(6, "Holden Commodore");

        System.out.println(holden.startEngine());

       holden.accelerate();

       holden.brake();
    }
}