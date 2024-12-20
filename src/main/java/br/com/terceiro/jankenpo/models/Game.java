package br.com.terceiro.jankenpo.models;

import java.util.Random;

public class Game {
    public static Boolean isUserOptionValid(String userOption) {
        if (userOption.equals("rock") || userOption.equals("paper") || userOption.equals("scissors")) {
            return true;
        }
        return false;
    }

    private static String generateComputerOption() {
        String [] options = {"rock", "paper", "scissors"};
        Random random = new Random();
        return options[random.nextInt(options.length)];
    }

    public static String getWinner(String userOption) {
        if (! isUserOptionValid(userOption)) {
            throw new IllegalArgumentException("Invalid user option");
        }

        String computerOption = generateComputerOption();
        if (
            (userOption.equals("rock") && computerOption.equals("scissors")) ||
            (userOption.equals("paper") && computerOption.equals("rock")) ||
            (userOption.equals("scissors") && computerOption.equals("paper"))
        ) {
            return "User win!";
        } else if (userOption.equals(computerOption)) {
            return "Draw!";
        } else {
            return "Computer win!";
        }
    }
}
