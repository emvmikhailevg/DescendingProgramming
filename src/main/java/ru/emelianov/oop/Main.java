package ru.emelianov.oop;

import ru.emelianov.oop.discord.DiscordBot;
import ru.emelianov.oop.telegram.MyTelegramBot;

/**
 * Задача: построить базовую архитектуру бота, который сможет работать в  telegram и ещё как минимум одной чат-бот
 * платформе (Discord, VK или др.).<br>
 * В качестве основного функционала бота можно возвращать в ответ текст, который отправил пользователь с пометкой от бота.<br>
 * Например "Ваше сообщение: <сообщение>".<br>
 * Нужно акцентировать внимание именно на архитектуре и интерфейсах.<br>
 *
 * @author mikhailemv
 * @since 03.11.2023
 */
public class Main {
    public static void main(String[] args) {
        Bot DiscordBot = new DiscordBot(System.getProperty("disToken"));
        Bot TelegramBot = new MyTelegramBot(System.getProperty("telToken"));
    }
}
