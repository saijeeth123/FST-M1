package activities;

public class Activity1 {
    public static void main(String[] args) {
        Car skoda = new Car();
        skoda.make = 2014;
        skoda.color = "Black";
        skoda.transmission = "Manual";

        //Using Car class method
        skoda.displayCharacteristics();
        skoda.accelerate();
        skoda.brake();
        skoda.accelerate();
        }

    }

