package exercises.Casino;

import java.util.Random;
import java.util.Scanner;

public class Roulette {
    Casino casinoCall;
    Random rand = new Random();
    Scanner in = new Scanner(System.in);

    public void roulette() {
        int betAmount;
        int winnings = 0;
        boolean win;
        String rb;//red/bule
        String eo = "odd";//even/odd

        while (true) {
            System.out.println("How much will you bet? Your balances is: " + casinoCall.getBalance());
            betAmount = in.nextInt();
            if (betAmount < casinoCall.getBalance()) {
                break;
            } else {
                System.out.println("You don't have that much");
            }
        }
        //The spin
        System.out.println("place your bet. Enter 0-37\n0-35 (x35)\n36=Even 37=Odd (x2)");
        int betBoard = in.nextInt();
        int winNum = rand.nextInt(36);
        if (winNum % 2 == 0) {
            eo = "even";
        }
        //results
        System.out.println("Winner is " + winNum + " " + eo);
        if (betBoard == winNum) {
            win = (true);
            winnings = betAmount * 35;
            casinoCall.setBalance(casinoCall.getBalance() + winnings);
        } else if ((betBoard == 36 && winNum % 2 == 0) || (betBoard == 37 && winNum % 2 == 1)) {
            win = (true);
            winnings = betAmount * 2;
            casinoCall.setBalance(casinoCall.getBalance() + winnings);
        } else {
            win = (false);
            casinoCall.setBalance(casinoCall.getBalance() - betAmount);
        }

        if (win == (true)) {
            System.out.println("You Win! " + winnings);
        } else {
            System.out.println("You lose :( " + betAmount);
        }

        ///Replay?
        System.out.println("Would you like to play again? Enter 1 for yes, 2 for main menu, anything else to exit");
        int playAgain = in.nextInt();
        if (playAgain == 1) {
            roulette();
        } else if (playAgain == 2) {
            casinoCall.play();
        }


    }





//    public static void roulette(Casino casino) {
//        int betAmount;
//        int winnings = 0;
//        boolean win ;
//        String rb;//red/bule
//        String eo="odd";//even/odd
//
//        while (true) {
//            System.out.println("How much will you bet? Your balances is: " + casino.getBalance());
//            betAmount = casino.in.nextInt();
//            if (betAmount < casino.getBalance()) {
//                break;
//            } else {
//                System.out.println("You don't have that much");
//            }
//        }
//        //The spin
//        System.out.println("place your bet. Enter 0-37\n0-35 (x35)\n36=Even 37=Odd (x2)");
//        int betBoard = casino.in.nextInt();
//        int winNum = casino.rand.nextInt(36);
//        if (winNum % 2 ==0){
//            eo="even";
//        }
//        //results
//        System.out.println("Winner is " + winNum + " " + eo);
//        if (betBoard==winNum){
//            win=(true);
//            winnings = betAmount*35;
//            casino.setBalance(casino.getBalance()+ winnings);
//        } else if ((betBoard==36 && winNum % 2==0) ||(betBoard==37 && winNum % 2==1)){
//            win=(true);
//            winnings = betAmount*2;
//            casino.setBalance(casino.getBalance() + winnings);
//        } else { win=(false);
//            casino.setBalance(casino.getBalance() - betAmount);
//        }
//
//        if (win==(true)) {
//            System.out.println("You Win! " + winnings);
//        } else {
//            System.out.println("You lose :( " + betAmount);
//        }
//
//        ///Replay?
//        System.out.println("Would you like to play again? Enter 1 for yes, 2 for main menu, anything else to exit");
//        int playAgain = casino.in.nextInt();
//        if (playAgain==1){
//            roulette(casino);
//        } else if (playAgain==2){
//            casino.play();
//        }
//
//
//
//    }
//

}