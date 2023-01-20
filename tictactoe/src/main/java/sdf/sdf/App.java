package sdf;

import java.util.Scanner;

public final class App {

    public static void main(String[] args) {

        String[] tttBoard = new String[9];
        
        //Player X & O
        String player = "X";

        //Populating the ttt board with 1 to 9
        for (int i = 0; i < 9; i++){
            tttBoard[i] = String.valueOf(i+1);
        }

        //Instantiating and printing initial board
        TicTacToe ttt = new TicTacToe();
        ttt.printBoard(tttBoard);

        Scanner scanner = new Scanner(System.in);

        String winner = "";
        while(winner == "") {
            // play tic-tac-toe logic here...
            System.out.println("Tic-Tac-Toe game");
            System.out.println("-------------------");
            System.out.println(player + " will play now");

            Integer input;

            System.out.println("Player " + player + " enter your position: ");
            input = scanner.nextInt();

            // only accept keyboard input 1 to 9
            if((input > 0) && (input < 10)) {

            } else {
                System.out.println("Invalid input: Only number 1 to 9 is allowed.");
                continue;
            }

            // assign X or O to position / detect the next player's turn
            // below if condition checks if the particular square in grid has been filled; if array 0 contains 1 means no X or O filled it up
            if((tttBoard[input-1]).equals(String.valueOf(input))){
                tttBoard[input-1] = player;

                // switch to another player's turn
                if(player.equalsIgnoreCase("X")){
                    player = "0";
                } else {
                    player = "X";
                }
            } else {
                System.out.println("Position already taken up. Please enter another position number");
            }

            ttt.printBoard(tttBoard);
            winner = ttt.checkWinner(tttBoard);

            if (winner.equalsIgnoreCase("draw")) {
                System.out.println("It's a draw!");
            } else {
                System.out.println(winner + " is the winner!");
            }
        }
        scanner.close();
    }
}
