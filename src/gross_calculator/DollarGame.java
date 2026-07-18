package gross_calculator;

public class DollarGame {

    static boolean isADollar(int numOfPennies, int numOfNickels, int numOfDimes, int numOfQuarters) {
        /***************************************************
         Value of each coin
         ****************************************************/
        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.10;
        double quarter = 0.25;
        double dollar = 1.00;

        boolean won = false;

        // TODO: Your code goes here.
        if ((numOfPennies * penny + numOfNickels * nickel +
             numOfDimes * dime + numOfQuarters * quarter) == dollar) {
            won = true;
        }

        return won;
    }
}
