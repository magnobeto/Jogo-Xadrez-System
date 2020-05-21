
package boardgame;
/**
 *
 * @author Roberto
 */
public class Piece {
    
    protected Position position;
    private Board board;
    
    public Piece(Board board){
        this.board = board;
        // a posição recebe NULL;
    }
    
    protected Board getBoard(){
        return board;
    }
}
