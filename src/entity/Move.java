package entity;

public class Move {

    private int x;
    private int y;
    private int moveType;


    public Move(int x, int y, int moveType) {
        this.x = x;
        this.y = y;
        this.moveType = moveType;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getMoveType() {
        return moveType;
    }


}
