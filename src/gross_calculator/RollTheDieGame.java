package gross_calculator;

import java.util.Random;

public class RollTheDieGame {

    static String playGame() {
        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        Random random = new Random();
        String tooLow = "You're on space %d. Sorry, you lose!";
        String tooHigh = "You've exceeded %d spaces. Sorry, you lose!";
        String justRight = "You're on space %d. Congrats, you win!";



        //TODO: Your code goes here.
        //Use the following for your return statements within the loop:

        for (int i = 1; i <= maxRolls; i++) {

            int roll = random.nextInt(6) + 1;
            currentSpace += roll;

            if (currentSpace == lastSpace) {
                return String.format(justRight, currentSpace);
            }

            if (currentSpace > lastSpace) {
                return String.format(tooHigh, lastSpace);
            }
        }

        return String.format(tooLow, currentSpace);
    }

}

