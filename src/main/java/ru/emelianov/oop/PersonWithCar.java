package ru.emelianov.oop;

public class PersonWithCar implements Person {

    @Override
    public Position getPosition() { return null; }

    @Override
    public void walk(Position destination) {}

    @Override
    public void useCar(Position destination) {
        Transport car = new Car();
        car.move(destination);
    }
}
