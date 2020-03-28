package exercises.Casino;

import java.util.Random;
import java.util.Scanner;

public class Casino {
    private int balance;
    Random rand = new Random();
    Scanner in = new Scanner(System.in);


    public Casino() {
        balance = 10000000;
    }

    public void play() {
        System.out.println("Select a game\n" + getBalance() + "\n1. Roulette");
        int gameChoice = in.nextInt();
        gameSelection(gameChoice);

    }

    public void gameSelection(int choice) {
        if (choice == 1) {

        } else {
            System.out.println("invalid choice");

        }
    }


    public static void main(String[] args) {
        Casino game = new Casino();
        game.play();

    }


// // //g&S

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
