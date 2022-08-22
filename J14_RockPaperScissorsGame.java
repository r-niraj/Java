//Create a simple Rock, Paper Scissors game in Java. (#Use Conditional Statements)

package com.company;

import java.util.Random; // Here we import "Random" to generate random numbers by computer
import java.util.Scanner;

public class J14_RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int match;
        System.out.print("How many times you wanna play: ");
        match = in.nextInt();
        Random r = new Random();

        int userWon=0,compWon=0;
        while(match!=0){
            int compMove = r.nextInt(3); //here 3 means the range, the range of the random values are (0 to 2)
        /*
         we suppose,
         a = 0 = rock
         a = 1 = paper
         a = 2 = scissors
         */
            System.out.print("Enter your move: ");
            String userMove = in.next();

            if(compMove==0) //compMove = "rock";
            {
                if (userMove.equalsIgnoreCase("rock")) {
                    System.out.println("Re-match!");
                    match++;
                } else if (userMove.equalsIgnoreCase("paper")) {
                    System.out.println("WOW! User won this match!!");
                    userWon++;
                } else if (userMove.equalsIgnoreCase("scissors")) {
                    System.out.println("WOW! Computer won this match!!");
                    compWon++;
                }
            }
                else if(compMove==1) //compMove = "paper";
            {
                if (userMove.equalsIgnoreCase("paper")) {
                    System.out.println("Re-match!");
                    match++;
                } else if (userMove.equalsIgnoreCase("scissors")) {
                    System.out.println("WOW! User won this match!!");
                    userWon++;
                } else if (userMove.equalsIgnoreCase("rock")) {
                    System.out.println("WOW! Computer won this match!!");
                    compWon++;
                }
            }
                else //compMove = "scissors";
                {
                if(userMove.equalsIgnoreCase("scissors")) {
                    System.out.println("Re-match!");
                    match++;
                }
                else if(userMove.equalsIgnoreCase("rock")){
                    System.out.println("WOW! User won this match!!");
                    userWon++;
                }
                else if(userMove.equalsIgnoreCase("paper")){
                    System.out.println("WOW! Computer won this match!!");
                    compWon++;
                }
            }
            match--;
}
        if(compWon>userWon) System.out.println("Sorry! Computer won the game!!");
        else if(userWon>compWon) System.out.println("Congratulations! You won the game!!!!");
        else System.out.println("Game Tied :) ");
    }
}