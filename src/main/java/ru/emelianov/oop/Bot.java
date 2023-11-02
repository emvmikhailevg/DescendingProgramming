package ru.emelianov.oop;

/**
 * Бот
 * @author mikhailemv
 * @since 03.11.2023
 */
public interface Bot {

    /**
     * Запуск бота
     */
    void run(String token);

    /**
     * Отправить сообщение
     * @param message сообщение
     * @param chatId id чата
     */
    void sendMessage(String message, long chatId);
}
