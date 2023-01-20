package sdf;

import java.util.Scanner;

public class App {
   

    public static void main(String[] args) {
        String[] choice = {"scissors", "paper", "stone"};
        Integer computerChoice;
        String winner = "";

        Scanner scanner = new Scanner(System.in);

        SPS sps = new SPS();
        computerChoice = sps.generateComputerChoice();

        while (winner.equals("")) {
            System.out.println("Enter (1)Scissor, (2)Paper, or (3)Stone");
            int playerChoice = scanner.nextInt();

            if (!((playerChoice) >= 1 && (playerChoice <=3))){
                System.out.println("Invalid input: Only number between 1, 2 or 3 allowed");
                continue;
            } 
            winner = sps.checkWinner(playerChoice, computerChoice);
            if (winner.equalsIgnoreCase("")){
                System.out.println("It's a tie!");
            } else {
                System.out.println(winner + " wins.");
            }
        }
        scanner.close();
    }

}
