package sdf;

import java.util.Arrays;

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
    }


    public String checkWinner(String[] board) {
        String line = "";
        String winner = "";

        int i = 0;
        while (i < 8) {
            switch(i) {
                case 0: line = board [0] + board [1] + board [2];
                    break;
                case 1: line = board [3] + board [4] + board [5];
                    break;
                case 2: line = board [6] + board [7] + board [8];
                    break;
                case 3: line = board [0] + board [3] + board [6];
                    break;
                case 4: line = board [1] + board [4] + board [7];
                    break;
                case 5: line = board [2] + board [5] + board [8];
                    break;
                case 6: line = board [0] + board [4] + board [8];
                    break;
                case 7: line = board [2] + board [4] + board [6];
                    break;
            } 
            i++;

            if (line.equals("XXX")){
                winner = "X";
                i = 9; //set i = 9 meaning if there is a winner, i will become 9; it will not go into the while loop
            } else if (line.equalsIgnoreCase("000")){
                winner = "0";
                i = 9;
            } else {
                for (int a = 0; a < 9; a ++){
                    if (Arrays.asList(board).contains(String.valueOf(a+1))) {
                        //above method converts array to list to see if it contains any numeric no. 1-9, if it does, break from for loop
                        break;
                    } else if (a == 8) {
                        winner = "draw";
                    }
                }
            }
        }
        
        return winner;
    }

    
}
