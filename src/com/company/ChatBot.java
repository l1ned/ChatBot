package com.company;

public class ChatBot {
    private final String name;

    public ChatBot (String name){
        this.name = name;
    }

    String[] keyword = {"birth", "weather", "food", "hobby", "age", "gender", "family", "culture", "friend", "movie"};
    String[] nice = {"love", "hug", "happy", "believe", "awesome", "amazing", "cool"};
    String[] mean = {"loser", "dumb", "hate", "suck", "die", "kill", "murder", "midget", "nazi", "depressed"};
}
