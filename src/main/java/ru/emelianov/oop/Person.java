package ru.emelianov.oop;

/**
 * Человек
 *
 * @author mikhailemv
 * @since 02.11.2023
 */
public interface Person extends Positioned {

    /**
     * Пройти до указанного места из текущего местоположения
     *
     * @param destination место назначения
     */
    void walk(Position destination);
}
