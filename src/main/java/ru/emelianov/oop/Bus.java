package ru.emelianov.oop;

/**
 * Класс автобуса
 * @author mikhailemv
 * @since 02.11.2023
 */
public class Bus implements Transport {

    public Bus(String number, Person person) {}

    @Override
    public Position getPosition() { return null; }

    @Override
    public void sitIn(Person passenger) {}

    @Override
    public void moveTo(Position destination) {}

    @Override
    public void leaveTransport(Person passenger) {}
}
