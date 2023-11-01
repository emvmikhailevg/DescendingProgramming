package ru.emelianov.oop;

public interface Transport {

    /**
     * Передвижение на транспорте
     * @param destination место назначения
     */
    void move(Position destination);
}
