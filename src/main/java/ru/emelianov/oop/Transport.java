package ru.emelianov.oop;

/**
 * Транспорт
 * @author mikhailemv
 * @since 02.11.2023
 */
public interface Transport extends Positioned {

    /**
     * Сесть в транспорт
     *
     * @param passenger пассажир
     */
    void sitIn(Person passenger);

    /**
     * Доехать до указанного места из текущей позиции,
     * или до наиболее близкого места к указанному
     * @param destination конечная позиция
     */
    void moveTo(Position destination);

    /**
     * Выйти из транспорта пассажиру
     *
     * @param passenger пассажир
     */
    void leaveTransport(Person passenger);
}
