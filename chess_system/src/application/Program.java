package application;

import chess.ChessMatch;
import chess.exceptions.ChessException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true){
           try {
               UI.clearScreen();
               UI.printBoard(chessMatch.getPieces());
           }
           catch (ChessException e) {
            System.out.println(e.getMessage());
            sc.nextLine();
           }
           catch (InputMismatchException e) {
               System.out.println(e.getMessage());
               sc.nextLine();
           }
           }
    }
}
