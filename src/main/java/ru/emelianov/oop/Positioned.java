package ru.emelianov.oop;

/**
 * Обозначает что объект позиционируемый,
 * т.е. знает своё местоположение и может его изменить
 *
 * @author mikhailemv
 * @since 02.11.2023
 */
public interface Positioned {

    /**
     * Текущее местоположение
     */
    Position getPosition();
}
