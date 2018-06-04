package com.example.android.jokeprovider;

public class JokeProvider {

    private static String joke = "Q: How many programmers does it take to screw in a light bulb?\n" +
            "\n" +
            "A: None. It's a hardware problem.";

    public static String getJoke() {
        return joke;
    }
}
