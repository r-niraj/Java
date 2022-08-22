/*
Create a class Game, which allows a user to play "Guess the Number" game once.

Game should have the following methods:
Constructor to generate the random number
takeUserInput() to take a user input of number
isCorrectNumber() to detect whether the number entered by the user is true
getter and setter for noOfGuesses
Use properties such as noOfGuesses(int), etc to get this task done!
 */

package com.company;

import java.util.Random;
import java.util.Scanner;

class Game{
    Scanner sc = new Scanner(System.in);
    int random_num;
    int userIn,guess = 0;
    void randomNum(){
        Random ran = new Random();
        random_num = ran.nextInt(0,100); // will generate random number between 0 and 100
    }
    void takeUserInput(){
        System.out.print("Guess a number(0-100): ");
        userIn = sc.nextInt();
        if(userIn>100 || userIn<0){
            System.out.println("Bad Input(Try Again)");
            takeUserInput();
        }
    }

    int isCorrectNumber(){
        if(userIn==random_num) return 0;
        else if(userIn<random_num) return -1;
        else return 1;
    }
    void noOfGuesses(){
        ++guess;
    }
}

public class J28_GuessTheNumber_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game player = new Game();
        player.randomNum();

        while(true){
            player.takeUserInput();
            int check = player.isCorrectNumber();
            if(check==0){
                player.noOfGuesses();
                System.out.println("\t\tCongratulations!!!!!\n\t  You won with "+player.guess+" guesses");
                break;
            }
            else if(check==-1){
                player.noOfGuesses();
                System.out.println("Your guess is less than the Correct one");
            }
            else {
                player.noOfGuesses();
                System.out.println("Your guess is bigger than the Correct one");
            }
        }

    }
}
