package chess;

import boardgame.Board;

public class ChessMatch {
    private Board board;
    private int turn;
    private Color currentPlayer;
    private boolean check;
    private boolean checkMate;

    public ChessMatch() {
        board = new Board(8,8);
    }
    public ChessPiece[][] getPieces() {
        ChessPiece[][] pieces = new ChessPiece[board.getRows()][board.getColums()];
        for(int i = 0; i < board.getRows(); i++) {
            for(int j = 0; j < board.getColums(); j++) {
                pieces[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return pieces;
    }
}
