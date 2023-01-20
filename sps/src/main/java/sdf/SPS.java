package sdf;

import java.util.Random;

public class SPS {
    public Integer generateComputerChoice() {
        Random rand = new Random();
        return rand.nextInt(3);
    }

    public String checkWinner(Integer playerChoice, Integer computerChoice) {
        String winner = "";
        playerChoice = playerChoice - 1;

        if (playerChoice.equals(computerChoice)) {
            System.out.println("Tie");
            return "";
        }

        switch(playerChoice) {
            case 1: //Scissors
                if (computerChoice == 1) {
                    winner = "player";
                } else {
                    winner = "computer";
                } 
                break;
            case 2: // Paper
                if (computerChoice == 2) {
                    winner = "player";
                } else {
                    winner = "computer";
                } 
                break;
            case 3: //Stone
                if (computerChoice == 0) {
                    winner = "player";
                } else {
                    winner = "computer";
                } 
                break;
        }
        return winner;
    }
    
}
