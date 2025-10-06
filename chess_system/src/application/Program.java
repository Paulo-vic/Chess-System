package application;

import chess.ChessMatch;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true){
        UI.printBoard(chessMatch.getPieces());
        }
    }
}
