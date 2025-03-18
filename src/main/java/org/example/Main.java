package org.example;

import org.example.model.Game;
import org.example.model.User;
import org.example.util.GameHelper;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GameHelper gameHelper = new GameHelper(new Scanner(System.in));
        Game game = new Game(gameHelper);
        String userName = User.getUserInfo ();
        System.out.println(userName);

        game.run();
    }

}