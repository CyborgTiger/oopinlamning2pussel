public class Piece {
    private int value;
    private int position;

    public Piece(int value, int position){
        this.value = value;
        this.position = position;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getPosition() {
        return position;
    }

    public int changePosition(int positionGoing){
        int positionComing = this.position;
        this.position = positionGoing;
        return positionComing;
    }
}
