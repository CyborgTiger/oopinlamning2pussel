import java.util.ArrayList;
import java.util.Collections;

public class BackendGameBoard {

    public BackendGameBoard() {
        ArrayList<Piece> pieces = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            pieces.add(new Piece(i, 0));
        }
        Collections.shuffle(pieces);
        for (int i = 0; i < pieces.size(); i++) {
            pieces.get(i).setPosition(i);
        }
        System.out.println(pieces);
    }

    public void MovePiece(int positionFrom, int positionTo){

    }
}
