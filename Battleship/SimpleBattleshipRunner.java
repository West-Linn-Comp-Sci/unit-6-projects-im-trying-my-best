
/**
 * Write a description of class SimpleBattleshipRunner here.
 *
 * @author Liam Groah
 * @version 5/5/21
 */
import java.util.Scanner;
import java.util.ArrayList;
public class SimpleBattleshipRunner
{
    public static void main(String[] args) {
        int guess;
        int guessNumber;
        int comGuess;
        int idx1;
        int idx2;
        int idx3;
        int comIdx1;
        int comIdx2;
        int comIdx3;
        int count = 0;
        int comCount = 0;
        int round = 0;
        double rating;
        
        Scanner in = new Scanner(System.in);
        SimpleBattleship battleship = new SimpleBattleship();
        SimpleBattleship comBattleship = new SimpleBattleship();
        idx1 = 1;
        idx2 = 2;
        idx3 = 3;
        comIdx1 = 0;
        comIdx2 = 1;
        comIdx3 = 2;
        battleship.grid.set(idx1, "x");
        battleship.grid.set(idx2, "x");
        battleship.grid.set(idx3, "x");
        comBattleship.grid.set(comIdx1, "x");
        comBattleship.grid.set(comIdx2, "x");
        comBattleship.grid.set(comIdx3, "x");
        System.out.println("Your Board:");
        System.out.println(battleship.getGrid());
        while(count < 3 && comCount < 3) {
        round++;
        System.out.println("Round " + round + ":");
        guessNumber = 0;
        System.out.print("Enter a guess: ");
        guessNumber = in.nextInt();
        guess = comBattleship.guess(guessNumber);
        comGuess = battleship.comGuess();
        System.out.println("Your opponent guessed " + comGuess + ".");
        if(guess == comIdx1 || guess == comIdx2 || guess == comIdx3) {
        System.out.println("Hit!");
        count++;
        }
        else
        System.out.println("Miss...");
        if(comGuess == idx1 || comGuess == idx2 || comGuess == idx3) {
        System.out.println("You were hit!");
        comCount++;
        }
        else
        System.out.println("Your opponent missed...");
    }
        if(count >= 3) {
        System.out.println("Your opponent's ship was sunk!");
        rating = battleship.rating(round);
        System.out.println("Your rating is " + rating + "/10.");
    }
        else if(comCount >= 3)
        System.out.println("Your ship was sunk!");
    }
}
