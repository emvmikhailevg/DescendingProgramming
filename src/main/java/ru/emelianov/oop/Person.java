package ru.emelianov.oop;

/**
 * Человек
 *
 * @author mikhailemv
 * @since 02.11.2023
 */
public interface Person {

    /**
     * Текущее местоположение
     */
    Position getPosition();

    /**
     * Пройти до указанного места из текущего местоположения
     *
     * @param destination место назначения
     */
    void walk(Position destination);
    void useCar(Position destination);
}
