
package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

/**
 *
 * @author Roberto
 */
public class King extends ChessPiece {
    
    public King(Color color, Board board) {
        super(color, board);
    }
    
    @Override
    public String toString(){
        return "K";
    }
}
