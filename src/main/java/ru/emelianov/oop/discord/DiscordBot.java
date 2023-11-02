package ru.emelianov.oop.discord;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.entity.intent.Intent;
import ru.emelianov.oop.Bot;

/**
 * Бот для дискорда, который высылает приветствие пользователю, а затем его сообщение
 * @author mikhailemv
 * @since 03.11.2023
 */
public class DiscordBot implements Bot {

    private DiscordApi discordApi;
    public DiscordBot(String token) { run(token); }

    @Override
    public void run(String token) {
        discordApi = new DiscordApiBuilder().setToken(token).addIntents(Intent.MESSAGE_CONTENT).login().join();
        discordApi.addMessageCreateListener(e -> {
            if (!e.getMessageAuthor().isBotUser()) {
                sendMessage("Hey, I'm a bot, your message: " + e.getMessageContent(), e.getChannel().getId());
            }
        });
    }

    @Override
    public void sendMessage(String message, long chatId) {
        if (discordApi.getChannelById(chatId).isPresent()) {
            discordApi
                    .getChannelById(chatId)
                    .get()
                    .asTextChannel()
                    .ifPresent(channel -> channel.sendMessage(message));
        }
    }
}
