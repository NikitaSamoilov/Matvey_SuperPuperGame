package org.example.model;

import org.example.util.GameHelper;
import org.example.util.RandomGenerator;

public class Game {

    private final GameHelper gameHelper;
    private final GameParameter gameParameter = new GameParameter();
    private final User user;

    public Game(GameHelper gameHelper, User user) {
        this.gameHelper = gameHelper;
        this.user = user;
    }

    public void run() {
        boolean isSuccess = false;
        Range range = null;
        while (!isSuccess) {
            if (gameParameter.isMakeNewRange()) {
                range = RandomGenerator.buildRange();
            } else {
                gameParameter.setMakeNewRange(true);
            }
            System.out.println(String.format("Угадай число от %s до %s", range.getMin(), range.getMax()));

            int successNumb = range.makeSuccessNumb();
            System.out.println(String.format("Загаданное число: " + successNumb));
            isSuccess = gameHelper.isInt() ? gameHelper.processIntValue(successNumb, gameHelper.readNumb(), user) : processRange();
        }
    }

    private boolean processRange() {
        boolean isExit = gameHelper.processNoIntValue();
        if (!isExit) {
            gameParameter.setMakeNewRange(false);
        }
        return isExit;
   }



}
