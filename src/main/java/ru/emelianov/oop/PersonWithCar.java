package ru.emelianov.oop;

public class PersonWithCar implements Person {

    public Position getPosition() { return null; }

    public void walk(Position destination) {}

    public void useCar(Position destination) {
        Transport car = new Car();
        car.move(destination);
    }
}
