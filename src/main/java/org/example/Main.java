package org.example;

public class Main {
    //create
    static void runGame()
    {
        int round = 0;
        int numberOfRounds = 3;
        int playerCount = 3;

        while (round < numberOfRounds)
        {
            round += 1;
            System.out.println("One iteration");
        }
    }



    public static void main(String[] args) {
        //call
        runGame();

    }

}