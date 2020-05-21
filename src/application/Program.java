
package application;

import chess.ChessMatch;
/**
 *
 * @author Roberto
 */
public class Program {
    
    public static void main(String[] args){
        
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
        
    }
}
