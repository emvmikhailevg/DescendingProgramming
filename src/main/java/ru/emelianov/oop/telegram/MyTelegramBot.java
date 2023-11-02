package ru.emelianov.oop.telegram;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.request.SendMessage;
import ru.emelianov.oop.Bot;

/**
 * Бот для телеграмма, который высылает приветствие пользователю, а затем его сообщение
 * @author mikhailemv
 * @since 03.11.2023
 */
public class MyTelegramBot implements Bot {

    private TelegramBot botApi;
    public MyTelegramBot(String token) { run(token); }

    @Override
    public void run(String token) {
        new MyTelegramBot(token).setUpdatesListener(u -> {
            u.forEach(update -> {
                String reply = "Hey, I'm a bot, your message " + update.message().text();
                sendMessage(reply, update.message().chat().id());
            });
            return UpdatesListener.CONFIRMED_UPDATES_ALL;
        });
    }

    @Override
    public void sendMessage(String message, long chatId) {
        botApi.execute(new SendMessage(chatId, message));
    }
}
