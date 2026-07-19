package objects;

import java.util.Random;

/***************************************************
 Write your answer here, and then test your code.
 Your job is populate a Bingo card.
 ****************************************************/

public class BingoCardAnswer {

    public static void main(String[] args) {
        BingoCard result = BingoCardAnswer.getBingoCard();
    }

    static BingoCard getBingoCard(){


        int[] b = generateColumn(1, 15);
        int[] i = generateColumn(16, 30);
        int[] n = generateColumn(31, 45);
        int[] g = generateColumn(46, 60);
        int[] o = generateColumn(61, 75);

        return new BingoCard(b, i, n, g, o);

    }

    /***************************************************
     Implement this method to create an array of 5 unique
     integers within the range of the parameters: min
     and max. Return the array.
     ***************************************************/
    private static int[] generateColumn(int min, int max){

        Random random = new Random();
        int count = 0;
        int entries = 5;
        // TODO: Initialize an array here
        int[] column = new int[entries];

        while (count < entries) {

            int number = random.nextInt(max - min + 1) + min; // up Java 17: int number = random.nextInt(min, max + 1);

            if (!elementExists(column, number)) {

                column[count] = number;
                count++;
            }

        }
        return column;
    }


    // Do not edit this method
    private static boolean elementExists(int[] array, int element){
        for(int i=0; i<array.length; i++){
            if(array[i] == element){
                return true;
            }
        }
        return false;
    }
}

// Do not edit this class
class BingoCard {
    private int[] b, i, n, g, o;

    public BingoCard(int[] b, int[] i, int[] n, int[] g, int[] o){
        setB(b);
        setI(i);
        setN(n);
        setG(g);
        setO(o);
    }

    public void setB(int[] numbers){
        b = numbers;
    }

    public void setI(int[] numbers){
        i = numbers;
    }

    public void setN(int[] numbers){
        n = numbers;
    }

    public void setG(int[] numbers){
        g = numbers;
    }

    public void setO(int[] numbers){
        o = numbers;
    }

    public int[] getB() {
        return b;
    }

    public int[] getI() {
        return i;
    }

    public int[] getN() {
        return n;
    }

    public int[] getG() {
        return g;
    }

    public int[] getO() {
        return o;
    }

    public void printCard() {
        System.out.println(" B  I  N  G  O");
        for (int row = 0; row < 5; row++) {
            System.out.printf("%2d %2d %2d %2d %2d%n", b[row], i[row],  n[row], g[row], o[row]);
        }
    }

}






